package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.C22633m;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.cache.c */
public final class C22190c {

    /* renamed from: a */
    public final Map<String, C22191a> f57007a = new HashMap();

    /* renamed from: b */
    public final C22192b f57008b = new C22192b();

    /* renamed from: com.bumptech.glide.load.engine.cache.c$a */
    public static class C22191a {

        /* renamed from: a */
        public final Lock f57009a = new ReentrantLock();

        /* renamed from: b */
        public int f57010b;
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.c$b */
    public static class C22192b {

        /* renamed from: b */
        public static final int f57011b = 10;

        /* renamed from: a */
        public final Queue<C22191a> f57012a = new ArrayDeque();

        /* renamed from: a */
        public C22191a mo66030a() {
            C22191a poll;
            synchronized (this.f57012a) {
                poll = this.f57012a.poll();
            }
            if (poll == null) {
                return new C22191a();
            }
            return poll;
        }

        /* renamed from: b */
        public void mo66031b(C22191a aVar) {
            synchronized (this.f57012a) {
                if (this.f57012a.size() < 10) {
                    this.f57012a.offer(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo66028a(String str) {
        C22191a aVar;
        synchronized (this) {
            aVar = this.f57007a.get(str);
            if (aVar == null) {
                aVar = this.f57008b.mo66030a();
                this.f57007a.put(str, aVar);
            }
            aVar.f57010b++;
        }
        aVar.f57009a.lock();
    }

    /* renamed from: b */
    public void mo66029b(String str) {
        C22191a aVar;
        synchronized (this) {
            aVar = (C22191a) C22633m.m102624d(this.f57007a.get(str));
            int i = aVar.f57010b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f57010b = i2;
                if (i2 == 0) {
                    C22191a remove = this.f57007a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f57008b.mo66031b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f57010b);
            }
        }
        aVar.f57009a.unlock();
    }
}
