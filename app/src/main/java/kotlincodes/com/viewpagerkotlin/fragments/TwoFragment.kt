package kotlincodes.com.viewpagerkotlin.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.TextureView
import android.widget.TextView
import kotlincodes.com.viewpagerkotlin.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class TwoFragment : Fragment(){

    fun TwoFragment(){

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View? = inflater.inflate(R.layout.fragment_home, container, false);

        var textView: TextView =view!!.findViewById(R.id.text)
        textView!!.text="SECOND FRAGMENT"

        return view
    }


}