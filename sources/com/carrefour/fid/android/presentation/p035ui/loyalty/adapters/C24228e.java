package com.carrefour.fid.android.presentation.p035ui.loyalty.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36771n2;
import com.carrefour.fid.android.databinding.C36781o2;
import com.carrefour.fid.android.shared.constant.C28549i0;
import com.carrefour.fid.android.shared.extension.DateExtensionsKt;
import com.urbanairship.iam.events.C9175a;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.adapters.e */
public final class C24228e extends BaseExpandableListAdapter {

    /* renamed from: h */
    public static final int f60599h = 8;
    @C12579k

    /* renamed from: a */
    public final Context f60600a;
    @C12579k

    /* renamed from: b */
    public final C11300l<Integer, C11079d2> f60601b;
    @C12579k

    /* renamed from: c */
    public final C11300l<String, C11079d2> f60602c;
    @C12579k

    /* renamed from: d */
    public String f60603d;
    @C12579k

    /* renamed from: e */
    public HashMap<String, List<String>> f60604e;
    @C12579k

    /* renamed from: f */
    public List<String> f60605f;

    /* renamed from: g */
    public int f60606g;

    public C24228e(@C12579k Context context, @C12579k C11300l<? super Integer, C11079d2> lVar, @C12579k C11300l<? super String, C11079d2> lVar2, @C12579k String str, @C12579k HashMap<String, List<String>> hashMap, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(lVar, "collapseExpandableListView");
        Intrinsics.checkNotNullParameter(lVar2, "getCardOperation");
        Intrinsics.checkNotNullParameter(str, "headerTitle");
        Intrinsics.checkNotNullParameter(hashMap, "listChild");
        Intrinsics.checkNotNullParameter(list, "lastMonth");
        this.f60600a = context;
        this.f60601b = lVar;
        this.f60602c = lVar2;
        this.f60603d = str;
        this.f60604e = hashMap;
        this.f60605f = list;
    }

    /* renamed from: b */
    public static final void m106648b(C24228e eVar, String str, int i, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        Intrinsics.checkNotNullParameter(str, "$childText");
        HashMap<String, List<String>> hashMap = eVar.f60604e;
        hashMap.remove(eVar.f60603d);
        hashMap.put(str, eVar.f60605f);
        eVar.f60605f.add(eVar.f60606g, eVar.f60603d);
        eVar.f60606g = eVar.f60605f.indexOf(str);
        List<String> list = eVar.f60605f;
        Set<String> keySet = eVar.f60604e.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "listChild.keys");
        list.remove(CollectionsKt___CollectionsKt.m40696u2(keySet));
        eVar.f60603d = str;
        eVar.f60602c.invoke(DateExtensionsKt.m118758d(str));
        eVar.f60601b.invoke(Integer.valueOf(i));
    }

    @C12579k
    /* renamed from: c */
    public final C11300l<Integer, C11079d2> mo70897c() {
        return this.f60601b;
    }

    @C12579k
    /* renamed from: d */
    public final Context mo70898d() {
        return this.f60600a;
    }

    @C12579k
    /* renamed from: e */
    public final C11300l<String, C11079d2> mo70899e() {
        return this.f60602c;
    }

    /* renamed from: f */
    public final void mo70900f(@C12579k String str, @C12579k HashMap<String, List<String>> hashMap, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, C28549i0.f69374H);
        Intrinsics.checkNotNullParameter(hashMap, "childs");
        Intrinsics.checkNotNullParameter(list, "monthList");
        list.remove(str);
        HashMap<String, List<String>> hashMap2 = this.f60604e;
        hashMap2.remove(this.f60603d);
        hashMap2.put(str, list);
        this.f60606g = 0;
        this.f60603d = str;
        this.f60604e = hashMap;
        this.f60605f = list;
        this.f60601b.invoke(0);
        notifyDataSetChanged();
    }

    @C12579k
    public Object getChild(int i, int i2) {
        String str;
        List list = this.f60604e.get(this.f60603d);
        if (list == null || (str = (String) list.get(i2)) == null) {
            return 0;
        }
        return str;
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    @C12579k
    public View getChildView(int i, int i2, boolean z, @C12580l View view, @C12580l ViewGroup viewGroup) {
        Object child = getChild(i, i2);
        Intrinsics.checkNotNull(child, "null cannot be cast to non-null type kotlin.String");
        String str = (String) child;
        C36781o2 d = C36781o2.m150853d(LayoutInflater.from(this.f60600a), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f…(context), parent, false)");
        d.f91421b.setText(str);
        d.f91421b.setOnClickListener(new C24227d(this, str, i));
        LinearLayout b = d.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public int getChildrenCount(int i) {
        List list = this.f60604e.get(this.f60603d);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @C12579k
    public Object getGroup(int i) {
        return this.f60603d;
    }

    public int getGroupCount() {
        return 1;
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    @C12579k
    public View getGroupView(int i, boolean z, @C12580l View view, @C12580l ViewGroup viewGroup) {
        int i2;
        Object group = getGroup(i);
        Intrinsics.checkNotNull(group, "null cannot be cast to non-null type kotlin.String");
        C36771n2 d = C36771n2.m150813d(LayoutInflater.from(this.f60600a), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f…m(context), parent,false)");
        d.f91358c.setText((String) group);
        List<String> list = this.f60605f;
        Set<String> keySet = this.f60604e.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "listChild.keys");
        list.remove(CollectionsKt___CollectionsKt.m40696u2(keySet));
        ImageView imageView = d.f91357b;
        if (z) {
            i2 = R.drawable.arrow_picker_up;
        } else {
            i2 = R.drawable.checkout_arrow_picker;
        }
        imageView.setImageResource(i2);
        RelativeLayout b = d.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
