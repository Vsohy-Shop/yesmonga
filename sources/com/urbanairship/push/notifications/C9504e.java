package com.urbanairship.push.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0324b1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17075f2;
import androidx.core.text.C17907c;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.NotificationProxyActivity;
import com.urbanairship.push.NotificationProxyReceiver;
import com.urbanairship.util.C9647e0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.urbanairship.push.notifications.e */
public class C9504e {

    /* renamed from: a */
    public final Bundle f25947a;

    /* renamed from: b */
    public final String f25948b;

    /* renamed from: c */
    public final int f25949c;

    /* renamed from: d */
    public final String f25950d;

    /* renamed from: e */
    public final boolean f25951e;

    /* renamed from: f */
    public final int f25952f;

    /* renamed from: g */
    public final String f25953g;

    /* renamed from: h */
    public final List<C9501d> f25954h;

    /* renamed from: com.urbanairship.push.notifications.e$b */
    public static class C9506b {

        /* renamed from: a */
        public final String f25955a;

        /* renamed from: b */
        public int f25956b = 0;

        /* renamed from: c */
        public int f25957c = 0;

        /* renamed from: d */
        public boolean f25958d = true;

        /* renamed from: e */
        public List<C9501d> f25959e;

        /* renamed from: f */
        public List<C17075f2.C17077b.C17079b> f25960f;

        /* renamed from: g */
        public String f25961g;

        /* renamed from: h */
        public String f25962h;

        public C9506b(@C0359n0 String str) {
            this.f25955a = str;
        }

        @C0359n0
        /* renamed from: h */
        public C9506b mo19301h(@C0359n0 C9501d dVar) {
            if (this.f25959e == null) {
                this.f25959e = new ArrayList();
            }
            this.f25959e.add(dVar);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9504e mo19302i() {
            Bundle bundle;
            if (this.f25960f != null) {
                C17075f2.C17077b.C17078a aVar = new C17075f2.C17077b.C17078a(this.f25957c, (CharSequence) null, (PendingIntent) null);
                for (C17075f2.C17077b.C17079b e : this.f25960f) {
                    aVar.mo51285e(e);
                }
                bundle = aVar.mo51283c().mo51272d();
            } else {
                bundle = new Bundle();
            }
            return new C9504e(this, bundle);
        }

        @C0359n0
        /* renamed from: j */
        public C9506b mo19303j(@C0359n0 C17075f2.C17077b.C17079b bVar) {
            if (this.f25960f == null) {
                this.f25960f = new ArrayList();
            }
            this.f25960f.add(bVar);
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C9506b mo19304k(@C0363p0 String str) {
            this.f25961g = str;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9506b mo19305l(@C0375v int i) {
            this.f25957c = i;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9506b mo19306m(@C0324b1 int i) {
            this.f25956b = i;
            this.f25962h = null;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9506b mo19307n(@C0363p0 String str) {
            this.f25956b = 0;
            this.f25962h = str;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9506b mo19308o(boolean z) {
            this.f25958d = z;
            return this;
        }
    }

    @C0359n0
    /* renamed from: i */
    public static C9506b m35627i(@C0359n0 String str) {
        return new C9506b(str);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public C17075f2.C17077b mo19293a(@C0359n0 Context context, @C0363p0 String str, @C0359n0 C9510g gVar) {
        int i;
        PendingIntent pendingIntent;
        String f = mo19298f(context);
        if (f == null) {
            f = "";
        }
        String str2 = this.f25953g;
        if (str2 == null) {
            str2 = f;
        }
        Intent putExtra = new Intent(C9537t.f26066F).addCategory(UUID.randomUUID().toString()).putExtra(C9537t.f26070J, gVar.mo19313a().mo19188v()).putExtra(C9537t.f26068H, gVar.mo19315c()).putExtra(C9537t.f26069I, gVar.mo19316d()).putExtra(C9537t.f26071K, this.f25948b).putExtra(C9537t.f26076P, str).putExtra(C9537t.f26072L, this.f25951e).putExtra(C9537t.f26075O, str2);
        if (this.f25954h == null) {
            i = 0;
        } else {
            i = C9647e0.f26435a;
        }
        if (this.f25951e) {
            putExtra.setClass(context, NotificationProxyActivity.class);
            pendingIntent = C9647e0.m36143b(context, 0, putExtra, i);
        } else {
            putExtra.setClass(context, NotificationProxyReceiver.class);
            pendingIntent = C9647e0.m36144c(context, 0, putExtra, i);
        }
        C17075f2.C17077b.C17078a a = new C17075f2.C17077b.C17078a(this.f25952f, (CharSequence) C17907c.m81482a(f, 0), pendingIntent).mo51281a(this.f25947a);
        List<C9501d> list = this.f25954h;
        if (list != null) {
            for (C9501d a2 : list) {
                a.mo51282b(a2.mo19282a(context));
            }
        }
        return a.mo51283c();
    }

    @C0363p0
    /* renamed from: b */
    public String mo19294b() {
        return this.f25953g;
    }

    @C0359n0
    /* renamed from: c */
    public Bundle mo19295c() {
        return new Bundle(this.f25947a);
    }

    @C0375v
    /* renamed from: d */
    public int mo19296d() {
        return this.f25952f;
    }

    @C0359n0
    /* renamed from: e */
    public String mo19297e() {
        return this.f25948b;
    }

    @C0363p0
    /* renamed from: f */
    public String mo19298f(@C0359n0 Context context) {
        String str = this.f25950d;
        if (str != null) {
            return str;
        }
        int i = this.f25949c;
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }

    @C0363p0
    /* renamed from: g */
    public List<C9501d> mo19299g() {
        if (this.f25954h == null) {
            return null;
        }
        return new ArrayList(this.f25954h);
    }

    /* renamed from: h */
    public boolean mo19300h() {
        return this.f25951e;
    }

    public C9504e(@C0359n0 C9506b bVar, @C0359n0 Bundle bundle) {
        this.f25948b = bVar.f25955a;
        this.f25949c = bVar.f25956b;
        this.f25950d = bVar.f25962h;
        this.f25952f = bVar.f25957c;
        this.f25953g = bVar.f25961g;
        this.f25951e = bVar.f25958d;
        this.f25954h = bVar.f25959e;
        this.f25947a = bundle;
    }
}
