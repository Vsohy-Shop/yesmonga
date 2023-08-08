package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.data.h */
public final class C40699h {
    @C40473a
    @C0359n0

    /* renamed from: a */
    public static final String f103679a = "next_page_token";
    @C40473a
    @C0359n0

    /* renamed from: b */
    public static final String f103680b = "prev_page_token";

    @C0359n0
    /* renamed from: a */
    public static <T, E extends C40701j<T>> ArrayList<T> m165621a(@C0359n0 C40692b<E> bVar) {
        ArrayList<T> arrayList = new ArrayList<>(bVar.getCount());
        try {
            for (E b : bVar) {
                arrayList.add(b.mo134185b());
            }
            return arrayList;
        } finally {
            bVar.close();
        }
    }

    /* renamed from: b */
    public static boolean m165622b(@C0359n0 C40692b<?> bVar) {
        return bVar != null && bVar.getCount() > 0;
    }

    /* renamed from: c */
    public static boolean m165623c(@C0359n0 C40692b<?> bVar) {
        Bundle metadata = bVar.getMetadata();
        if (metadata == null || metadata.getString(f103679a) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m165624d(@C0359n0 C40692b<?> bVar) {
        Bundle metadata = bVar.getMetadata();
        if (metadata == null || metadata.getString(f103680b) == null) {
            return false;
        }
        return true;
    }
}
