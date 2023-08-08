package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;

public enum SurfaceColors {
    SURFACE_0(C31076a.C31082f.m3_sys_elevation_level0),
    SURFACE_1(C31076a.C31082f.m3_sys_elevation_level1),
    SURFACE_2(C31076a.C31082f.m3_sys_elevation_level2),
    SURFACE_3(C31076a.C31082f.m3_sys_elevation_level3),
    SURFACE_4(C31076a.C31082f.m3_sys_elevation_level4),
    SURFACE_5(C31076a.C31082f.m3_sys_elevation_level5);
    
    private final int elevationResId;

    /* access modifiers changed from: public */
    SurfaceColors(@C0364q int i) {
        this.elevationResId = i;
    }

    @C0354l
    /* renamed from: g */
    public static int m126391g(@C0359n0 Context context, @C0366r float f) {
        return new C31333a(context).mo89547c(C31266s.m125951b(context, C31076a.C31079c.colorSurface, 0), f);
    }

    @C0354l
    /* renamed from: b */
    public int mo89544b(@C0359n0 Context context) {
        return m126391g(context, context.getResources().getDimension(this.elevationResId));
    }
}
