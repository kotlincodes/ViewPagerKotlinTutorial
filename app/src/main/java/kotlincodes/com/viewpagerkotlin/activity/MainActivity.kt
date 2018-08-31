package kotlincodes.com.viewpagerkotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotlincodes.com.viewpagerkotlin.R
import kotlincodes.com.viewpagerkotlin.ViewPagerAdapter.MyFragmentPagerAdapter
import kotlincodes.com.viewpagerkotlin.fragments.MyFrament

class MainActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        setupViewPager()
    }

    private fun initViews() {
        tabs = findViewById(R.id.tabs)
        viewpager = findViewById(R.id.viewpager)
    }

    private fun setupViewPager() {

        val adapter = MyFragmentPagerAdapter(getSupportFragmentManager())

        var firstFragmet: MyFrament = MyFrament.newInstance("First Fragment")
        var secondFragmet: MyFrament = MyFrament.newInstance("Second Fragment")
        var thirdFragmet: MyFrament = MyFrament.newInstance("Third Fragment")

        adapter.addFragment(firstFragmet, "ONE")
        adapter.addFragment(secondFragmet, "TWO")
        adapter.addFragment(thirdFragmet, "THREE")

        viewpager!!.adapter = adapter

        tabs!!.setupWithViewPager(viewpager)

    }
}
