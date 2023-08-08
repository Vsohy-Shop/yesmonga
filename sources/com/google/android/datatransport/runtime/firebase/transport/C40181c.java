package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.C32995a;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.firebase.transport.c */
public final class C40181c {

    /* renamed from: c */
    public static final C40181c f102433c = new C40182a().mo132816b();

    /* renamed from: a */
    public final String f102434a;

    /* renamed from: b */
    public final List<LogEventDropped> f102435b;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.c$a */
    public static final class C40182a {

        /* renamed from: a */
        public String f102436a = "";

        /* renamed from: b */
        public List<LogEventDropped> f102437b = new ArrayList();

        /* renamed from: a */
        public C40182a mo132815a(LogEventDropped logEventDropped) {
            this.f102437b.add(logEventDropped);
            return this;
        }

        /* renamed from: b */
        public C40181c mo132816b() {
            return new C40181c(this.f102436a, Collections.unmodifiableList(this.f102437b));
        }

        /* renamed from: c */
        public C40182a mo132817c(List<LogEventDropped> list) {
            this.f102437b = list;
            return this;
        }

        /* renamed from: d */
        public C40182a mo132818d(String str) {
            this.f102436a = str;
            return this;
        }
    }

    public C40181c(String str, List<LogEventDropped> list) {
        this.f102434a = str;
        this.f102435b = list;
    }

    /* renamed from: a */
    public static C40181c m163435a() {
        return f102433c;
    }

    /* renamed from: d */
    public static C40182a m163436d() {
        return new C40182a();
    }

    @C32995a.C32996a(name = "logEventDropped")
    @Protobuf(tag = 2)
    /* renamed from: b */
    public List<LogEventDropped> mo132813b() {
        return this.f102435b;
    }

    @Protobuf(tag = 1)
    /* renamed from: c */
    public String mo132814c() {
        return this.f102434a;
    }
}
