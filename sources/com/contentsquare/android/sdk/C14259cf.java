package com.contentsquare.android.sdk;

import java.util.LinkedList;

/* renamed from: com.contentsquare.android.sdk.cf */
public class C14259cf {
    /* renamed from: a */
    public static LinkedList<C14507le> m61353a(C14507le leVar) {
        LinkedList<C14507le> linkedList = new LinkedList<>();
        m61354b(leVar, linkedList);
        return linkedList;
    }

    /* renamed from: b */
    public static void m61354b(C14507le leVar, LinkedList<C14507le> linkedList) {
        linkedList.addFirst(leVar);
        for (C14507le b : leVar.mo35872x()) {
            m61354b(b, linkedList);
        }
    }
}
