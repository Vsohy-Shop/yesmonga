package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.storelocator.p048ui.customview.StoreHourDayCell;

/* renamed from: com.carrefour.fid.android.databinding.h8 */
public final class C36717h8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90981a;
    @C0359n0

    /* renamed from: b */
    public final StoreHourDayCell f90982b;
    @C0359n0

    /* renamed from: c */
    public final StoreHourDayCell f90983c;
    @C0359n0

    /* renamed from: d */
    public final StoreHourDayCell f90984d;
    @C0359n0

    /* renamed from: e */
    public final StoreHourDayCell f90985e;
    @C0359n0

    /* renamed from: f */
    public final StoreHourDayCell f90986f;
    @C0359n0

    /* renamed from: g */
    public final StoreHourDayCell f90987g;
    @C0359n0

    /* renamed from: h */
    public final StoreHourDayCell f90988h;

    public C36717h8(@C0359n0 LinearLayout linearLayout, @C0359n0 StoreHourDayCell storeHourDayCell, @C0359n0 StoreHourDayCell storeHourDayCell2, @C0359n0 StoreHourDayCell storeHourDayCell3, @C0359n0 StoreHourDayCell storeHourDayCell4, @C0359n0 StoreHourDayCell storeHourDayCell5, @C0359n0 StoreHourDayCell storeHourDayCell6, @C0359n0 StoreHourDayCell storeHourDayCell7) {
        this.f90981a = linearLayout;
        this.f90982b = storeHourDayCell;
        this.f90983c = storeHourDayCell2;
        this.f90984d = storeHourDayCell3;
        this.f90985e = storeHourDayCell4;
        this.f90986f = storeHourDayCell5;
        this.f90987g = storeHourDayCell6;
        this.f90988h = storeHourDayCell7;
    }

    @C0359n0
    /* renamed from: a */
    public static C36717h8 m150595a(@C0359n0 View view) {
        int i = R.id.fridayCell;
        StoreHourDayCell storeHourDayCell = (StoreHourDayCell) C20753c.m96463a(view, R.id.fridayCell);
        if (storeHourDayCell != null) {
            i = R.id.mondayCell;
            StoreHourDayCell storeHourDayCell2 = (StoreHourDayCell) C20753c.m96463a(view, R.id.mondayCell);
            if (storeHourDayCell2 != null) {
                i = R.id.saturdayCell;
                StoreHourDayCell storeHourDayCell3 = (StoreHourDayCell) C20753c.m96463a(view, R.id.saturdayCell);
                if (storeHourDayCell3 != null) {
                    i = R.id.sundayCell;
                    StoreHourDayCell storeHourDayCell4 = (StoreHourDayCell) C20753c.m96463a(view, R.id.sundayCell);
                    if (storeHourDayCell4 != null) {
                        i = R.id.thursdayCell;
                        StoreHourDayCell storeHourDayCell5 = (StoreHourDayCell) C20753c.m96463a(view, R.id.thursdayCell);
                        if (storeHourDayCell5 != null) {
                            i = R.id.tuesdayCell;
                            StoreHourDayCell storeHourDayCell6 = (StoreHourDayCell) C20753c.m96463a(view, R.id.tuesdayCell);
                            if (storeHourDayCell6 != null) {
                                i = R.id.wednesdayCell;
                                StoreHourDayCell storeHourDayCell7 = (StoreHourDayCell) C20753c.m96463a(view, R.id.wednesdayCell);
                                if (storeHourDayCell7 != null) {
                                    return new C36717h8((LinearLayout) view, storeHourDayCell, storeHourDayCell2, storeHourDayCell3, storeHourDayCell4, storeHourDayCell5, storeHourDayCell6, storeHourDayCell7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36717h8 m150596c(@C0359n0 LayoutInflater layoutInflater) {
        return m150597d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36717h8 m150597d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.store_hour_day_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150595a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90981a;
    }
}
