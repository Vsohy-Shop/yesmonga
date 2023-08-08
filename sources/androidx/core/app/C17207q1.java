package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.app.q1 */
public class C17207q1 {

    /* renamed from: a */
    public final String f45459a;

    /* renamed from: b */
    public CharSequence f45460b;

    /* renamed from: c */
    public String f45461c;

    /* renamed from: d */
    public boolean f45462d;

    /* renamed from: e */
    public List<C17112g1> f45463e;

    /* renamed from: androidx.core.app.q1$a */
    public static class C17208a {

        /* renamed from: a */
        public final C17207q1 f45464a;

        public C17208a(@C0359n0 String str) {
            this.f45464a = new C17207q1(str);
        }

        @C0359n0
        /* renamed from: a */
        public C17207q1 mo51653a() {
            return this.f45464a;
        }

        @C0359n0
        /* renamed from: b */
        public C17208a mo51654b(@C0363p0 String str) {
            this.f45464a.f45461c = str;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17208a mo51655c(@C0363p0 CharSequence charSequence) {
            this.f45464a.f45460b = charSequence;
            return this;
        }
    }

    public C17207q1(@C0359n0 String str) {
        this.f45463e = Collections.emptyList();
        this.f45459a = (String) C18001r.m81775l(str);
    }

    @C0359n0
    /* renamed from: a */
    public List<C17112g1> mo51645a() {
        return this.f45463e;
    }

    @C0376v0(26)
    /* renamed from: b */
    public final List<C17112g1> mo51646b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel a : list) {
            NotificationChannel a2 = C17177n1.m79429a(a);
            if (this.f45459a.equals(a2.getGroup())) {
                arrayList.add(new C17112g1(a2));
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: c */
    public String mo51647c() {
        return this.f45461c;
    }

    @C0359n0
    /* renamed from: d */
    public String mo51648d() {
        return this.f45459a;
    }

    @C0363p0
    /* renamed from: e */
    public CharSequence mo51649e() {
        return this.f45460b;
    }

    /* renamed from: f */
    public NotificationChannelGroup mo51650f() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        C17199p1.m79493a();
        NotificationChannelGroup a = C17190o1.m79480a(this.f45459a, this.f45460b);
        if (i >= 28) {
            a.setDescription(this.f45461c);
        }
        return a;
    }

    /* renamed from: g */
    public boolean mo51651g() {
        return this.f45462d;
    }

    @C0359n0
    /* renamed from: h */
    public C17208a mo51652h() {
        return new C17208a(this.f45459a).mo51655c(this.f45460b).mo51654b(this.f45461c);
    }

    @C0376v0(28)
    public C17207q1(@C0359n0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @C0376v0(26)
    public C17207q1(@C0359n0 NotificationChannelGroup notificationChannelGroup, @C0359n0 List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.f45460b = notificationChannelGroup.getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f45461c = notificationChannelGroup.getDescription();
        }
        if (i >= 28) {
            this.f45462d = notificationChannelGroup.isBlocked();
            this.f45463e = mo51646b(notificationChannelGroup.getChannels());
            return;
        }
        this.f45463e = mo51646b(list);
    }
}
