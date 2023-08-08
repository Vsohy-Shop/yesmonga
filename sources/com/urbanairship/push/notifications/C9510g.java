package com.urbanairship.push.notifications;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.push.PushMessage;

/* renamed from: com.urbanairship.push.notifications.g */
public class C9510g {

    /* renamed from: a */
    public final int f25965a;

    /* renamed from: b */
    public final boolean f25966b;

    /* renamed from: c */
    public final String f25967c;

    /* renamed from: d */
    public final String f25968d;

    /* renamed from: e */
    public final PushMessage f25969e;

    /* renamed from: com.urbanairship.push.notifications.g$b */
    public static class C9512b {

        /* renamed from: a */
        public int f25970a;

        /* renamed from: b */
        public boolean f25971b;

        /* renamed from: c */
        public String f25972c;

        /* renamed from: d */
        public String f25973d;

        /* renamed from: e */
        public final PushMessage f25974e;

        @C0359n0
        /* renamed from: f */
        public C9510g mo19318f() {
            return new C9510g(this);
        }

        @C0359n0
        /* renamed from: g */
        public C9512b mo19319g(@C0359n0 String str) {
            this.f25972c = str;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9512b mo19320h(@C0363p0 String str, int i) {
            this.f25973d = str;
            this.f25970a = i;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9512b mo19321i(boolean z) {
            this.f25971b = z;
            return this;
        }

        public C9512b(@C0359n0 PushMessage pushMessage) {
            this.f25970a = -1;
            this.f25972c = C9524n.f26024a;
            this.f25974e = pushMessage;
        }
    }

    @C0359n0
    /* renamed from: f */
    public static C9512b m35656f(@C0359n0 PushMessage pushMessage) {
        return new C9512b(pushMessage);
    }

    @C0359n0
    /* renamed from: a */
    public PushMessage mo19313a() {
        return this.f25969e;
    }

    @C0359n0
    /* renamed from: b */
    public String mo19314b() {
        return this.f25967c;
    }

    /* renamed from: c */
    public int mo19315c() {
        return this.f25965a;
    }

    @C0363p0
    /* renamed from: d */
    public String mo19316d() {
        return this.f25968d;
    }

    /* renamed from: e */
    public boolean mo19317e() {
        return this.f25966b;
    }

    public C9510g(@C0359n0 C9512b bVar) {
        this.f25965a = bVar.f25970a;
        this.f25967c = bVar.f25972c;
        this.f25966b = bVar.f25971b;
        this.f25969e = bVar.f25974e;
        this.f25968d = bVar.f25973d;
    }
}
