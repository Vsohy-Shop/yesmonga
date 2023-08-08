package com.google.mlkit.vision.common.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.inject.C33058b;
import com.google.mlkit.common.sdkinternal.C33947j;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@C40473a
/* renamed from: com.google.mlkit.vision.common.internal.g */
public class C34037g {

    /* renamed from: a */
    public final Map<Class<? extends C34039b<?>>, C33058b<? extends C34038a<?, ?>>> f82677a = new HashMap();

    @C40473a
    /* renamed from: com.google.mlkit.vision.common.internal.g$a */
    public interface C34038a<ResultT, OptionsT extends C34039b<ResultT>> {
        @RecentlyNonNull
        @C40473a
        /* renamed from: a */
        MobileVisionBase<ResultT> mo98994a(@RecentlyNonNull OptionsT optionst);
    }

    @C40473a
    /* renamed from: com.google.mlkit.vision.common.internal.g$b */
    public interface C34039b<ResultT> {
    }

    @C40473a
    /* renamed from: com.google.mlkit.vision.common.internal.g$c */
    public static class C34040c {

        /* renamed from: a */
        public final Class<? extends C34039b<?>> f82678a;

        /* renamed from: b */
        public final C33058b<? extends C34038a<?, ?>> f82679b;

        /* renamed from: c */
        public final int f82680c;

        @C40473a
        public <ResultT, OptionsT extends C34039b<ResultT>> C34040c(@RecentlyNonNull Class<? extends OptionsT> cls, @RecentlyNonNull C33058b<? extends C34038a<ResultT, OptionsT>> bVar, int i) {
            this.f82678a = cls;
            this.f82679b = bVar;
            this.f82680c = i;
        }

        /* renamed from: a */
        public final int mo98995a() {
            return this.f82680c;
        }

        /* renamed from: b */
        public final C33058b<? extends C34038a<?, ?>> mo98996b() {
            return this.f82679b;
        }

        /* renamed from: c */
        public final Class<? extends C34039b<?>> mo98997c() {
            return this.f82678a;
        }

        @C40473a
        public <ResultT, OptionsT extends C34039b<ResultT>> C34040c(@RecentlyNonNull Class<? extends OptionsT> cls, @RecentlyNonNull C33058b<? extends C34038a<ResultT, OptionsT>> bVar) {
            this(cls, bVar, 100);
        }
    }

    public C34037g(Set<C34040c> set) {
        HashMap hashMap = new HashMap();
        for (C34040c next : set) {
            Class<? extends C34039b<?>> c = next.mo98997c();
            if (!this.f82677a.containsKey(c) || next.mo98995a() >= ((Integer) C40843u.m166202l((Integer) hashMap.get(c))).intValue()) {
                this.f82677a.put(c, next.mo98996b());
                hashMap.put(c, Integer.valueOf(next.mo98995a()));
            }
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static synchronized C34037g m136950b() {
        C34037g gVar;
        synchronized (C34037g.class) {
            gVar = (C34037g) C33947j.m136584c().mo98717a(C34037g.class);
        }
        return gVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public <ResultT, OptionsT extends C34039b<ResultT>> MobileVisionBase<ResultT> mo98993a(@RecentlyNonNull OptionsT optionst) {
        return ((C34038a) ((C33058b) C40843u.m166202l(this.f82677a.get(optionst.getClass()))).get()).mo98994a(optionst);
    }
}
