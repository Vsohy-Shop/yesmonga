package com.google.firebase.components;

import com.google.firebase.events.C33029a;
import com.google.firebase.events.C33030b;
import java.util.Map;

/* renamed from: com.google.firebase.components.w */
public final /* synthetic */ class C32609w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f79109a;

    /* renamed from: b */
    public final /* synthetic */ C33029a f79110b;

    public /* synthetic */ C32609w(Map.Entry entry, C33029a aVar) {
        this.f79109a = entry;
        this.f79110b = aVar;
    }

    public final void run() {
        ((C33030b) this.f79109a.getKey()).mo94659a(this.f79110b);
    }
}
