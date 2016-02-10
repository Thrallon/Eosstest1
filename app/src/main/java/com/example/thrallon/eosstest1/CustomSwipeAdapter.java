package com.example.thrallon.eosstest1;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.thrallon.eosstest1.R.id.image_view;

/**
 * Created by Thrallon on 10/2/2016.
 */
public class CustomSwipeAdapter  extends PagerAdapter{
    private int[] image_resources = {R.drawable.d1,R.drawable.d2,R.drawable.d3};
    private Context ctx;


    public CustomSwipeAdapter(Context ctx){

        this.ctx=ctx;

    }
    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {


        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View item_view = layoutInflater.inflate(R.layout.swap_layout, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(image_view);
        TextView textView = (TextView) item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resources[position]);
        textView.setText("Image : "+position);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((LinearLayout)object);

    }
}
