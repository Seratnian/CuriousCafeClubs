package com.ccc_game.curiouscafeclubs;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
/*

        */
public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> parents;
    private List<String> children;

    public ExpandableListAdapter(Activity context, List<String> children, Map<String, List<String>> parents) {
        this.context = context;
        this.parents = parents;
        this.children = children;
    }

    public Object getChild(int groupPosition, int childPosition) {
        return parents.get(children.get(groupPosition)).get(childPosition);
    }

    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String laptop = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.expandable_list_children, null);
        }

        TextView item = (TextView) convertView.findViewById(R.id.childTitle);

        item.setText(laptop);
        return convertView;
    }

    public int getChildrenCount(int groupPosition) {
        return parents.get(children.get(groupPosition)).size();
    }

    public Object getGroup(int groupPosition) {
        return children.get(groupPosition);
    }

    public int getGroupCount() {
        return children.size();
    }

    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String laptopName = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.expandable_list_parent, null);
        }
        TextView item = (TextView) convertView.findViewById(R.id.parentTitle);
        item.setTypeface(null, Typeface.BOLD);
        item.setText(laptopName);
        return convertView;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}