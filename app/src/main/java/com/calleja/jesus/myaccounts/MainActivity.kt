package com.calleja.jesus.myaccounts

import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.MenuItem
import com.calleja.jesus.mylibrary.interfaces.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : ToolbarActivity() {

    private var prevBottomSelected: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewPager(getPagerAdapter())
        setUpBottomNavigationBar()

    }

    private fun getPagerAdapter(): PagerAdapter {
        val adapter = com.calleja.jesus.myaccounts.adapters.PagerAdapter(supportFragmentManager)
        return adapter
    }

    private fun setUpViewPager(adapter: PagerAdapter) {
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = adapter.count //Máx number of tabs in memory
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {}
            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {}
            override fun onPageSelected(position: Int) {
                if (prevBottomSelected == null) {
                    bottomNavigation.menu.getItem(0).isChecked = false
                } else {
                    prevBottomSelected!!.isChecked = false
                }
                bottomNavigation.menu.getItem(position).isChecked = true
                prevBottomSelected = bottomNavigation.menu.getItem(position)
            }
        })
    }

    private fun setUpBottomNavigationBar() {
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_nav_visible_accounts -> {
                    viewPager.currentItem = 0
                    true
                }
                R.id.bottom_nav_all_accounts -> {
                    viewPager.currentItem = 1
                    true
                }
                else -> false
            }
        }
    }
}


