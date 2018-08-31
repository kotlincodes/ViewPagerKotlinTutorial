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
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.provider.AlarmClock.EXTRA_MESSAGE


class MyFrament : Fragment() {
    companion object {
        fun newInstance(message: String): MyFrament {

            val f = MyFrament()

            val bdl = Bundle(1)

            bdl.putString(EXTRA_MESSAGE, message)

            f.setArguments(bdl)

            return f

        }
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View? = inflater.inflate(R.layout.fragment_home, container, false);

        val message = arguments!!.getString(EXTRA_MESSAGE)

        var textView: TextView = view!!.findViewById(R.id.text)
        textView!!.text = message

        return view
    }


}