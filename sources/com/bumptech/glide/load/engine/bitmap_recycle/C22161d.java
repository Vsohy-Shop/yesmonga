package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.C22176m;
import com.bumptech.glide.util.C22635o;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.d */
public abstract class C22161d<T extends C22176m> {

    /* renamed from: b */
    public static final int f56949b = 20;

    /* renamed from: a */
    public final Queue<T> f56950a = C22635o.m102631f(20);

    /* renamed from: a */
    public abstract T mo65948a();

    /* renamed from: b */
    public T mo65951b() {
        T t = (C22176m) this.f56950a.poll();
        if (t == null) {
            return mo65948a();
        }
        return t;
    }

    /* renamed from: c */
    public void mo65952c(T t) {
        if (this.f56950a.size() < 20) {
            this.f56950a.offer(t);
        }
    }
}
