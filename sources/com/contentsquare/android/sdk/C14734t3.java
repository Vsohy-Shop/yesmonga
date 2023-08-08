package com.contentsquare.android.sdk;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.contentsquare.android.sdk.t3 */
public final class C14734t3 {

    /* renamed from: com.contentsquare.android.sdk.t3$a */
    public static final class C14735a<T> extends C14869xe implements C14265d3<T> {

        /* renamed from: w */
        public final Queue<T> f36462w;

        public C14735a(Queue<T> queue) {
            this.f36462w = (Queue) C14169a3.m60808a(queue);
        }

        /* renamed from: b */
        public void mo34827b(T t) {
            boolean z;
            synchronized (this.f36462w) {
                z = this.f36462w.isEmpty() && this.f36462w.offer(t);
            }
            if (z) {
                mo36860g();
            }
        }

        /* renamed from: h */
        public void mo35377h() {
            synchronized (this.f36462w) {
                if (!this.f36462w.isEmpty()) {
                    mo36860g();
                }
            }
        }

        /* renamed from: k */
        public C14210b5<T> mo34977c() {
            T poll;
            boolean z;
            synchronized (this.f36462w) {
                poll = this.f36462w.poll();
                z = !this.f36462w.isEmpty();
            }
            if (z) {
                mo36860g();
            }
            return C14210b5.m60987b(poll);
        }
    }

    /* renamed from: a */
    public static <T> C14265d3<T> m63488a() {
        return m63489b(new ArrayDeque());
    }

    /* renamed from: b */
    public static <T> C14265d3<T> m63489b(Queue<T> queue) {
        return new C14735a((Queue) C14169a3.m60808a(queue));
    }
}
