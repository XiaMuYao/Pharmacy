package com.xiamuyao.pharmacy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xiamuyao.pharmacy.R;
import com.xiamuyao.pharmacy.bean.down.yaopinchaxundown;

import java.util.List;

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/20
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class yaopinxinxiAdapter extends RecyclerView.Adapter<yaopinxinxiAdapter.MyViewHodel> implements View.OnClickListener {
    private final Context mcontext;
    private List<yaopinchaxundown.ContentBean.TrackerBean> mTrackerBean;
    private OnItemClickListener mOnItemClickListener = null;

    public yaopinxinxiAdapter(List<yaopinchaxundown.ContentBean.TrackerBean> mTrackerBean, Context context) {
        this.mTrackerBean = mTrackerBean;
        this.mcontext = context;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHodel holder, int position) {
        //设置每一条位置
        holder.itemView.setTag(position);
        //View绑定数据
        holder.Action.setText(mTrackerBean.get(position).getAction());
        holder.TeminalName.setText(mTrackerBean.get(position).getTeminalName());
        holder.ActionTime.setText(mTrackerBean.get(position).getActionTime());

    }

    @Override
    public MyViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //如果嵌套 这里需要重写
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_yaopin, parent, false);
        view.setOnClickListener(this);
        return new MyViewHodel(view);
    }

    @Override
    public int getItemCount() {
        if (mTrackerBean == null) {
            return 0;
        }
        return mTrackerBean.size();
    }

    /**
     * 数据切换重新注入数据
     *
     * @param items
     */
    public void SetNewData(List<yaopinchaxundown.ContentBean.TrackerBean> items) {
        this.mTrackerBean = items;
        notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.OnItemClick(v, (Integer) v.getTag());
        }
    }

    /**
     * 外部对象
     *
     * @param listener
     */
    public void setItemOnClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public interface OnItemClickListener {
        void OnItemClick(View view, int position);
    }

    class MyViewHodel extends RecyclerView.ViewHolder {
        TextView Action, TeminalName, ActionTime;

        public MyViewHodel(View itemView) {
            super(itemView);
            ActionTime = itemView.findViewById(R.id.textView12);
            Action = itemView.findViewById(R.id.textView11);
            TeminalName = itemView.findViewById(R.id.textView15);
        }
    }
}