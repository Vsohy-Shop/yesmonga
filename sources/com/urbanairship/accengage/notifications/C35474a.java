package com.urbanairship.accengage.notifications;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.C0359n0;
import androidx.core.app.C17075f2;
import androidx.core.text.C17907c;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36059m;
import com.urbanairship.accengage.C35451b;
import com.urbanairship.accengage.C35453c;
import com.urbanairship.accengage.C35456e;
import com.urbanairship.push.notifications.C9504e;
import com.urbanairship.push.notifications.C9510g;
import com.urbanairship.push.notifications.C9527p;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.urbanairship.accengage.notifications.a */
public class C35474a implements C17075f2.C17097j {

    /* renamed from: a */
    public final Context f87415a;

    /* renamed from: b */
    public final AirshipConfigOptions f87416b;

    /* renamed from: c */
    public final C35451b f87417c;

    /* renamed from: d */
    public final C9510g f87418d;

    public C35474a(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0359n0 C35451b bVar, @C0359n0 C9510g gVar) {
        this.f87415a = context;
        this.f87416b = airshipConfigOptions;
        this.f87417c = bVar;
        this.f87418d = gVar;
    }

    /* renamed from: h */
    public static String m146303h(Context context) {
        return (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
    }

    @C0359n0
    /* renamed from: a */
    public C17075f2.C17092g mo19263a(@C0359n0 C17075f2.C17092g gVar) {
        boolean z;
        mo106293k(gVar);
        if (this.f87417c.mo106244D(this.f87415a) != 0) {
            mo106294l(gVar);
            z = false;
        } else {
            mo106292j(gVar);
            z = true;
        }
        if (this.f87417c.mo106258i(this.f87415a) != 0) {
            mo106295m(gVar);
        } else {
            if (!z) {
                mo106292j(gVar);
            }
            mo106297o(gVar);
        }
        return gVar;
    }

    /* renamed from: b */
    public final boolean mo106285b(@C0359n0 C17075f2.C17092g gVar) {
        C36059m.m148406b("Applying Accengage BigPictureStyle", new Object[0]);
        C17075f2.C17083d dVar = new C17075f2.C17083d();
        String g = this.f87417c.mo106256g();
        if (g == null) {
            C36059m.m148421q("AccengageNotificationExtender - No picture found", new Object[0]);
            return false;
        }
        try {
            Bitmap a = C9527p.m35735a(this.f87415a, new URL(g));
            if (a == null) {
                return false;
            }
            dVar.mo51309C(a);
            String f = this.f87417c.mo106255f();
            if (!TextUtils.isEmpty(f)) {
                dVar.mo51313H(C17907c.m81482a(f, 0));
            } else if (!TextUtils.isEmpty(this.f87417c.mo106262m())) {
                dVar.mo51313H(C17907c.m81482a(this.f87417c.mo106262m(), 0));
            }
            gVar.mo51425z0(dVar);
            return true;
        } catch (MalformedURLException e) {
            C36059m.m148411g(e, "AccengageNotificationExtender - Malformed big picture URL.", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public final void mo106286c(@C0359n0 C17075f2.C17092g gVar) {
        C36059m.m148406b("Applying Accengage BigTextStyle", new Object[0]);
        C17075f2.C17087e eVar = new C17075f2.C17087e();
        String f = this.f87417c.mo106255f();
        if (f != null) {
            eVar.mo51319A(C17907c.m81482a(f, 0));
        }
        String A = this.f87417c.mo106241A();
        if (!TextUtils.isEmpty(A)) {
            eVar.mo51321C(C17907c.m81482a(A, 0));
        }
        gVar.mo51425z0(eVar);
    }

    /* renamed from: d */
    public final RemoteViews mo106287d(@C0359n0 C17075f2.C17092g gVar, @C0359n0 RemoteViews remoteViews) {
        String str;
        gVar.mo51414t0(mo106291i());
        if (!this.f87417c.mo106245E().isEmpty()) {
            str = this.f87417c.mo106245E();
        } else {
            str = m146303h(this.f87415a);
        }
        remoteViews.setTextViewText(C35456e.C35464h.title, C17907c.m81482a(str, 0));
        int i = C35456e.C35464h.time;
        remoteViews.setViewVisibility(i, 0);
        remoteViews.setLong(i, "setTime", System.currentTimeMillis());
        String n = this.f87417c.mo106263n();
        if (!TextUtils.isEmpty(n)) {
            int i2 = C35456e.C35464h.info;
            remoteViews.setTextViewText(i2, C17907c.m81482a(n, 0));
            remoteViews.setViewVisibility(i2, 0);
        }
        mo106289f(remoteViews);
        return remoteViews;
    }

    /* renamed from: e */
    public final void mo106288e(@C0359n0 RemoteViews remoteViews) {
        String t = this.f87417c.mo106269t();
        if (t != null) {
            try {
                Bitmap a = C9527p.m35735a(this.f87415a, new URL(t));
                int i = C35456e.C35464h.icon;
                remoteViews.setImageViewBitmap(i, a);
                remoteViews.setViewPadding(i, 0, 0, 0, 0);
                remoteViews.setInt(i, "setBackgroundResource", 0);
            } catch (MalformedURLException e) {
                C36059m.m148411g(e, "AccengageNotificationExtender - Malformed large icon URL.", new Object[0]);
            }
            int i2 = C35456e.C35464h.right_icon;
            remoteViews.setViewVisibility(i2, 0);
            remoteViews.setImageViewResource(i2, mo106291i());
            RemoteViews remoteViews2 = remoteViews;
            int i3 = i2;
            mo106296n(remoteViews2, i3, false, -1, -1, PorterDuff.Mode.SRC_ATOP, -1);
            remoteViews.setInt(i2, "setBackgroundResource", C35456e.C35463g.accengage_notification_icon_legacy_bg);
            mo106296n(remoteViews2, i3, true, -1, mo106290g(), PorterDuff.Mode.SRC_ATOP, -1);
            return;
        }
        C36059m.m148419o("Large icon is not set, use default one", new Object[0]);
        int i4 = C35456e.C35464h.icon;
        remoteViews.setImageViewResource(i4, mo106291i());
        remoteViews.setInt(i4, "setBackgroundResource", C35456e.C35463g.accengage_notification_icon_legacy_bg);
        mo106296n(remoteViews, i4, true, -1, mo106290g(), PorterDuff.Mode.SRC_ATOP, -1);
        int dimensionPixelSize = this.f87415a.getResources().getDimensionPixelSize(C35456e.C35462f.accengage_notification_large_icon_circle_padding);
        remoteViews.setViewPadding(i4, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @TargetApi(24)
    /* renamed from: f */
    public final void mo106289f(@C0359n0 RemoteViews remoteViews) {
        int i = C35456e.C35464h.icon;
        remoteViews.setImageViewResource(i, mo106291i());
        RemoteViews remoteViews2 = remoteViews;
        int i2 = i;
        mo106296n(remoteViews2, i2, true, -1, -1, PorterDuff.Mode.SRC_ATOP, -1);
        mo106296n(remoteViews2, i2, false, -1, mo106290g(), PorterDuff.Mode.SRC_ATOP, -1);
        if (!TextUtils.isEmpty(this.f87417c.mo106254e())) {
            remoteViews.setTextViewText(C35456e.C35464h.app_name_text, m146303h(this.f87415a));
        }
        String r = this.f87417c.mo106267r();
        if (!TextUtils.isEmpty(r)) {
            int i3 = C35456e.C35464h.header_text;
            remoteViews.setViewVisibility(i3, 0);
            remoteViews.setTextViewText(i3, C17907c.m81482a(r, 0));
        }
        String n = this.f87417c.mo106263n();
        if (!TextUtils.isEmpty(n)) {
            remoteViews.setTextViewText(C35456e.C35464h.text_line_1, C17907c.m81482a(n, 0));
        }
        String t = this.f87417c.mo106269t();
        if (t != null) {
            try {
                Bitmap a = C9527p.m35735a(this.f87415a, new URL(t));
                int i4 = C35456e.C35464h.right_icon;
                remoteViews.setImageViewBitmap(i4, a);
                remoteViews.setViewVisibility(i4, 0);
            } catch (MalformedURLException e) {
                C36059m.m148411g(e, "AccengageNotificationExtender - Malformed large icon URL.", new Object[0]);
            }
        } else {
            C36059m.m148419o("Large icon is not set", new Object[0]);
        }
    }

    /* renamed from: g */
    public final int mo106290g() {
        return this.f87417c.mo106252c(this.f87416b.f87153z);
    }

    /* renamed from: i */
    public final int mo106291i() {
        int i = this.f87416b.f87151x;
        if (i != 0) {
            return this.f87417c.mo106274y(this.f87415a, i);
        }
        C35451b bVar = this.f87417c;
        Context context = this.f87415a;
        return bVar.mo106274y(context, context.getApplicationInfo().icon);
    }

    /* renamed from: j */
    public final void mo106292j(@C0359n0 C17075f2.C17092g gVar) {
        String str;
        C36059m.m148406b("Setting Accengage push collapsed fields", new Object[0]);
        if (!this.f87417c.mo106245E().isEmpty()) {
            str = this.f87417c.mo106245E();
        } else {
            str = m146303h(this.f87415a);
        }
        gVar.mo51364P(C17907c.m81482a(str, 0)).mo51358J(mo106290g()).mo51414t0(mo106291i());
        if (this.f87417c.mo106262m() != null) {
            gVar.mo51363O(C17907c.m81482a(this.f87417c.mo106262m(), 0)).mo51343B0(C17907c.m81482a(this.f87417c.mo106262m(), 0));
        }
        String n = this.f87417c.mo106263n();
        if (!TextUtils.isEmpty(n)) {
            try {
                gVar.mo51390h0(Integer.parseInt(n));
            } catch (NumberFormatException unused) {
                gVar.mo51361M(C17907c.m81482a(n, 0));
            }
        }
        if (this.f87417c.mo106275z() != null) {
            gVar.mo51341A0(C17907c.m81482a(this.f87417c.mo106275z(), 0));
        }
        String t = this.f87417c.mo106269t();
        if (t != null) {
            try {
                gVar.mo51380c0(C9527p.m35735a(this.f87415a, new URL(t)));
            } catch (MalformedURLException e) {
                C36059m.m148411g(e, "AccengageNotificationExtender - Malformed large icon URL.", new Object[0]);
            }
        }
    }

    /* renamed from: k */
    public final void mo106293k(@C0359n0 C17075f2.C17092g gVar) {
        int i;
        C36059m.m148406b("Setting Accengage push common fields", new Object[0]);
        gVar.mo51352G(this.f87417c.mo106260k()).mo51374Z(this.f87417c.mo106265p()).mo51378b0(this.f87417c.mo106266q()).mo51396k0(this.f87417c.mo106272w()).mo51382d0(-1, 1000, 3000).mo51346D(true);
        if (this.f87415a.getPackageManager().checkPermission("android.permission.VIBRATE", this.f87415a.getPackageName()) == 0) {
            i = 2;
        } else {
            i = 0;
        }
        String u = this.f87417c.mo106270u();
        if (!TextUtils.isEmpty(u)) {
            if (u.equalsIgnoreCase("none")) {
                C36059m.m148419o("No sound for this notification", new Object[0]);
            } else if (u.equalsIgnoreCase("default")) {
                i |= 1;
                C36059m.m148419o("Use default sound for this notification", new Object[0]);
            } else {
                int identifier = this.f87415a.getResources().getIdentifier(u, "raw", this.f87415a.getPackageName());
                if (identifier > 0) {
                    gVar.mo51423y0(Uri.parse("android.resource://" + this.f87415a.getPackageName() + "/" + identifier), 5);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Using ");
                    sb.append(u);
                    sb.append(" as notification sound");
                    C36059m.m148419o(sb.toString(), new Object[0]);
                } else {
                    i |= 1;
                    C36059m.m148421q("AccengageNotificationExtender - Could not find " + u + " in raw folder, will use default sound instead", new Object[0]);
                }
            }
        }
        gVar.mo51368T(i);
    }

    /* renamed from: l */
    public final void mo106294l(@C0359n0 C17075f2.C17092g gVar) {
        int D = this.f87417c.mo106244D(this.f87415a);
        C36059m.m148406b("Using collapsed custom template: " + this.f87417c.mo106243C(), new Object[0]);
        RemoteViews remoteViews = new RemoteViews(this.f87415a.getPackageName(), D);
        if (this.f87417c.mo106262m() != null) {
            remoteViews.setTextViewText(C35456e.C35464h.text, C17907c.m81482a(this.f87417c.mo106262m(), 0));
        }
        gVar.mo51366R(mo106287d(gVar, remoteViews));
        if (mo106298p()) {
            C36059m.m148419o("Apply decoration for collapsed template: " + this.f87417c.mo106243C(), new Object[0]);
            gVar.mo51425z0(new C17075f2.C17096i());
        }
    }

    /* renamed from: m */
    public final void mo106295m(@C0359n0 C17075f2.C17092g gVar) {
        int i = this.f87417c.mo106258i(this.f87415a);
        C36059m.m148406b("AccengageNotificationExtender - Using expanded custom template: " + this.f87417c.mo106257h(), new Object[0]);
        RemoteViews remoteViews = new RemoteViews(this.f87415a.getPackageName(), i);
        String f = this.f87417c.mo106255f();
        if (f != null) {
            remoteViews.setTextViewText(C35456e.C35464h.text, C17907c.m81482a(f, 0));
        }
        RemoteViews d = mo106287d(gVar, remoteViews);
        gVar.mo51365Q(d);
        String g = this.f87417c.mo106256g();
        if (g != null) {
            try {
                Bitmap a = C9527p.m35735a(this.f87415a, new URL(g));
                C36059m.m148419o("set big picture", new Object[0]);
                int i2 = C35456e.C35464h.big_picture;
                d.setImageViewBitmap(i2, a);
                d.setViewVisibility(i2, 0);
            } catch (MalformedURLException e) {
                C36059m.m148411g(e, "AccengageNotificationExtender - Malformed big picture URL.", new Object[0]);
            }
        } else {
            C36059m.m148421q("AccengageNotificationExtender - No picture found", new Object[0]);
        }
        gVar.mo51365Q(d);
        if (mo106298p()) {
            C36059m.m148419o("AccengageNotificationExtenderN - apply decoration for expanded template: " + this.f87417c.mo106257h(), new Object[0]);
            gVar.mo51425z0(new C17075f2.C17096i());
        }
    }

    @TargetApi(19)
    /* renamed from: n */
    public final void mo106296n(RemoteViews remoteViews, int i, boolean z, int i2, int i3, PorterDuff.Mode mode, int i4) {
        try {
            Class<?> cls = Class.forName("android.widget.RemoteViews");
            Class cls2 = Integer.TYPE;
            RemoteViews remoteViews2 = remoteViews;
            cls.getMethod("setDrawableParameters", new Class[]{cls2, Boolean.TYPE, cls2, cls2, PorterDuff.Mode.class, cls2}).invoke(remoteViews, new Object[]{Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), mode, Integer.valueOf(i4)});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C36059m.m148406b("Impossible to define custom push template icon", e);
        }
    }

    /* renamed from: o */
    public final void mo106297o(@C0359n0 C17075f2.C17092g gVar) {
        String h;
        C36059m.m148406b("Setting Accengage push expanded fields", new Object[0]);
        for (C35453c next : this.f87417c.mo106247G()) {
            C9504e.C9506b i = C9504e.m35627i(next.mo106281g());
            gVar.mo51377b(i.mo19304k("Accengage: " + next.mo106281g()).mo19305l(next.mo106279e(this.f87415a)).mo19307n(next.mo106283i()).mo19308o(next.mo106282h()).mo19302i().mo19293a(this.f87415a, (String) null, this.f87418d));
        }
        if (this.f87417c.mo106250K() && (h = this.f87417c.mo106257h()) != null) {
            if (h.equals(C35451b.f87343e)) {
                mo106286c(gVar);
            } else if (!h.equals(C35451b.f87344f)) {
                C36059m.m148421q("AccengageNotificationExtender - Unknown expanded default template: " + h, new Object[0]);
                mo106286c(gVar);
            } else if (!mo106285b(gVar)) {
                mo106286c(gVar);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo106298p() {
        if (C35451b.f87346h.equals(this.f87417c.mo106257h()) || C35451b.f87347i.equals(this.f87417c.mo106243C())) {
            return true;
        }
        return this.f87417c.mo106268s();
    }
}
