package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.f */
public abstract class C31920f {
    /* renamed from: a */
    public static C31920f m129485a(long j, Map<String, AssetPackState> map) {
        return new C31941j0(j, map);
    }

    /* renamed from: b */
    public static C31920f m129486b(Bundle bundle, C31998w0 w0Var) {
        return m129487c(bundle, w0Var, new ArrayList());
    }

    /* renamed from: c */
    public static C31920f m129487c(Bundle bundle, C31998w0 w0Var, List<String> list) {
        return m129489e(bundle, w0Var, list, C31900b0.f77800b);
    }

    /* renamed from: d */
    public static C31920f m129488d(Bundle bundle, C31998w0 w0Var, C31895a0 a0Var) {
        return m129489e(bundle, w0Var, new ArrayList(), a0Var);
    }

    /* renamed from: e */
    public static C31920f m129489e(Bundle bundle, C31998w0 w0Var, List<String> list, C31895a0 a0Var) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m129379e(bundle, str, w0Var, a0Var));
        }
        for (String next : list) {
            hashMap.put(next, AssetPackState.m129378d(next, 4, 0, 0, 0, 0.0d, 1, ""));
        }
        return m129485a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: f */
    public abstract Map<String, AssetPackState> mo92554f();

    /* renamed from: g */
    public abstract long mo92555g();
}
