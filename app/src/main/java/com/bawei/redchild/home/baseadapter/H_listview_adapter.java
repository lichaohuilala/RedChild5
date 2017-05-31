package com.bawei.redchild.home.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.redchild.R;
import com.bawei.redchild.home.bean.ChatMessage;

import java.text.SimpleDateFormat;
import java.util.List;

import static android.R.attr.type;
import static android.R.id.list;
import static com.umeng.socialize.utils.DeviceConfig.context;

/**
 * 类描述：
 * data:2017/5/25
 * author:高伟振(lenovo)
 */

public class H_listview_adapter extends BaseAdapter {
    private List<ChatMessage> mList;
    private Context mContext;
private int TIAO=0;
    private int TIAO1=1;
    public H_listview_adapter(List<ChatMessage>  list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        int i = position % 2;
        if (i == 0) {
            return TIAO;
        }else if (i ==1) {
            return TIAO1;
        }
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       int type= getItemViewType(position);
        ViewHolder view;
        ViewHolder2 view2;
        switch (type) {
            case 0:


                if (convertView == null) {
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listv1, null);
                    view = new ViewHolder();
                    view.tv1 = (TextView) convertView.findViewById(R.id.from_date);
                    view.tv2 = (TextView) convertView.findViewById(R.id.from_msg);
                    convertView.setTag(view);
                }else{
                    view= (ViewHolder) convertView.getTag();
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
                view.tv1.setText(sdf.format(mList.get(position).getDate()));
                view.tv2.setText(mList.get(position).getMsg());
                break;
            case 1:
                if (convertView == null) {
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listv2, null);
                    view2 = new ViewHolder2();
                    view2.tv3 = (TextView) convertView.findViewById(R.id.from_date2);
                    view2.tv4 = (TextView) convertView.findViewById(R.id.send_msg);
                    convertView.setTag(view2);
                }else{
                    view2= (ViewHolder2) convertView.getTag();
                }
                SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
                view2.tv3.setText(sdf1.format(mList.get(position).getDate()));
                view2.tv4.setText(mList.get(position).getMsg());
                break;
        }

        return convertView;
    }
    class ViewHolder{

        private TextView tv1,tv2;
    }
    class ViewHolder2{

        private TextView tv3,tv4;
    }
}
