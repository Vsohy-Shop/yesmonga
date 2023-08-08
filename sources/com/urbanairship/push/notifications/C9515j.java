package com.urbanairship.push.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.provider.Settings;
import android.util.Xml;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.browser.trusted.C0957i;
import androidx.browser.trusted.C0958j;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9648f;
import com.urbanairship.util.C9669o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.urbanairship.push.notifications.j */
public class C9515j implements C9333e {

    /* renamed from: E0 */
    public static final String f25975E0 = "can_bypass_dnd";

    /* renamed from: F0 */
    public static final String f25976F0 = "can_show_badge";

    /* renamed from: G0 */
    public static final String f25977G0 = "should_show_lights";

    /* renamed from: H0 */
    public static final String f25978H0 = "should_vibrate";

    /* renamed from: I0 */
    public static final String f25979I0 = "description";

    /* renamed from: J0 */
    public static final String f25980J0 = "group";

    /* renamed from: K0 */
    public static final String f25981K0 = "id";

    /* renamed from: L0 */
    public static final String f25982L0 = "importance";

    /* renamed from: M0 */
    public static final String f25983M0 = "light_color";

    /* renamed from: N0 */
    public static final String f25984N0 = "lockscreen_visibility";

    /* renamed from: O0 */
    public static final String f25985O0 = "name";

    /* renamed from: P0 */
    public static final String f25986P0 = "sound";

    /* renamed from: Q0 */
    public static final String f25987Q0 = "vibration_pattern";

    /* renamed from: Y */
    public static final int f25988Y = -1000;

    /* renamed from: Z */
    public static final String f25989Z = "NotificationChannel";

    /* renamed from: X */
    public long[] f25990X = null;

    /* renamed from: a */
    public boolean f25991a = false;

    /* renamed from: b */
    public boolean f25992b = true;

    /* renamed from: c */
    public boolean f25993c = false;

    /* renamed from: d */
    public boolean f25994d = false;

    /* renamed from: e */
    public String f25995e = null;

    /* renamed from: f */
    public String f25996f = null;

    /* renamed from: g */
    public final String f25997g;

    /* renamed from: v */
    public CharSequence f25998v;

    /* renamed from: w */
    public Uri f25999w = Settings.System.DEFAULT_NOTIFICATION_URI;

    /* renamed from: x */
    public int f26000x;

    /* renamed from: y */
    public int f26001y = 0;

    /* renamed from: z */
    public int f26002z = -1000;

    @C0376v0(api = 26)
    public C9515j(@C0359n0 NotificationChannel notificationChannel) {
        this.f25991a = notificationChannel.canBypassDnd();
        this.f25992b = notificationChannel.canShowBadge();
        this.f25993c = notificationChannel.shouldShowLights();
        this.f25994d = notificationChannel.shouldVibrate();
        this.f25995e = notificationChannel.getDescription();
        this.f25996f = notificationChannel.getGroup();
        this.f25997g = notificationChannel.getId();
        this.f25998v = notificationChannel.getName();
        this.f25999w = notificationChannel.getSound();
        this.f26000x = notificationChannel.getImportance();
        this.f26001y = notificationChannel.getLightColor();
        this.f26002z = notificationChannel.getLockscreenVisibility();
        this.f25990X = notificationChannel.getVibrationPattern();
    }

    @C0363p0
    /* renamed from: c */
    public static C9515j m35673c(@C0359n0 JsonValue jsonValue) {
        C9323b j = jsonValue.mo18767j();
        if (j != null) {
            String l = j.mo18801A("id").mo18769l();
            String l2 = j.mo18801A("name").mo18769l();
            int f = j.mo18801A("importance").mo18762f(-1);
            if (!(l == null || l2 == null || f == -1)) {
                C9515j jVar = new C9515j(l, l2, f);
                jVar.mo19341r(j.mo18801A(f25975E0).mo18757c(false));
                jVar.mo19349y(j.mo18801A(f25976F0).mo18757c(true));
                jVar.mo19326a(j.mo18801A(f25977G0).mo18757c(false));
                jVar.mo19327b(j.mo18801A(f25978H0).mo18757c(false));
                jVar.mo19342s(j.mo18801A("description").mo18769l());
                jVar.mo19343t(j.mo18801A("group").mo18769l());
                jVar.mo19346v(j.mo18801A(f25983M0).mo18762f(0));
                jVar.mo19347w(j.mo18801A(f25984N0).mo18762f(-1000));
                jVar.mo19348x(j.mo18801A("name").mo18750B());
                String l3 = j.mo18801A(f25986P0).mo18769l();
                if (!C9669o0.m36224e(l3)) {
                    jVar.mo19350z(Uri.parse(l3));
                }
                C9322a h = j.mo18801A(f25987Q0).mo18764h();
                if (h != null) {
                    long[] jArr = new long[h.size()];
                    for (int i = 0; i < h.size(); i++) {
                        jArr[i] = h.mo18791h(i).mo18766i(0);
                    }
                    jVar.mo19322A(jArr);
                }
                return jVar;
            }
        }
        C36059m.m148409e("Unable to deserialize notification channel: %s", jsonValue);
        return null;
    }

    /* JADX INFO: finally extract failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: d */
    public static List<C9515j> m35674d(@C0359n0 Context context, @C0351j1 int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            List<C9515j> p = m35675p(context, xml);
            xml.close();
            return p;
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to parse channels", new Object[0]);
            xml.close();
            return Collections.emptyList();
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: p */
    public static List<C9515j> m35675p(Context context, XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        ArrayList arrayList = new ArrayList();
        while (1 != xmlResourceParser.next()) {
            if (2 == xmlResourceParser.getEventType() && f25989Z.equals(xmlResourceParser.getName())) {
                C9648f fVar = new C9648f(context, Xml.asAttributeSet(xmlResourceParser));
                String d = fVar.mo19611d("name");
                String d2 = fVar.mo19611d("id");
                int c = fVar.mo19610c("importance", -1);
                if (C9669o0.m36224e(d) || C9669o0.m36224e(d2) || c == -1) {
                    C36059m.m148409e("Invalid notification channel. Missing name (%s), id (%s), or importance (%s)", d, d2, Integer.valueOf(c));
                } else {
                    C9515j jVar = new C9515j(d2, d, c);
                    jVar.mo19341r(fVar.mo19609b(f25975E0, false));
                    jVar.mo19349y(fVar.mo19609b(f25976F0, true));
                    jVar.mo19326a(fVar.mo19609b(f25977G0, false));
                    jVar.mo19327b(fVar.mo19609b(f25978H0, false));
                    jVar.mo19342s(fVar.mo19611d("description"));
                    jVar.mo19343t(fVar.mo19611d("group"));
                    jVar.mo19346v(fVar.mo19617j(f25983M0, 0));
                    jVar.mo19347w(fVar.mo19610c(f25984N0, -1000));
                    int g = fVar.mo19613g(f25986P0);
                    if (g != 0) {
                        jVar.mo19350z(Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + context.getResources().getResourceEntryName(g)));
                    } else {
                        String d3 = fVar.mo19611d(f25986P0);
                        if (!C9669o0.m36224e(d3)) {
                            jVar.mo19350z(Uri.parse(d3));
                        }
                    }
                    String d4 = fVar.mo19611d(f25987Q0);
                    if (!C9669o0.m36224e(d4)) {
                        String[] split = d4.split(",");
                        long[] jArr = new long[split.length];
                        for (int i = 0; i < split.length; i++) {
                            jArr[i] = Long.parseLong(split[i]);
                        }
                        jVar.mo19322A(jArr);
                    }
                    arrayList.add(jVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public void mo19322A(@C0363p0 long[] jArr) {
        this.f25990X = jArr;
    }

    /* renamed from: B */
    public boolean mo19323B() {
        return this.f25993c;
    }

    /* renamed from: C */
    public boolean mo19324C() {
        return this.f25994d;
    }

    @C0359n0
    @C0376v0(api = 26)
    /* renamed from: D */
    public NotificationChannel mo19325D() {
        C0958j.m4306a();
        NotificationChannel a = C0957i.m4305a(this.f25997g, this.f25998v, this.f26000x);
        a.setBypassDnd(this.f25991a);
        a.setShowBadge(this.f25992b);
        a.enableLights(this.f25993c);
        a.enableVibration(this.f25994d);
        a.setDescription(this.f25995e);
        a.setGroup(this.f25996f);
        a.setLightColor(this.f26001y);
        a.setVibrationPattern(this.f25990X);
        a.setLockscreenVisibility(this.f26002z);
        a.setSound(this.f25999w, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        return a;
    }

    /* renamed from: a */
    public void mo19326a(boolean z) {
        this.f25993c = z;
    }

    /* renamed from: b */
    public void mo19327b(boolean z) {
        this.f25994d = z;
    }

    /* renamed from: e */
    public boolean mo19328e() {
        return this.f25991a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9515j jVar = (C9515j) obj;
        if (this.f25991a != jVar.f25991a || this.f25992b != jVar.f25992b || this.f25993c != jVar.f25993c || this.f25994d != jVar.f25994d || this.f26000x != jVar.f26000x || this.f26001y != jVar.f26001y || this.f26002z != jVar.f26002z) {
            return false;
        }
        String str = this.f25995e;
        if (str == null ? jVar.f25995e != null : !str.equals(jVar.f25995e)) {
            return false;
        }
        String str2 = this.f25996f;
        if (str2 == null ? jVar.f25996f != null : !str2.equals(jVar.f25996f)) {
            return false;
        }
        String str3 = this.f25997g;
        if (str3 == null ? jVar.f25997g != null : !str3.equals(jVar.f25997g)) {
            return false;
        }
        CharSequence charSequence = this.f25998v;
        if (charSequence == null ? jVar.f25998v != null : !charSequence.equals(jVar.f25998v)) {
            return false;
        }
        Uri uri = this.f25999w;
        if (uri == null ? jVar.f25999w == null : uri.equals(jVar.f25999w)) {
            return Arrays.equals(this.f25990X, jVar.f25990X);
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public String mo19330f() {
        return this.f25995e;
    }

    @C0363p0
    /* renamed from: g */
    public String mo19331g() {
        return this.f25996f;
    }

    @C0359n0
    /* renamed from: h */
    public String mo19332h() {
        return this.f25997g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = (((((((this.f25991a ? 1 : 0) * true) + (this.f25992b ? 1 : 0)) * 31) + (this.f25993c ? 1 : 0)) * 31) + (this.f25994d ? 1 : 0)) * 31;
        String str = this.f25995e;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        String str2 = this.f25996f;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f25997g;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        CharSequence charSequence = this.f25998v;
        if (charSequence != null) {
            i4 = charSequence.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        Uri uri = this.f25999w;
        if (uri != null) {
            i6 = uri.hashCode();
        }
        return ((((((((i10 + i6) * 31) + this.f26000x) * 31) + this.f26001y) * 31) + this.f26002z) * 31) + Arrays.hashCode(this.f25990X);
    }

    /* renamed from: i */
    public int mo19334i() {
        return this.f26000x;
    }

    /* renamed from: j */
    public int mo19335j() {
        return this.f26001y;
    }

    /* renamed from: k */
    public int mo19336k() {
        return this.f26002z;
    }

    @C0359n0
    /* renamed from: l */
    public CharSequence mo19337l() {
        return this.f25998v;
    }

    /* renamed from: m */
    public boolean mo19338m() {
        return this.f25992b;
    }

    @C0363p0
    /* renamed from: n */
    public Uri mo19339n() {
        return this.f25999w;
    }

    @C0363p0
    /* renamed from: o */
    public long[] mo19340o() {
        return this.f25990X;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        String str;
        C9323b.C9325b j = C9323b.m35017y().mo18826j(f25975E0, Boolean.valueOf(mo19328e())).mo18826j(f25976F0, Boolean.valueOf(mo19338m())).mo18826j(f25977G0, Boolean.valueOf(mo19323B())).mo18826j(f25978H0, Boolean.valueOf(mo19324C())).mo18826j("description", mo19330f()).mo18826j("group", mo19331g()).mo18826j("id", mo19332h()).mo18826j("importance", Integer.valueOf(mo19334i())).mo18826j(f25983M0, Integer.valueOf(mo19335j())).mo18826j(f25984N0, Integer.valueOf(mo19336k())).mo18826j("name", mo19337l().toString());
        if (mo19339n() != null) {
            str = mo19339n().toString();
        } else {
            str = null;
        }
        return j.mo18826j(f25986P0, str).mo18826j(f25987Q0, JsonValue.m34975U(mo19340o())).mo18817a().mo17264q();
    }

    /* renamed from: r */
    public void mo19341r(boolean z) {
        this.f25991a = z;
    }

    /* renamed from: s */
    public void mo19342s(@C0363p0 String str) {
        this.f25995e = str;
    }

    /* renamed from: t */
    public void mo19343t(@C0363p0 String str) {
        this.f25996f = str;
    }

    @C0359n0
    public String toString() {
        return "NotificationChannelCompat{bypassDnd=" + this.f25991a + ", showBadge=" + this.f25992b + ", showLights=" + this.f25993c + ", shouldVibrate=" + this.f25994d + ", description='" + this.f25995e + '\'' + ", group='" + this.f25996f + '\'' + ", identifier='" + this.f25997g + '\'' + ", name=" + this.f25998v + ", sound=" + this.f25999w + ", importance=" + this.f26000x + ", lightColor=" + this.f26001y + ", lockscreenVisibility=" + this.f26002z + ", vibrationPattern=" + Arrays.toString(this.f25990X) + C12361b.f30259j;
    }

    /* renamed from: u */
    public void mo19345u(int i) {
        this.f26000x = i;
    }

    /* renamed from: v */
    public void mo19346v(int i) {
        this.f26001y = i;
    }

    /* renamed from: w */
    public void mo19347w(int i) {
        this.f26002z = i;
    }

    /* renamed from: x */
    public void mo19348x(@C0359n0 CharSequence charSequence) {
        this.f25998v = charSequence;
    }

    /* renamed from: y */
    public void mo19349y(boolean z) {
        this.f25992b = z;
    }

    /* renamed from: z */
    public void mo19350z(@C0363p0 Uri uri) {
        this.f25999w = uri;
    }

    public C9515j(@C0359n0 String str, @C0359n0 CharSequence charSequence, int i) {
        this.f25997g = str;
        this.f25998v = charSequence;
        this.f26000x = i;
    }
}
