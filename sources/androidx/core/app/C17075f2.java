package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import androidx.core.app.C17218r4;
import androidx.core.content.C17358m0;
import androidx.core.content.p026pm.C17428s0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C17897a;
import com.bumptech.glide.load.engine.GlideException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.core.app.f2 */
public class C17075f2 {
    @SuppressLint({"ActionValue"})

    /* renamed from: A */
    public static final String f45025A = "android.title";

    /* renamed from: A0 */
    public static final String f45026A0 = "transport";
    @SuppressLint({"ActionValue"})

    /* renamed from: B */
    public static final String f45027B = "android.title.big";

    /* renamed from: B0 */
    public static final String f45028B0 = "sys";
    @SuppressLint({"ActionValue"})

    /* renamed from: C */
    public static final String f45029C = "android.text";

    /* renamed from: C0 */
    public static final String f45030C0 = "service";
    @SuppressLint({"ActionValue"})

    /* renamed from: D */
    public static final String f45031D = "android.subText";

    /* renamed from: D0 */
    public static final String f45032D0 = "reminder";
    @SuppressLint({"ActionValue"})

    /* renamed from: E */
    public static final String f45033E = "android.remoteInputHistory";

    /* renamed from: E0 */
    public static final String f45034E0 = "recommendation";
    @SuppressLint({"ActionValue"})

    /* renamed from: F */
    public static final String f45035F = "android.infoText";

    /* renamed from: F0 */
    public static final String f45036F0 = "status";
    @SuppressLint({"ActionValue"})

    /* renamed from: G */
    public static final String f45037G = "android.summaryText";

    /* renamed from: G0 */
    public static final String f45038G0 = "workout";
    @SuppressLint({"ActionValue"})

    /* renamed from: H */
    public static final String f45039H = "android.bigText";

    /* renamed from: H0 */
    public static final String f45040H0 = "location_sharing";
    @SuppressLint({"ActionValue"})

    /* renamed from: I */
    public static final String f45041I = "android.icon";

    /* renamed from: I0 */
    public static final String f45042I0 = "stopwatch";
    @SuppressLint({"ActionValue"})

    /* renamed from: J */
    public static final String f45043J = "android.largeIcon";

    /* renamed from: J0 */
    public static final String f45044J0 = "missed_call";
    @SuppressLint({"ActionValue"})

    /* renamed from: K */
    public static final String f45045K = "android.largeIcon.big";

    /* renamed from: K0 */
    public static final int f45046K0 = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: L */
    public static final String f45047L = "android.progress";

    /* renamed from: L0 */
    public static final int f45048L0 = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: M */
    public static final String f45049M = "android.progressMax";

    /* renamed from: M0 */
    public static final int f45050M0 = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: N */
    public static final String f45051N = "android.progressIndeterminate";

    /* renamed from: N0 */
    public static final int f45052N0 = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: O */
    public static final String f45053O = "android.showChronometer";

    /* renamed from: O0 */
    public static final int f45054O0 = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: P */
    public static final String f45055P = "android.chronometerCountDown";

    /* renamed from: P0 */
    public static final int f45056P0 = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: Q */
    public static final String f45057Q = "android.colorized";

    /* renamed from: Q0 */
    public static final String f45058Q0 = "silent";
    @SuppressLint({"ActionValue"})

    /* renamed from: R */
    public static final String f45059R = "android.showWhen";

    /* renamed from: R0 */
    public static final int f45060R0 = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: S */
    public static final String f45061S = "android.picture";

    /* renamed from: S0 */
    public static final int f45062S0 = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: T */
    public static final String f45063T = "android.pictureIcon";

    /* renamed from: T0 */
    public static final int f45064T0 = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: U */
    public static final String f45065U = "android.pictureContentDescription";
    @SuppressLint({"ActionValue"})

    /* renamed from: V */
    public static final String f45066V = "android.showBigPictureWhenCollapsed";
    @SuppressLint({"ActionValue"})

    /* renamed from: W */
    public static final String f45067W = "android.textLines";
    @SuppressLint({"ActionValue"})

    /* renamed from: X */
    public static final String f45068X = "android.template";

    /* renamed from: Y */
    public static final String f45069Y = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})
    @Deprecated

    /* renamed from: Z */
    public static final String f45070Z = "android.people";
    @SuppressLint({"ActionValue"})

    /* renamed from: a */
    public static final String f45071a = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({"ActionValue"})

    /* renamed from: a0 */
    public static final String f45072a0 = "android.people.list";
    @SuppressLint({"ActionValue"})

    /* renamed from: b */
    public static final String f45073b = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: b0 */
    public static final String f45074b0 = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})

    /* renamed from: c */
    public static final String f45075c = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: c0 */
    public static final String f45076c0 = "android.mediaSession";
    @SuppressLint({"ActionValue"})

    /* renamed from: d */
    public static final String f45077d = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})

    /* renamed from: d0 */
    public static final String f45078d0 = "android.compactActions";
    @SuppressLint({"ActionValue"})

    /* renamed from: e */
    public static final String f45079e = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: e0 */
    public static final String f45080e0 = "android.selfDisplayName";

    /* renamed from: f */
    public static final int f45081f = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: f0 */
    public static final String f45082f0 = "android.messagingStyleUser";

    /* renamed from: g */
    public static final int f45083g = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: g0 */
    public static final String f45084g0 = "android.conversationTitle";

    /* renamed from: h */
    public static final int f45085h = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: h0 */
    public static final String f45086h0 = "android.messages";

    /* renamed from: i */
    public static final int f45087i = 4;
    @SuppressLint({"ActionValue"})

    /* renamed from: i0 */
    public static final String f45088i0 = "android.messages.historic";

    /* renamed from: j */
    public static final int f45089j = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: j0 */
    public static final String f45090j0 = "android.isGroupConversation";

    /* renamed from: k */
    public static final int f45091k = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: k0 */
    public static final String f45092k0 = "android.hiddenConversationTitle";

    /* renamed from: l */
    public static final int f45093l = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: l0 */
    public static final String f45094l0 = "android.audioContents";

    /* renamed from: m */
    public static final int f45095m = 4;
    @C0354l

    /* renamed from: m0 */
    public static final int f45096m0 = 0;

    /* renamed from: n */
    public static final int f45097n = 8;

    /* renamed from: n0 */
    public static final int f45098n0 = 1;

    /* renamed from: o */
    public static final int f45099o = 16;

    /* renamed from: o0 */
    public static final int f45100o0 = 0;

    /* renamed from: p */
    public static final int f45101p = 32;

    /* renamed from: p0 */
    public static final int f45102p0 = -1;

    /* renamed from: q */
    public static final int f45103q = 64;

    /* renamed from: q0 */
    public static final String f45104q0 = "call";
    @Deprecated

    /* renamed from: r */
    public static final int f45105r = 128;

    /* renamed from: r0 */
    public static final String f45106r0 = "navigation";

    /* renamed from: s */
    public static final int f45107s = 256;

    /* renamed from: s0 */
    public static final String f45108s0 = "msg";

    /* renamed from: t */
    public static final int f45109t = 512;

    /* renamed from: t0 */
    public static final String f45110t0 = "email";

    /* renamed from: u */
    public static final int f45111u = 4096;

    /* renamed from: u0 */
    public static final String f45112u0 = "event";

    /* renamed from: v */
    public static final int f45113v = 0;

    /* renamed from: v0 */
    public static final String f45114v0 = "promo";

    /* renamed from: w */
    public static final int f45115w = -1;

    /* renamed from: w0 */
    public static final String f45116w0 = "alarm";

    /* renamed from: x */
    public static final int f45117x = -2;

    /* renamed from: x0 */
    public static final String f45118x0 = "progress";

    /* renamed from: y */
    public static final int f45119y = 1;

    /* renamed from: y0 */
    public static final String f45120y0 = "social";

    /* renamed from: z */
    public static final int f45121z = 2;

    /* renamed from: z0 */
    public static final String f45122z0 = "err";

    /* renamed from: androidx.core.app.f2$b */
    public static class C17077b {

        /* renamed from: m */
        public static final int f45123m = 0;

        /* renamed from: n */
        public static final int f45124n = 1;

        /* renamed from: o */
        public static final int f45125o = 2;

        /* renamed from: p */
        public static final int f45126p = 3;

        /* renamed from: q */
        public static final int f45127q = 4;

        /* renamed from: r */
        public static final int f45128r = 5;

        /* renamed from: s */
        public static final int f45129s = 6;

        /* renamed from: t */
        public static final int f45130t = 7;

        /* renamed from: u */
        public static final int f45131u = 8;

        /* renamed from: v */
        public static final int f45132v = 9;

        /* renamed from: w */
        public static final int f45133w = 10;

        /* renamed from: x */
        public static final String f45134x = "android.support.action.showsUserInterface";

        /* renamed from: y */
        public static final String f45135y = "android.support.action.semanticAction";

        /* renamed from: a */
        public final Bundle f45136a;
        @C0363p0

        /* renamed from: b */
        public IconCompat f45137b;

        /* renamed from: c */
        public final C17230s5[] f45138c;

        /* renamed from: d */
        public final C17230s5[] f45139d;

        /* renamed from: e */
        public boolean f45140e;

        /* renamed from: f */
        public boolean f45141f;

        /* renamed from: g */
        public final int f45142g;

        /* renamed from: h */
        public final boolean f45143h;
        @Deprecated

        /* renamed from: i */
        public int f45144i;

        /* renamed from: j */
        public CharSequence f45145j;

        /* renamed from: k */
        public PendingIntent f45146k;

        /* renamed from: l */
        public boolean f45147l;

        /* renamed from: androidx.core.app.f2$b$a */
        public static final class C17078a {

            /* renamed from: a */
            public final IconCompat f45148a;

            /* renamed from: b */
            public final CharSequence f45149b;

            /* renamed from: c */
            public final PendingIntent f45150c;

            /* renamed from: d */
            public boolean f45151d;

            /* renamed from: e */
            public final Bundle f45152e;

            /* renamed from: f */
            public ArrayList<C17230s5> f45153f;

            /* renamed from: g */
            public int f45154g;

            /* renamed from: h */
            public boolean f45155h;

            /* renamed from: i */
            public boolean f45156i;

            /* renamed from: j */
            public boolean f45157j;

            public C17078a(@C0363p0 IconCompat iconCompat, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (C17230s5[]) null, true, 0, true, false, false);
            }

            @C0359n0
            @C0376v0(19)
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            /* renamed from: f */
            public static C17078a m78967f(@C0359n0 Notification.Action action) {
                C17078a aVar;
                if (action.getIcon() != null) {
                    aVar = new C17078a(IconCompat.m80390l(action.getIcon()), action.title, action.actionIntent);
                } else {
                    aVar = new C17078a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput e : remoteInputs) {
                        aVar.mo51282b(C17230s5.m79563e(e));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                aVar.f45151d = action.getAllowGeneratedReplies();
                if (i >= 28) {
                    aVar.mo51290k(action.getSemanticAction());
                }
                if (i >= 29) {
                    aVar.mo51289j(action.isContextual());
                }
                if (i >= 31) {
                    aVar.mo51288i(action.isAuthenticationRequired());
                }
                return aVar;
            }

            @C0359n0
            /* renamed from: a */
            public C17078a mo51281a(@C0363p0 Bundle bundle) {
                if (bundle != null) {
                    this.f45152e.putAll(bundle);
                }
                return this;
            }

            @C0359n0
            /* renamed from: b */
            public C17078a mo51282b(@C0363p0 C17230s5 s5Var) {
                if (this.f45153f == null) {
                    this.f45153f = new ArrayList<>();
                }
                if (s5Var != null) {
                    this.f45153f.add(s5Var);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.annotation.C0359n0
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.C17075f2.C17077b mo51283c() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.mo51284d()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.s5> r3 = r0.f45153f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.s5 r4 = (androidx.core.app.C17230s5) r4
                    boolean r5 = r4.mo51681r()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.s5[] r3 = new androidx.core.app.C17230s5[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.s5[] r1 = (androidx.core.app.C17230s5[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x005b
                L_0x004e:
                    int r1 = r2.size()
                    androidx.core.app.s5[] r1 = new androidx.core.app.C17230s5[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.s5[] r4 = (androidx.core.app.C17230s5[]) r4
                L_0x005b:
                    r10 = r4
                    androidx.core.app.f2$b r1 = new androidx.core.app.f2$b
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f45148a
                    java.lang.CharSequence r7 = r0.f45149b
                    android.app.PendingIntent r8 = r0.f45150c
                    android.os.Bundle r9 = r0.f45152e
                    boolean r12 = r0.f45151d
                    int r13 = r0.f45154g
                    boolean r14 = r0.f45155h
                    boolean r15 = r0.f45156i
                    boolean r2 = r0.f45157j
                    r5 = r1
                    r16 = r2
                    r5.<init>((androidx.core.graphics.drawable.IconCompat) r6, (java.lang.CharSequence) r7, (android.app.PendingIntent) r8, (android.os.Bundle) r9, (androidx.core.app.C17230s5[]) r10, (androidx.core.app.C17230s5[]) r11, (boolean) r12, (int) r13, (boolean) r14, (boolean) r15, (boolean) r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C17075f2.C17077b.C17078a.mo51283c():androidx.core.app.f2$b");
            }

            /* renamed from: d */
            public final void mo51284d() {
                if (this.f45156i && this.f45150c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @C0359n0
            /* renamed from: e */
            public C17078a mo51285e(@C0359n0 C17079b bVar) {
                bVar.mo51292a(this);
                return this;
            }

            @C0359n0
            /* renamed from: g */
            public Bundle mo51286g() {
                return this.f45152e;
            }

            @C0359n0
            /* renamed from: h */
            public C17078a mo51287h(boolean z) {
                this.f45151d = z;
                return this;
            }

            @C0359n0
            /* renamed from: i */
            public C17078a mo51288i(boolean z) {
                this.f45157j = z;
                return this;
            }

            @C0359n0
            /* renamed from: j */
            public C17078a mo51289j(boolean z) {
                this.f45156i = z;
                return this;
            }

            @C0359n0
            /* renamed from: k */
            public C17078a mo51290k(int i) {
                this.f45154g = i;
                return this;
            }

            @C0359n0
            /* renamed from: l */
            public C17078a mo51291l(boolean z) {
                this.f45155h = z;
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C17078a(int i, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m80401w((Resources) null, "", i) : null, charSequence, pendingIntent, new Bundle(), (C17230s5[]) null, true, 0, true, false, false);
            }

            public C17078a(@C0359n0 C17077b bVar) {
                this(bVar.mo51274f(), bVar.f45145j, bVar.f45146k, new Bundle(bVar.f45136a), bVar.mo51275g(), bVar.mo51270b(), bVar.mo51276h(), bVar.f45141f, bVar.mo51280l(), bVar.mo51279k());
            }

            public C17078a(@C0363p0 IconCompat iconCompat, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent, @C0359n0 Bundle bundle, @C0363p0 C17230s5[] s5VarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                ArrayList<C17230s5> arrayList;
                this.f45151d = true;
                this.f45155h = true;
                this.f45148a = iconCompat;
                this.f45149b = C17092g.m79046A(charSequence);
                this.f45150c = pendingIntent;
                this.f45152e = bundle;
                if (s5VarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(s5VarArr));
                }
                this.f45153f = arrayList;
                this.f45151d = z;
                this.f45154g = i;
                this.f45155h = z2;
                this.f45156i = z3;
                this.f45157j = z4;
            }
        }

        /* renamed from: androidx.core.app.f2$b$b */
        public interface C17079b {
            @C0359n0
            /* renamed from: a */
            C17078a mo51292a(@C0359n0 C17078a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.core.app.f2$b$c */
        public @interface C17080c {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C17077b(int i, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m80401w((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        @C0363p0
        /* renamed from: a */
        public PendingIntent mo51269a() {
            return this.f45146k;
        }

        /* renamed from: b */
        public boolean mo51270b() {
            return this.f45140e;
        }

        @C0363p0
        /* renamed from: c */
        public C17230s5[] mo51271c() {
            return this.f45139d;
        }

        @C0359n0
        /* renamed from: d */
        public Bundle mo51272d() {
            return this.f45136a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo51273e() {
            return this.f45144i;
        }

        @C0363p0
        /* renamed from: f */
        public IconCompat mo51274f() {
            int i;
            if (this.f45137b == null && (i = this.f45144i) != 0) {
                this.f45137b = IconCompat.m80401w((Resources) null, "", i);
            }
            return this.f45137b;
        }

        @C0363p0
        /* renamed from: g */
        public C17230s5[] mo51275g() {
            return this.f45138c;
        }

        /* renamed from: h */
        public int mo51276h() {
            return this.f45142g;
        }

        /* renamed from: i */
        public boolean mo51277i() {
            return this.f45141f;
        }

        @C0363p0
        /* renamed from: j */
        public CharSequence mo51278j() {
            return this.f45145j;
        }

        /* renamed from: k */
        public boolean mo51279k() {
            return this.f45147l;
        }

        /* renamed from: l */
        public boolean mo51280l() {
            return this.f45143h;
        }

        /* renamed from: androidx.core.app.f2$b$d */
        public static final class C17081d implements C17079b {

            /* renamed from: e */
            public static final String f45158e = "android.wearable.EXTENSIONS";

            /* renamed from: f */
            public static final String f45159f = "flags";

            /* renamed from: g */
            public static final String f45160g = "inProgressLabel";

            /* renamed from: h */
            public static final String f45161h = "confirmLabel";

            /* renamed from: i */
            public static final String f45162i = "cancelLabel";

            /* renamed from: j */
            public static final int f45163j = 1;

            /* renamed from: k */
            public static final int f45164k = 2;

            /* renamed from: l */
            public static final int f45165l = 4;

            /* renamed from: m */
            public static final int f45166m = 1;

            /* renamed from: a */
            public int f45167a = 1;

            /* renamed from: b */
            public CharSequence f45168b;

            /* renamed from: c */
            public CharSequence f45169c;

            /* renamed from: d */
            public CharSequence f45170d;

            public C17081d() {
            }

            @C0359n0
            /* renamed from: a */
            public C17078a mo51292a(@C0359n0 C17078a aVar) {
                Bundle bundle = new Bundle();
                int i = this.f45167a;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                CharSequence charSequence = this.f45168b;
                if (charSequence != null) {
                    bundle.putCharSequence(f45160g, charSequence);
                }
                CharSequence charSequence2 = this.f45169c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f45161h, charSequence2);
                }
                CharSequence charSequence3 = this.f45170d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f45162i, charSequence3);
                }
                aVar.mo51286g().putBundle("android.wearable.EXTENSIONS", bundle);
                return aVar;
            }

            @C0359n0
            /* renamed from: b */
            public C17081d clone() {
                C17081d dVar = new C17081d();
                dVar.f45167a = this.f45167a;
                dVar.f45168b = this.f45168b;
                dVar.f45169c = this.f45169c;
                dVar.f45170d = this.f45170d;
                return dVar;
            }

            @C0363p0
            @Deprecated
            /* renamed from: c */
            public CharSequence mo51294c() {
                return this.f45170d;
            }

            @C0363p0
            @Deprecated
            /* renamed from: d */
            public CharSequence mo51296d() {
                return this.f45169c;
            }

            /* renamed from: e */
            public boolean mo51297e() {
                return (this.f45167a & 4) != 0;
            }

            /* renamed from: f */
            public boolean mo51298f() {
                return (this.f45167a & 2) != 0;
            }

            @C0363p0
            @Deprecated
            /* renamed from: g */
            public CharSequence mo51299g() {
                return this.f45168b;
            }

            /* renamed from: h */
            public boolean mo51300h() {
                return (this.f45167a & 1) != 0;
            }

            @C0359n0
            /* renamed from: i */
            public C17081d mo51301i(boolean z) {
                mo51304l(1, z);
                return this;
            }

            @C0359n0
            @Deprecated
            /* renamed from: j */
            public C17081d mo51302j(@C0363p0 CharSequence charSequence) {
                this.f45170d = charSequence;
                return this;
            }

            @C0359n0
            @Deprecated
            /* renamed from: k */
            public C17081d mo51303k(@C0363p0 CharSequence charSequence) {
                this.f45169c = charSequence;
                return this;
            }

            /* renamed from: l */
            public final void mo51304l(int i, boolean z) {
                if (z) {
                    this.f45167a = i | this.f45167a;
                    return;
                }
                this.f45167a = (~i) & this.f45167a;
            }

            @C0359n0
            /* renamed from: m */
            public C17081d mo51305m(boolean z) {
                mo51304l(4, z);
                return this;
            }

            @C0359n0
            /* renamed from: n */
            public C17081d mo51306n(boolean z) {
                mo51304l(2, z);
                return this;
            }

            @C0359n0
            @Deprecated
            /* renamed from: o */
            public C17081d mo51307o(@C0363p0 CharSequence charSequence) {
                this.f45168b = charSequence;
                return this;
            }

            public C17081d(@C0359n0 C17077b bVar) {
                Bundle bundle = bVar.mo51272d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f45167a = bundle.getInt("flags", 1);
                    this.f45168b = bundle.getCharSequence(f45160g);
                    this.f45169c = bundle.getCharSequence(f45161h);
                    this.f45170d = bundle.getCharSequence(f45162i);
                }
            }
        }

        public C17077b(@C0363p0 IconCompat iconCompat, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (C17230s5[]) null, (C17230s5[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C17077b(int i, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent, @C0363p0 Bundle bundle, @C0363p0 C17230s5[] s5VarArr, @C0363p0 C17230s5[] s5VarArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.m80401w((Resources) null, "", i) : null, charSequence, pendingIntent, bundle, s5VarArr, s5VarArr2, z, i2, z2, z3, z4);
        }

        public C17077b(@C0363p0 IconCompat iconCompat, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent, @C0363p0 Bundle bundle, @C0363p0 C17230s5[] s5VarArr, @C0363p0 C17230s5[] s5VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f45141f = true;
            this.f45137b = iconCompat;
            if (iconCompat != null && iconCompat.mo51930B() == 2) {
                this.f45144i = iconCompat.mo51947y();
            }
            this.f45145j = C17092g.m79046A(charSequence);
            this.f45146k = pendingIntent;
            this.f45136a = bundle == null ? new Bundle() : bundle;
            this.f45138c = s5VarArr;
            this.f45139d = s5VarArr2;
            this.f45140e = z;
            this.f45142g = i;
            this.f45141f = z2;
            this.f45143h = z3;
            this.f45147l = z4;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.f2$c */
    public @interface C17082c {
    }

    /* renamed from: androidx.core.app.f2$d */
    public static class C17083d extends C17105q {

        /* renamed from: j */
        public static final String f45171j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: e */
        public IconCompat f45172e;

        /* renamed from: f */
        public IconCompat f45173f;

        /* renamed from: g */
        public boolean f45174g;

        /* renamed from: h */
        public CharSequence f45175h;

        /* renamed from: i */
        public boolean f45176i;

        @C0376v0(16)
        /* renamed from: androidx.core.app.f2$d$a */
        public static class C17084a {
            private C17084a() {
            }

            @C0376v0(16)
            /* renamed from: a */
            public static void m79008a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @C0376v0(16)
            /* renamed from: b */
            public static void m79009b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @C0376v0(23)
        /* renamed from: androidx.core.app.f2$d$b */
        public static class C17085b {
            private C17085b() {
            }

            @C0376v0(23)
            /* renamed from: a */
            public static void m79010a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @C0376v0(31)
        /* renamed from: androidx.core.app.f2$d$c */
        public static class C17086c {
            private C17086c() {
            }

            @C0376v0(31)
            /* renamed from: a */
            public static void m79011a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                Notification.BigPictureStyle unused = bigPictureStyle.bigPicture(icon);
            }

            @C0376v0(31)
            /* renamed from: b */
            public static void m79012b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                Notification.BigPictureStyle unused = bigPictureStyle.setContentDescription(charSequence);
            }

            @C0376v0(31)
            /* renamed from: c */
            public static void m79013c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                Notification.BigPictureStyle unused = bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public C17083d() {
        }

        @C0363p0
        /* renamed from: A */
        public static IconCompat m78995A(@C0363p0 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.m80390l((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m80396r((Bitmap) parcelable);
            }
            return null;
        }

        @C0363p0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: E */
        public static IconCompat m78996E(@C0363p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(C17075f2.f45061S);
            if (parcelable != null) {
                return m78995A(parcelable);
            }
            return m78995A(bundle.getParcelable(C17075f2.f45063T));
        }

        @C0359n0
        /* renamed from: B */
        public C17083d mo51308B(@C0363p0 Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.m80396r(bitmap);
            }
            this.f45173f = iconCompat;
            this.f45174g = true;
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C17083d mo51309C(@C0363p0 Bitmap bitmap) {
            this.f45172e = bitmap == null ? null : IconCompat.m80396r(bitmap);
            return this;
        }

        @C0359n0
        @C0376v0(31)
        /* renamed from: D */
        public C17083d mo51310D(@C0363p0 Icon icon) {
            this.f45172e = IconCompat.m80390l(icon);
            return this;
        }

        @C0359n0
        /* renamed from: F */
        public C17083d mo51311F(@C0363p0 CharSequence charSequence) {
            this.f45300b = C17092g.m79046A(charSequence);
            return this;
        }

        @C0359n0
        @C0376v0(31)
        /* renamed from: G */
        public C17083d mo51312G(@C0363p0 CharSequence charSequence) {
            this.f45175h = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: H */
        public C17083d mo51313H(@C0363p0 CharSequence charSequence) {
            this.f45301c = C17092g.m79046A(charSequence);
            this.f45302d = true;
            return this;
        }

        @C0359n0
        @C0376v0(31)
        /* renamed from: I */
        public C17083d mo51314I(boolean z) {
            this.f45176i = z;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(f0Var.mo51268a()).setBigContentTitle(this.f45300b);
            IconCompat iconCompat = this.f45172e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (f0Var instanceof C17306z3) {
                        context = ((C17306z3) f0Var).mo51746f();
                    } else {
                        context = null;
                    }
                    C17086c.m79011a(bigContentTitle, this.f45172e.mo51939L(context));
                } else if (iconCompat.mo51930B() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f45172e.mo51946x());
                }
            }
            if (this.f45174g) {
                if (this.f45173f == null) {
                    C17084a.m79008a(bigContentTitle, (Bitmap) null);
                } else {
                    if (f0Var instanceof C17306z3) {
                        context2 = ((C17306z3) f0Var).mo51746f();
                    }
                    C17085b.m79010a(bigContentTitle, this.f45173f.mo51939L(context2));
                }
            }
            if (this.f45302d) {
                C17084a.m79009b(bigContentTitle, this.f45301c);
            }
            if (i >= 31) {
                C17086c.m79013c(bigContentTitle, this.f45176i);
                C17086c.m79012b(bigContentTitle, this.f45175h);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: g */
        public void mo51316g(@C0359n0 Bundle bundle) {
            super.mo51316g(bundle);
            bundle.remove(C17075f2.f45045K);
            bundle.remove(C17075f2.f45061S);
            bundle.remove(C17075f2.f45063T);
            bundle.remove(C17075f2.f45066V);
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: t */
        public String mo51317t() {
            return f45171j;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: y */
        public void mo51318y(@C0359n0 Bundle bundle) {
            super.mo51318y(bundle);
            if (bundle.containsKey(C17075f2.f45045K)) {
                this.f45173f = m78995A(bundle.getParcelable(C17075f2.f45045K));
                this.f45174g = true;
            }
            this.f45172e = m78996E(bundle);
            this.f45176i = bundle.getBoolean(C17075f2.f45066V);
        }

        public C17083d(@C0363p0 C17092g gVar) {
            mo51489z(gVar);
        }
    }

    /* renamed from: androidx.core.app.f2$e */
    public static class C17087e extends C17105q {

        /* renamed from: f */
        public static final String f45177f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: e */
        public CharSequence f45178e;

        public C17087e() {
        }

        @C0359n0
        /* renamed from: A */
        public C17087e mo51319A(@C0363p0 CharSequence charSequence) {
            this.f45178e = C17092g.m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: B */
        public C17087e mo51320B(@C0363p0 CharSequence charSequence) {
            this.f45300b = C17092g.m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C17087e mo51321C(@C0363p0 CharSequence charSequence) {
            this.f45301c = C17092g.m79046A(charSequence);
            this.f45302d = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo51322a(@C0359n0 Bundle bundle) {
            super.mo51322a(bundle);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(f0Var.mo51268a()).setBigContentTitle(this.f45300b).bigText(this.f45178e);
            if (this.f45302d) {
                bigText.setSummaryText(this.f45301c);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: g */
        public void mo51316g(@C0359n0 Bundle bundle) {
            super.mo51316g(bundle);
            bundle.remove(C17075f2.f45039H);
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: t */
        public String mo51317t() {
            return f45177f;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: y */
        public void mo51318y(@C0359n0 Bundle bundle) {
            super.mo51318y(bundle);
            this.f45178e = bundle.getCharSequence(C17075f2.f45039H);
        }

        public C17087e(@C0363p0 C17092g gVar) {
            mo51489z(gVar);
        }
    }

    /* renamed from: androidx.core.app.f2$f */
    public static final class C17088f {

        /* renamed from: h */
        public static final int f45179h = 1;

        /* renamed from: i */
        public static final int f45180i = 2;

        /* renamed from: a */
        public PendingIntent f45181a;

        /* renamed from: b */
        public PendingIntent f45182b;

        /* renamed from: c */
        public IconCompat f45183c;

        /* renamed from: d */
        public int f45184d;
        @C0364q

        /* renamed from: e */
        public int f45185e;

        /* renamed from: f */
        public int f45186f;

        /* renamed from: g */
        public String f45187g;

        @C0376v0(29)
        /* renamed from: androidx.core.app.f2$f$a */
        public static class C17089a {
            private C17089a() {
            }

            @C0363p0
            @C0376v0(29)
            /* renamed from: a */
            public static C17088f m79033a(@C0363p0 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                C17091c i = new C17091c(bubbleMetadata.getIntent(), IconCompat.m80390l(bubbleMetadata.getIcon())).mo51333b(bubbleMetadata.getAutoExpandBubble()).mo51334c(bubbleMetadata.getDeleteIntent()).mo51340i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    i.mo51335d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    i.mo51336e(bubbleMetadata.getDesiredHeightResId());
                }
                return i.mo51332a();
            }

            @C0363p0
            @C0376v0(29)
            /* renamed from: b */
            public static Notification.BubbleMetadata m79034b(@C0363p0 C17088f fVar) {
                if (fVar == null || fVar.mo51328g() == null) {
                    return null;
                }
                C17209q2.m79516a();
                Notification.BubbleMetadata.Builder a = C17200p2.m79494a().setIcon(fVar.mo51327f().mo51938K()).setIntent(fVar.mo51328g()).setDeleteIntent(fVar.mo51324c()).setAutoExpandBubble(fVar.mo51323b()).setSuppressNotification(fVar.mo51330i());
                if (fVar.mo51325d() != 0) {
                    Notification.BubbleMetadata.Builder unused = a.setDesiredHeight(fVar.mo51325d());
                }
                if (fVar.mo51326e() != 0) {
                    Notification.BubbleMetadata.Builder unused2 = a.setDesiredHeightResId(fVar.mo51326e());
                }
                return a.build();
            }
        }

        @C0376v0(30)
        /* renamed from: androidx.core.app.f2$f$b */
        public static class C17090b {
            private C17090b() {
            }

            @C0363p0
            @C0376v0(30)
            /* renamed from: a */
            public static C17088f m79035a(@C0363p0 Notification.BubbleMetadata bubbleMetadata) {
                C17091c cVar;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    cVar = new C17091c(bubbleMetadata.getShortcutId());
                } else {
                    cVar = new C17091c(bubbleMetadata.getIntent(), IconCompat.m80390l(bubbleMetadata.getIcon()));
                }
                cVar.mo51333b(bubbleMetadata.getAutoExpandBubble()).mo51334c(bubbleMetadata.getDeleteIntent()).mo51340i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.mo51335d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.mo51336e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.mo51332a();
            }

            @C0363p0
            @C0376v0(30)
            /* renamed from: b */
            public static Notification.BubbleMetadata m79036b(@C0363p0 C17088f fVar) {
                Notification.BubbleMetadata.Builder builder;
                if (fVar == null) {
                    return null;
                }
                if (fVar.mo51329h() != null) {
                    C17209q2.m79516a();
                    builder = C17048c3.m78858a(fVar.mo51329h());
                } else {
                    C17209q2.m79516a();
                    builder = C17037b3.m78784a(fVar.mo51328g(), fVar.mo51327f().mo51938K());
                }
                Notification.BubbleMetadata.Builder unused = builder.setDeleteIntent(fVar.mo51324c()).setAutoExpandBubble(fVar.mo51323b()).setSuppressNotification(fVar.mo51330i());
                if (fVar.mo51325d() != 0) {
                    Notification.BubbleMetadata.Builder unused2 = builder.setDesiredHeight(fVar.mo51325d());
                }
                if (fVar.mo51326e() != 0) {
                    Notification.BubbleMetadata.Builder unused3 = builder.setDesiredHeightResId(fVar.mo51326e());
                }
                return builder.build();
            }
        }

        /* renamed from: androidx.core.app.f2$f$c */
        public static final class C17091c {

            /* renamed from: a */
            public PendingIntent f45188a;

            /* renamed from: b */
            public IconCompat f45189b;

            /* renamed from: c */
            public int f45190c;
            @C0364q

            /* renamed from: d */
            public int f45191d;

            /* renamed from: e */
            public int f45192e;

            /* renamed from: f */
            public PendingIntent f45193f;

            /* renamed from: g */
            public String f45194g;

            @Deprecated
            public C17091c() {
            }

            @SuppressLint({"SyntheticAccessor"})
            @C0359n0
            /* renamed from: a */
            public C17088f mo51332a() {
                String str = this.f45194g;
                if (str == null && this.f45188a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (str == null && this.f45189b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    C17088f fVar = new C17088f(this.f45188a, this.f45193f, this.f45189b, this.f45190c, this.f45191d, this.f45192e, str);
                    fVar.mo51331j(this.f45192e);
                    return fVar;
                }
            }

            @C0359n0
            /* renamed from: b */
            public C17091c mo51333b(boolean z) {
                mo51337f(1, z);
                return this;
            }

            @C0359n0
            /* renamed from: c */
            public C17091c mo51334c(@C0363p0 PendingIntent pendingIntent) {
                this.f45193f = pendingIntent;
                return this;
            }

            @C0359n0
            /* renamed from: d */
            public C17091c mo51335d(@C0366r(unit = 0) int i) {
                this.f45190c = Math.max(i, 0);
                this.f45191d = 0;
                return this;
            }

            @C0359n0
            /* renamed from: e */
            public C17091c mo51336e(@C0364q int i) {
                this.f45191d = i;
                this.f45190c = 0;
                return this;
            }

            @C0359n0
            /* renamed from: f */
            public final C17091c mo51337f(int i, boolean z) {
                if (z) {
                    this.f45192e = i | this.f45192e;
                } else {
                    this.f45192e = (~i) & this.f45192e;
                }
                return this;
            }

            @C0359n0
            /* renamed from: g */
            public C17091c mo51338g(@C0359n0 IconCompat iconCompat) {
                if (this.f45194g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (iconCompat != null) {
                    this.f45189b = iconCompat;
                    return this;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            @C0359n0
            /* renamed from: h */
            public C17091c mo51339h(@C0359n0 PendingIntent pendingIntent) {
                if (this.f45194g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (pendingIntent != null) {
                    this.f45188a = pendingIntent;
                    return this;
                } else {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
            }

            @C0359n0
            /* renamed from: i */
            public C17091c mo51340i(boolean z) {
                mo51337f(2, z);
                return this;
            }

            @C0376v0(30)
            public C17091c(@C0359n0 String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f45194g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public C17091c(@C0359n0 PendingIntent pendingIntent, @C0359n0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (iconCompat != null) {
                    this.f45188a = pendingIntent;
                    this.f45189b = iconCompat;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }
        }

        @C0363p0
        /* renamed from: a */
        public static C17088f m79022a(@C0363p0 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C17090b.m79035a(bubbleMetadata);
            }
            if (i == 29) {
                return C17089a.m79033a(bubbleMetadata);
            }
            return null;
        }

        @C0363p0
        /* renamed from: k */
        public static Notification.BubbleMetadata m79023k(@C0363p0 C17088f fVar) {
            if (fVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C17090b.m79036b(fVar);
            }
            if (i == 29) {
                return C17089a.m79034b(fVar);
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo51323b() {
            return (this.f45186f & 1) != 0;
        }

        @C0363p0
        /* renamed from: c */
        public PendingIntent mo51324c() {
            return this.f45182b;
        }

        @C0366r(unit = 0)
        /* renamed from: d */
        public int mo51325d() {
            return this.f45184d;
        }

        @C0364q
        /* renamed from: e */
        public int mo51326e() {
            return this.f45185e;
        }

        @C0363p0
        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: f */
        public IconCompat mo51327f() {
            return this.f45183c;
        }

        @C0363p0
        @SuppressLint({"InvalidNullConversion"})
        /* renamed from: g */
        public PendingIntent mo51328g() {
            return this.f45181a;
        }

        @C0363p0
        /* renamed from: h */
        public String mo51329h() {
            return this.f45187g;
        }

        /* renamed from: i */
        public boolean mo51330i() {
            return (this.f45186f & 2) != 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: j */
        public void mo51331j(int i) {
            this.f45186f = i;
        }

        public C17088f(@C0363p0 PendingIntent pendingIntent, @C0363p0 PendingIntent pendingIntent2, @C0363p0 IconCompat iconCompat, int i, @C0364q int i2, int i3, @C0363p0 String str) {
            this.f45181a = pendingIntent;
            this.f45183c = iconCompat;
            this.f45184d = i;
            this.f45185e = i2;
            this.f45182b = pendingIntent2;
            this.f45186f = i3;
            this.f45187g = str;
        }
    }

    /* renamed from: androidx.core.app.f2$i */
    public static class C17096i extends C17105q {

        /* renamed from: e */
        public static final String f45274e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: f */
        public static final int f45275f = 3;

        /* renamed from: C */
        public static List<C17077b> m79154C(List<C17077b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (C17077b next : list) {
                if (!next.mo51280l()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: A */
        public final RemoteViews mo51444A(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i = 0;
            RemoteViews c = mo51479c(true, C16986a.C16993g.notification_template_custom_big, false);
            c.removeAllViews(C16986a.C16991e.actions);
            List<C17077b> C = m79154C(this.f45299a.f45221b);
            if (!z || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i2 = 0; i2 < min; i2++) {
                    c.addView(C16986a.C16991e.actions, mo51445B(C.get(i2)));
                }
            }
            if (!z2) {
                i = 8;
            }
            c.setViewVisibility(C16986a.C16991e.actions, i);
            c.setViewVisibility(C16986a.C16991e.action_divider, i);
            mo51481e(c, remoteViews);
            return c;
        }

        /* renamed from: B */
        public final RemoteViews mo51445B(C17077b bVar) {
            boolean z;
            int i;
            if (bVar.f45146k == null) {
                z = true;
            } else {
                z = false;
            }
            String packageName = this.f45299a.f45220a.getPackageName();
            if (z) {
                i = C16986a.C16993g.notification_action_tombstone;
            } else {
                i = C16986a.C16993g.notification_action;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat f = bVar.mo51274f();
            if (f != null) {
                remoteViews.setImageViewBitmap(C16986a.C16991e.action_image, mo51485o(f, this.f45299a.f45220a.getResources().getColor(C16986a.C16988b.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(C16986a.C16991e.action_text, bVar.f45145j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(C16986a.C16991e.action_container, bVar.f45146k);
            }
            remoteViews.setContentDescription(C16986a.C16991e.action_container, bVar.f45145j);
            return remoteViews;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            f0Var.mo51268a().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: r */
        public boolean mo51446r() {
            return true;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: t */
        public String mo51317t() {
            return f45274e;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: v */
        public RemoteViews mo51447v(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: w */
        public RemoteViews mo51448w(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: x */
        public RemoteViews mo51449x(C17073f0 f0Var) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.f2$j */
    public interface C17097j {
        @C0359n0
        /* renamed from: a */
        C17092g mo19263a(@C0359n0 C17092g gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.f2$k */
    public @interface C17098k {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.f2$n */
    public @interface C17102n {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.f2$o */
    public @interface C17103o {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.f2$p */
    public @interface C17104p {
    }

    /* renamed from: androidx.core.app.f2$q */
    public static abstract class C17105q {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: a */
        public C17092g f45299a;

        /* renamed from: b */
        public CharSequence f45300b;

        /* renamed from: c */
        public CharSequence f45301c;

        /* renamed from: d */
        public boolean f45302d = false;

        /* renamed from: h */
        public static float m79206h(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        @C0363p0
        /* renamed from: i */
        public static C17105q m79207i(@C0363p0 String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals(C17096i.f45274e)) {
                        c = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals(C17083d.f45171j)) {
                        c = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals(C17099l.f45276f)) {
                        c = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals(C17087e.f45177f)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals(C17100m.f45278j)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C17096i();
                case 1:
                    return new C17083d();
                case 2:
                    return new C17099l();
                case 3:
                    return new C17087e();
                case 4:
                    return new C17100m();
                default:
                    return null;
            }
        }

        @C0363p0
        /* renamed from: j */
        public static C17105q m79208j(@C0363p0 String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new C17083d();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new C17087e();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new C17099l();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new C17100m();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new C17096i();
            }
            return null;
        }

        @C0363p0
        /* renamed from: k */
        public static C17105q m79209k(@C0359n0 Bundle bundle) {
            C17105q i = m79207i(bundle.getString(C17075f2.f45069Y));
            if (i != null) {
                return i;
            }
            if (bundle.containsKey(C17075f2.f45080e0) || bundle.containsKey(C17075f2.f45082f0)) {
                return new C17100m();
            }
            if (bundle.containsKey(C17075f2.f45061S) || bundle.containsKey(C17075f2.f45063T)) {
                return new C17083d();
            }
            if (bundle.containsKey(C17075f2.f45039H)) {
                return new C17087e();
            }
            if (bundle.containsKey(C17075f2.f45067W)) {
                return new C17099l();
            }
            return m79208j(bundle.getString(C17075f2.f45068X));
        }

        @C0363p0
        /* renamed from: l */
        public static C17105q m79210l(@C0359n0 Bundle bundle) {
            C17105q k = m79209k(bundle);
            if (k == null) {
                return null;
            }
            try {
                k.mo51318y(bundle);
                return k;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @C0363p0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: s */
        public static C17105q m79211s(@C0359n0 Notification notification) {
            Bundle n = C17075f2.m78942n(notification);
            if (n == null) {
                return null;
            }
            return m79210l(n);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo51322a(@C0359n0 Bundle bundle) {
            if (this.f45302d) {
                bundle.putCharSequence(C17075f2.f45037G, this.f45301c);
            }
            CharSequence charSequence = this.f45300b;
            if (charSequence != null) {
                bundle.putCharSequence(C17075f2.f45027B, charSequence);
            }
            String t = mo51317t();
            if (t != null) {
                bundle.putString(C17075f2.f45069Y, t);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013d  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x018d  */
        @androidx.annotation.C0359n0
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews mo51479c(boolean r12, int r13, boolean r14) {
            /*
                r11 = this;
                androidx.core.app.f2$g r0 = r11.f45299a
                android.content.Context r0 = r0.f45220a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.f2$g r1 = r11.f45299a
                android.content.Context r1 = r1.f45220a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r13)
                androidx.core.app.f2$g r13 = r11.f45299a
                r13.mo51422y()
                androidx.core.app.f2$g r13 = r11.f45299a
                android.graphics.Bitmap r1 = r13.f45229j
                r8 = 0
                if (r1 == 0) goto L_0x005e
                int r13 = androidx.core.C16986a.C16991e.icon
                r7.setViewVisibility(r13, r8)
                androidx.core.app.f2$g r1 = r11.f45299a
                android.graphics.Bitmap r1 = r1.f45229j
                r7.setImageViewBitmap(r13, r1)
                if (r12 == 0) goto L_0x008f
                androidx.core.app.f2$g r12 = r11.f45299a
                android.app.Notification r12 = r12.f45216U
                int r12 = r12.icon
                if (r12 == 0) goto L_0x008f
                int r12 = androidx.core.C16986a.C16989c.notification_right_icon_size
                int r12 = r0.getDimensionPixelSize(r12)
                int r13 = androidx.core.C16986a.C16989c.notification_small_icon_background_padding
                int r13 = r0.getDimensionPixelSize(r13)
                int r13 = r13 * 2
                int r13 = r12 - r13
                androidx.core.app.f2$g r1 = r11.f45299a
                android.app.Notification r2 = r1.f45216U
                int r2 = r2.icon
                int r1 = r1.mo51409r()
                android.graphics.Bitmap r12 = r11.mo51487q(r2, r12, r13, r1)
                int r13 = androidx.core.C16986a.C16991e.right_icon
                r7.setImageViewBitmap(r13, r12)
                r7.setViewVisibility(r13, r8)
                goto L_0x008f
            L_0x005e:
                if (r12 == 0) goto L_0x008f
                android.app.Notification r12 = r13.f45216U
                int r12 = r12.icon
                if (r12 == 0) goto L_0x008f
                int r12 = androidx.core.C16986a.C16991e.icon
                r7.setViewVisibility(r12, r8)
                int r13 = androidx.core.C16986a.C16989c.notification_large_icon_width
                int r13 = r0.getDimensionPixelSize(r13)
                int r1 = androidx.core.C16986a.C16989c.notification_big_circle_margin
                int r1 = r0.getDimensionPixelSize(r1)
                int r13 = r13 - r1
                int r1 = androidx.core.C16986a.C16989c.notification_small_icon_size_as_large
                int r1 = r0.getDimensionPixelSize(r1)
                androidx.core.app.f2$g r2 = r11.f45299a
                android.app.Notification r3 = r2.f45216U
                int r3 = r3.icon
                int r2 = r2.mo51409r()
                android.graphics.Bitmap r13 = r11.mo51487q(r3, r13, r1, r2)
                r7.setImageViewBitmap(r12, r13)
            L_0x008f:
                androidx.core.app.f2$g r12 = r11.f45299a
                java.lang.CharSequence r12 = r12.f45224e
                if (r12 == 0) goto L_0x009a
                int r13 = androidx.core.C16986a.C16991e.title
                r7.setTextViewText(r13, r12)
            L_0x009a:
                androidx.core.app.f2$g r12 = r11.f45299a
                java.lang.CharSequence r12 = r12.f45225f
                r13 = 1
                if (r12 == 0) goto L_0x00a8
                int r1 = androidx.core.C16986a.C16991e.text
                r7.setTextViewText(r1, r12)
                r12 = r13
                goto L_0x00a9
            L_0x00a8:
                r12 = r8
            L_0x00a9:
                androidx.core.app.f2$g r1 = r11.f45299a
                java.lang.CharSequence r2 = r1.f45230k
                r9 = 8
                if (r2 == 0) goto L_0x00bc
                int r12 = androidx.core.C16986a.C16991e.info
                r7.setTextViewText(r12, r2)
                r7.setViewVisibility(r12, r8)
            L_0x00b9:
                r12 = r13
                r10 = r12
                goto L_0x00f6
            L_0x00bc:
                int r1 = r1.f45231l
                if (r1 <= 0) goto L_0x00f0
                int r12 = androidx.core.C16986a.C16992f.status_bar_notification_info_maxnum
                int r12 = r0.getInteger(r12)
                androidx.core.app.f2$g r1 = r11.f45299a
                int r1 = r1.f45231l
                if (r1 <= r12) goto L_0x00d8
                int r12 = androidx.core.C16986a.C16991e.info
                int r1 = androidx.core.C16986a.C16994h.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r12, r1)
                goto L_0x00ea
            L_0x00d8:
                java.text.NumberFormat r12 = java.text.NumberFormat.getIntegerInstance()
                int r1 = androidx.core.C16986a.C16991e.info
                androidx.core.app.f2$g r2 = r11.f45299a
                int r2 = r2.f45231l
                long r2 = (long) r2
                java.lang.String r12 = r12.format(r2)
                r7.setTextViewText(r1, r12)
            L_0x00ea:
                int r12 = androidx.core.C16986a.C16991e.info
                r7.setViewVisibility(r12, r8)
                goto L_0x00b9
            L_0x00f0:
                int r1 = androidx.core.C16986a.C16991e.info
                r7.setViewVisibility(r1, r9)
                r10 = r8
            L_0x00f6:
                androidx.core.app.f2$g r1 = r11.f45299a
                java.lang.CharSequence r1 = r1.f45237r
                if (r1 == 0) goto L_0x0116
                int r2 = androidx.core.C16986a.C16991e.text
                r7.setTextViewText(r2, r1)
                androidx.core.app.f2$g r1 = r11.f45299a
                java.lang.CharSequence r1 = r1.f45225f
                if (r1 == 0) goto L_0x0111
                int r2 = androidx.core.C16986a.C16991e.text2
                r7.setTextViewText(r2, r1)
                r7.setViewVisibility(r2, r8)
                r1 = r13
                goto L_0x0117
            L_0x0111:
                int r1 = androidx.core.C16986a.C16991e.text2
                r7.setViewVisibility(r1, r9)
            L_0x0116:
                r1 = r8
            L_0x0117:
                if (r1 == 0) goto L_0x0131
                if (r14 == 0) goto L_0x0127
                int r14 = androidx.core.C16986a.C16989c.notification_subtext_size
                int r14 = r0.getDimensionPixelSize(r14)
                float r14 = (float) r14
                int r0 = androidx.core.C16986a.C16991e.text
                r7.setTextViewTextSize(r0, r8, r14)
            L_0x0127:
                int r2 = androidx.core.C16986a.C16991e.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x0131:
                androidx.core.app.f2$g r14 = r11.f45299a
                long r0 = r14.mo51424z()
                r2 = 0
                int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r14 == 0) goto L_0x017d
                androidx.core.app.f2$g r14 = r11.f45299a
                boolean r14 = r14.f45234o
                if (r14 == 0) goto L_0x016c
                int r14 = androidx.core.C16986a.C16991e.chronometer
                r7.setViewVisibility(r14, r8)
                androidx.core.app.f2$g r0 = r11.f45299a
                long r0 = r0.mo51424z()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r14, r2, r0)
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r14, r0, r13)
                androidx.core.app.f2$g r0 = r11.f45299a
                boolean r0 = r0.f45235p
                if (r0 == 0) goto L_0x017e
                r7.setChronometerCountDown(r14, r0)
                goto L_0x017e
            L_0x016c:
                int r14 = androidx.core.C16986a.C16991e.time
                r7.setViewVisibility(r14, r8)
                androidx.core.app.f2$g r0 = r11.f45299a
                long r0 = r0.mo51424z()
                java.lang.String r2 = "setTime"
                r7.setLong(r14, r2, r0)
                goto L_0x017e
            L_0x017d:
                r13 = r10
            L_0x017e:
                int r14 = androidx.core.C16986a.C16991e.right_side
                if (r13 == 0) goto L_0x0184
                r13 = r8
                goto L_0x0185
            L_0x0184:
                r13 = r9
            L_0x0185:
                r7.setViewVisibility(r14, r13)
                int r13 = androidx.core.C16986a.C16991e.line3
                if (r12 == 0) goto L_0x018d
                goto L_0x018e
            L_0x018d:
                r8 = r9
            L_0x018e:
                r7.setViewVisibility(r13, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C17075f2.C17105q.mo51479c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @C0363p0
        /* renamed from: d */
        public Notification mo51480d() {
            C17092g gVar = this.f45299a;
            if (gVar != null) {
                return gVar.mo51389h();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: e */
        public void mo51481e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            mo51488u(remoteViews);
            int i = C16986a.C16991e.notification_main_column;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(C16986a.C16991e.notification_main_column_container, 0, mo51482f(), 0, 0);
        }

        /* renamed from: f */
        public final int mo51482f() {
            Resources resources = this.f45299a.f45220a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C16986a.C16989c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C16986a.C16989c.notification_top_pad_large_text);
            float h = (m79206h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - h) * ((float) dimensionPixelSize)) + (h * ((float) dimensionPixelSize2)));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: g */
        public void mo51316g(@C0359n0 Bundle bundle) {
            bundle.remove(C17075f2.f45037G);
            bundle.remove(C17075f2.f45027B);
            bundle.remove(C17075f2.f45069Y);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: m */
        public Bitmap mo51483m(int i, int i2) {
            return mo51484n(i, i2, 0);
        }

        /* renamed from: n */
        public final Bitmap mo51484n(int i, int i2, int i3) {
            return mo51486p(IconCompat.m80400v(this.f45299a.f45220a, i), i2, i3);
        }

        /* renamed from: o */
        public Bitmap mo51485o(@C0359n0 IconCompat iconCompat, int i) {
            return mo51486p(iconCompat, i, 0);
        }

        /* renamed from: p */
        public final Bitmap mo51486p(@C0359n0 IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable F = iconCompat.mo51933F(this.f45299a.f45220a);
            if (i2 == 0) {
                i3 = F.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = F.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            F.setBounds(0, 0, i3, i2);
            if (i != 0) {
                F.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            F.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* renamed from: q */
        public final Bitmap mo51487q(int i, int i2, int i3, int i4) {
            int i5 = C16986a.C16990d.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap n = mo51484n(i5, i4, i2);
            Canvas canvas = new Canvas(n);
            Drawable mutate = this.f45299a.f45220a.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: r */
        public boolean mo51446r() {
            return false;
        }

        @C0363p0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: t */
        public String mo51317t() {
            return null;
        }

        /* renamed from: u */
        public final void mo51488u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C16986a.C16991e.title, 8);
            remoteViews.setViewVisibility(C16986a.C16991e.text2, 8);
            remoteViews.setViewVisibility(C16986a.C16991e.text, 8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: v */
        public RemoteViews mo51447v(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: w */
        public RemoteViews mo51448w(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: x */
        public RemoteViews mo51449x(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: y */
        public void mo51318y(@C0359n0 Bundle bundle) {
            if (bundle.containsKey(C17075f2.f45037G)) {
                this.f45301c = bundle.getCharSequence(C17075f2.f45037G);
                this.f45302d = true;
            }
            this.f45300b = bundle.getCharSequence(C17075f2.f45027B);
        }

        /* renamed from: z */
        public void mo51489z(@C0363p0 C17092g gVar) {
            if (this.f45299a != gVar) {
                this.f45299a = gVar;
                if (gVar != null) {
                    gVar.mo51425z0(this);
                }
            }
        }
    }

    @C0363p0
    /* renamed from: A */
    public static String m78921A(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    @C0376v0(19)
    /* renamed from: B */
    public static boolean m78922B(@C0359n0 Notification notification) {
        return notification.extras.getBoolean(f45059R);
    }

    @C0363p0
    /* renamed from: C */
    public static String m78923C(@C0359n0 Notification notification) {
        return notification.getSortKey();
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: D */
    public static CharSequence m78924D(@C0359n0 Notification notification) {
        return notification.extras.getCharSequence(f45031D);
    }

    /* renamed from: E */
    public static long m78925E(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    @C0376v0(19)
    /* renamed from: F */
    public static boolean m78926F(@C0359n0 Notification notification) {
        return notification.extras.getBoolean(f45053O);
    }

    /* renamed from: G */
    public static int m78927G(@C0359n0 Notification notification) {
        return notification.visibility;
    }

    /* renamed from: H */
    public static boolean m78928H(@C0359n0 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @C0363p0
    /* renamed from: a */
    public static C17077b m78929a(@C0359n0 Notification notification, int i) {
        return m78930b(notification.actions[i]);
    }

    @C0359n0
    @C0376v0(20)
    /* renamed from: b */
    public static C17077b m78930b(@C0359n0 Notification.Action action) {
        C17230s5[] s5VarArr;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        Notification.Action action2 = action;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        boolean z3 = false;
        if (remoteInputs == null) {
            s5VarArr = null;
        } else {
            C17230s5[] s5VarArr2 = new C17230s5[remoteInputs.length];
            for (int i4 = 0; i4 < remoteInputs.length; i4++) {
                RemoteInput remoteInput = remoteInputs[i4];
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i3 = remoteInput.getEditChoicesBeforeSending();
                } else {
                    i3 = 0;
                }
                s5VarArr2[i4] = new C17230s5(resultKey, label, choices, allowFreeFormInput, i3, remoteInput.getExtras(), (Set<String>) null);
            }
            s5VarArr = s5VarArr2;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (action.getExtras().getBoolean(C17038b4.f44971c) || action.getAllowGeneratedReplies()) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = action.getExtras().getBoolean(C17077b.f45134x, true);
        if (i5 >= 28) {
            i = action.getSemanticAction();
        } else {
            i = action.getExtras().getInt(C17077b.f45135y, 0);
        }
        int i6 = i;
        if (i5 >= 29) {
            z2 = action.isContextual();
        } else {
            z2 = false;
        }
        if (i5 >= 31) {
            z3 = action.isAuthenticationRequired();
        }
        boolean z5 = z3;
        if (action.getIcon() == null && (i2 = action2.icon) != 0) {
            return new C17077b(i2, action2.title, action2.actionIntent, action.getExtras(), s5VarArr, (C17230s5[]) null, z, i6, z4, z2, z5);
        }
        if (action.getIcon() != null) {
            iconCompat = IconCompat.m80391m(action.getIcon());
        }
        return new C17077b(iconCompat, action2.title, action2.actionIntent, action.getExtras(), s5VarArr, (C17230s5[]) null, z, i6, z4, z2, z5);
    }

    /* renamed from: c */
    public static int m78931c(@C0359n0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m78932d(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m78933e(@C0359n0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    /* renamed from: f */
    public static int m78934f(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @C0363p0
    /* renamed from: g */
    public static C17088f m78935g(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C17088f.m79022a(notification.getBubbleMetadata());
        }
        return null;
    }

    @C0363p0
    /* renamed from: h */
    public static String m78936h(@C0359n0 Notification notification) {
        return notification.category;
    }

    @C0363p0
    /* renamed from: i */
    public static String m78937i(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    /* renamed from: j */
    public static int m78938j(@C0359n0 Notification notification) {
        return notification.color;
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: k */
    public static CharSequence m78939k(@C0359n0 Notification notification) {
        return notification.extras.getCharSequence(f45035F);
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: l */
    public static CharSequence m78940l(@C0359n0 Notification notification) {
        return notification.extras.getCharSequence(f45029C);
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: m */
    public static CharSequence m78941m(@C0359n0 Notification notification) {
        return notification.extras.getCharSequence(f45025A);
    }

    @C0363p0
    /* renamed from: n */
    public static Bundle m78942n(@C0359n0 Notification notification) {
        return notification.extras;
    }

    @C0363p0
    /* renamed from: o */
    public static String m78943o(@C0359n0 Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: p */
    public static int m78944p(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: q */
    public static boolean m78945q(@C0359n0 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @C0359n0
    @C0376v0(21)
    /* renamed from: r */
    public static List<C17077b> m78946r(@C0359n0 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(C17093h.f45246d);
        if (!(bundle2 == null || (bundle = bundle2.getBundle(C17093h.f45250h)) == null)) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(C17038b4.m78791g(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public static boolean m78947s(@C0359n0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @C0363p0
    /* renamed from: t */
    public static C17358m0 m78948t(@C0359n0 Notification notification) {
        LocusId a;
        if (Build.VERSION.SDK_INT < 29 || (a = notification.getLocusId()) == null) {
            return null;
        }
        return C17358m0.m79885d(a);
    }

    @C0359n0
    /* renamed from: u */
    public static Notification[] m78949u(@C0359n0 Bundle bundle, @C0359n0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    /* renamed from: v */
    public static boolean m78950v(@C0359n0 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    /* renamed from: w */
    public static boolean m78951w(@C0359n0 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @C0359n0
    /* renamed from: x */
    public static List<C17218r4> m78952x(@C0359n0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f45072a0);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C17218r4.m79526a(C17261u1.m79654a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(f45070Z);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String g : stringArray) {
                    arrayList.add(new C17218r4.C17221c().mo51673g(g).mo51667a());
                }
            }
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: y */
    public static Notification m78953y(@C0359n0 Notification notification) {
        return notification.publicVersion;
    }

    @C0363p0
    /* renamed from: z */
    public static CharSequence m78954z(@C0359n0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }

    /* renamed from: androidx.core.app.f2$h */
    public static final class C17093h implements C17097j {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: d */
        public static final String f45246d = "android.car.EXTENSIONS";

        /* renamed from: e */
        public static final String f45247e = "large_icon";

        /* renamed from: f */
        public static final String f45248f = "car_conversation";

        /* renamed from: g */
        public static final String f45249g = "app_color";
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: h */
        public static final String f45250h = "invisible_actions";

        /* renamed from: i */
        public static final String f45251i = "author";

        /* renamed from: j */
        public static final String f45252j = "text";

        /* renamed from: k */
        public static final String f45253k = "messages";

        /* renamed from: l */
        public static final String f45254l = "remote_input";

        /* renamed from: m */
        public static final String f45255m = "on_reply";

        /* renamed from: n */
        public static final String f45256n = "on_read";

        /* renamed from: o */
        public static final String f45257o = "participants";

        /* renamed from: p */
        public static final String f45258p = "timestamp";

        /* renamed from: a */
        public Bitmap f45259a;

        /* renamed from: b */
        public C17094a f45260b;

        /* renamed from: c */
        public int f45261c = 0;

        @Deprecated
        /* renamed from: androidx.core.app.f2$h$a */
        public static class C17094a {

            /* renamed from: a */
            public final String[] f45262a;

            /* renamed from: b */
            public final C17230s5 f45263b;

            /* renamed from: c */
            public final PendingIntent f45264c;

            /* renamed from: d */
            public final PendingIntent f45265d;

            /* renamed from: e */
            public final String[] f45266e;

            /* renamed from: f */
            public final long f45267f;

            /* renamed from: androidx.core.app.f2$h$a$a */
            public static class C17095a {

                /* renamed from: a */
                public final List<String> f45268a = new ArrayList();

                /* renamed from: b */
                public final String f45269b;

                /* renamed from: c */
                public C17230s5 f45270c;

                /* renamed from: d */
                public PendingIntent f45271d;

                /* renamed from: e */
                public PendingIntent f45272e;

                /* renamed from: f */
                public long f45273f;

                public C17095a(@C0359n0 String str) {
                    this.f45269b = str;
                }

                @C0359n0
                /* renamed from: a */
                public C17095a mo51439a(@C0363p0 String str) {
                    if (str != null) {
                        this.f45268a.add(str);
                    }
                    return this;
                }

                @C0359n0
                /* renamed from: b */
                public C17094a mo51440b() {
                    List<String> list = this.f45268a;
                    return new C17094a((String[]) list.toArray(new String[list.size()]), this.f45270c, this.f45272e, this.f45271d, new String[]{this.f45269b}, this.f45273f);
                }

                @C0359n0
                /* renamed from: c */
                public C17095a mo51441c(long j) {
                    this.f45273f = j;
                    return this;
                }

                @C0359n0
                /* renamed from: d */
                public C17095a mo51442d(@C0363p0 PendingIntent pendingIntent) {
                    this.f45271d = pendingIntent;
                    return this;
                }

                @C0359n0
                /* renamed from: e */
                public C17095a mo51443e(@C0363p0 PendingIntent pendingIntent, @C0363p0 C17230s5 s5Var) {
                    this.f45270c = s5Var;
                    this.f45272e = pendingIntent;
                    return this;
                }
            }

            public C17094a(@C0363p0 String[] strArr, @C0363p0 C17230s5 s5Var, @C0363p0 PendingIntent pendingIntent, @C0363p0 PendingIntent pendingIntent2, @C0363p0 String[] strArr2, long j) {
                this.f45262a = strArr;
                this.f45263b = s5Var;
                this.f45265d = pendingIntent2;
                this.f45264c = pendingIntent;
                this.f45266e = strArr2;
                this.f45267f = j;
            }

            /* renamed from: a */
            public long mo51432a() {
                return this.f45267f;
            }

            @C0363p0
            /* renamed from: b */
            public String[] mo51433b() {
                return this.f45262a;
            }

            @C0363p0
            /* renamed from: c */
            public String mo51434c() {
                String[] strArr = this.f45266e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @C0363p0
            /* renamed from: d */
            public String[] mo51435d() {
                return this.f45266e;
            }

            @C0363p0
            /* renamed from: e */
            public PendingIntent mo51436e() {
                return this.f45265d;
            }

            @C0363p0
            /* renamed from: f */
            public C17230s5 mo51437f() {
                return this.f45263b;
            }

            @C0363p0
            /* renamed from: g */
            public PendingIntent mo51438g() {
                return this.f45264c;
            }
        }

        public C17093h() {
        }

        @C0376v0(21)
        /* renamed from: b */
        public static Bundle m79133b(@C0359n0 C17094a aVar) {
            String str;
            Bundle bundle = new Bundle();
            if (aVar.mo51435d() == null || aVar.mo51435d().length <= 1) {
                str = null;
            } else {
                str = aVar.mo51435d()[0];
            }
            int length = aVar.mo51433b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i = 0; i < length; i++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.mo51433b()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            C17230s5 f = aVar.mo51437f();
            if (f != null) {
                bundle.putParcelable(f45254l, new RemoteInput.Builder(f.mo51680o()).setLabel(f.mo51679n()).setChoices(f.mo51676h()).setAllowFreeFormInput(f.mo51674f()).addExtras(f.mo51678m()).build());
            }
            bundle.putParcelable(f45255m, aVar.mo51438g());
            bundle.putParcelable(f45256n, aVar.mo51436e());
            bundle.putStringArray(f45257o, aVar.mo51435d());
            bundle.putLong("timestamp", aVar.mo51432a());
            return bundle;
        }

        @C0376v0(21)
        /* renamed from: f */
        public static C17094a m79134f(@C0363p0 Bundle bundle) {
            String[] strArr;
            boolean z;
            Bundle bundle2 = bundle;
            C17230s5 s5Var = null;
            if (bundle2 == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray("messages");
            int i = 0;
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                        break;
                    }
                    Parcelable parcelable = parcelableArray[i2];
                    if (!(parcelable instanceof Bundle)) {
                        break;
                    }
                    String string = ((Bundle) parcelable).getString("text");
                    strArr2[i2] = string;
                    if (string == null) {
                        break;
                    }
                    i2++;
                }
                z = false;
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable(f45256n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable(f45255m);
            RemoteInput remoteInput = (RemoteInput) bundle2.getParcelable(f45254l);
            String[] stringArray = bundle2.getStringArray(f45257o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i = remoteInput.getEditChoicesBeforeSending();
                }
                s5Var = new C17230s5(resultKey, label, choices, allowFreeFormInput, i, remoteInput.getExtras(), (Set<String>) null);
            }
            return new C17094a(strArr, s5Var, pendingIntent2, pendingIntent, stringArray, bundle2.getLong("timestamp"));
        }

        @C0359n0
        /* renamed from: a */
        public C17092g mo19263a(@C0359n0 C17092g gVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f45259a;
            if (bitmap != null) {
                bundle.putParcelable(f45247e, bitmap);
            }
            int i = this.f45261c;
            if (i != 0) {
                bundle.putInt(f45249g, i);
            }
            C17094a aVar = this.f45260b;
            if (aVar != null) {
                bundle.putBundle(f45248f, m79133b(aVar));
            }
            gVar.mo51413t().putBundle(f45246d, bundle);
            return gVar;
        }

        @C0354l
        /* renamed from: c */
        public int mo51426c() {
            return this.f45261c;
        }

        @C0363p0
        /* renamed from: d */
        public Bitmap mo51427d() {
            return this.f45259a;
        }

        @C0363p0
        @Deprecated
        /* renamed from: e */
        public C17094a mo51428e() {
            return this.f45260b;
        }

        @C0359n0
        /* renamed from: g */
        public C17093h mo51429g(@C0354l int i) {
            this.f45261c = i;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C17093h mo51430h(@C0363p0 Bitmap bitmap) {
            this.f45259a = bitmap;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: i */
        public C17093h mo51431i(@C0363p0 C17094a aVar) {
            this.f45260b = aVar;
            return this;
        }

        public C17093h(@C0359n0 Notification notification) {
            Bundle bundle;
            if (C17075f2.m78942n(notification) == null) {
                bundle = null;
            } else {
                bundle = C17075f2.m78942n(notification).getBundle(f45246d);
            }
            if (bundle != null) {
                this.f45259a = (Bitmap) bundle.getParcelable(f45247e);
                this.f45261c = bundle.getInt(f45249g, 0);
                this.f45260b = m79134f(bundle.getBundle(f45248f));
            }
        }
    }

    /* renamed from: androidx.core.app.f2$l */
    public static class C17099l extends C17105q {

        /* renamed from: f */
        public static final String f45276f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: e */
        public ArrayList<CharSequence> f45277e = new ArrayList<>();

        public C17099l() {
        }

        @C0359n0
        /* renamed from: A */
        public C17099l mo51450A(@C0363p0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f45277e.add(C17092g.m79046A(charSequence));
            }
            return this;
        }

        @C0359n0
        /* renamed from: B */
        public C17099l mo51451B(@C0363p0 CharSequence charSequence) {
            this.f45300b = C17092g.m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C17099l mo51452C(@C0363p0 CharSequence charSequence) {
            this.f45301c = C17092g.m79046A(charSequence);
            this.f45302d = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(f0Var.mo51268a()).setBigContentTitle(this.f45300b);
            if (this.f45302d) {
                bigContentTitle.setSummaryText(this.f45301c);
            }
            Iterator<CharSequence> it = this.f45277e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: g */
        public void mo51316g(@C0359n0 Bundle bundle) {
            super.mo51316g(bundle);
            bundle.remove(C17075f2.f45067W);
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: t */
        public String mo51317t() {
            return f45276f;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: y */
        public void mo51318y(@C0359n0 Bundle bundle) {
            super.mo51318y(bundle);
            this.f45277e.clear();
            if (bundle.containsKey(C17075f2.f45067W)) {
                Collections.addAll(this.f45277e, bundle.getCharSequenceArray(C17075f2.f45067W));
            }
        }

        public C17099l(@C0363p0 C17092g gVar) {
            mo51489z(gVar);
        }
    }

    /* renamed from: androidx.core.app.f2$m */
    public static class C17100m extends C17105q {

        /* renamed from: j */
        public static final String f45278j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: k */
        public static final int f45279k = 25;

        /* renamed from: e */
        public final List<C17101a> f45280e = new ArrayList();

        /* renamed from: f */
        public final List<C17101a> f45281f = new ArrayList();

        /* renamed from: g */
        public C17218r4 f45282g;
        @C0363p0

        /* renamed from: h */
        public CharSequence f45283h;
        @C0363p0

        /* renamed from: i */
        public Boolean f45284i;

        public C17100m() {
        }

        @C0363p0
        /* renamed from: E */
        public static C17100m m79171E(@C0359n0 Notification notification) {
            C17105q s = C17105q.m79211s(notification);
            if (s instanceof C17100m) {
                return (C17100m) s;
            }
            return null;
        }

        @C0359n0
        /* renamed from: A */
        public C17100m mo51453A(@C0363p0 C17101a aVar) {
            if (aVar != null) {
                this.f45281f.add(aVar);
                if (this.f45281f.size() > 25) {
                    this.f45281f.remove(0);
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: B */
        public C17100m mo51454B(@C0363p0 C17101a aVar) {
            if (aVar != null) {
                this.f45280e.add(aVar);
                if (this.f45280e.size() > 25) {
                    this.f45280e.remove(0);
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C17100m mo51455C(@C0363p0 CharSequence charSequence, long j, @C0363p0 C17218r4 r4Var) {
            mo51454B(new C17101a(charSequence, j, r4Var));
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: D */
        public C17100m mo51456D(@C0363p0 CharSequence charSequence, long j, @C0363p0 CharSequence charSequence2) {
            this.f45280e.add(new C17101a(charSequence, j, new C17218r4.C17221c().mo51672f(charSequence2).mo51667a()));
            if (this.f45280e.size() > 25) {
                this.f45280e.remove(0);
            }
            return this;
        }

        @C0363p0
        /* renamed from: F */
        public final C17101a mo51457F() {
            for (int size = this.f45280e.size() - 1; size >= 0; size--) {
                C17101a aVar = this.f45280e.get(size);
                if (aVar.mo51472g() != null && !TextUtils.isEmpty(aVar.mo51472g().mo51658f())) {
                    return aVar;
                }
            }
            if (this.f45280e.isEmpty()) {
                return null;
            }
            List<C17101a> list = this.f45280e;
            return list.get(list.size() - 1);
        }

        @C0363p0
        /* renamed from: G */
        public CharSequence mo51458G() {
            return this.f45283h;
        }

        @C0359n0
        /* renamed from: H */
        public List<C17101a> mo51459H() {
            return this.f45281f;
        }

        @C0359n0
        /* renamed from: I */
        public List<C17101a> mo51460I() {
            return this.f45280e;
        }

        @C0359n0
        /* renamed from: J */
        public C17218r4 mo51461J() {
            return this.f45282g;
        }

        @C0363p0
        @Deprecated
        /* renamed from: K */
        public CharSequence mo51462K() {
            return this.f45282g.mo51658f();
        }

        /* renamed from: L */
        public final boolean mo51463L() {
            for (int size = this.f45280e.size() - 1; size >= 0; size--) {
                C17101a aVar = this.f45280e.get(size);
                if (aVar.mo51472g() != null && aVar.mo51472g().mo51658f() == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: M */
        public boolean mo51464M() {
            C17092g gVar = this.f45299a;
            if (gVar == null || gVar.f45220a.getApplicationInfo().targetSdkVersion >= 28 || this.f45284i != null) {
                Boolean bool = this.f45284i;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.f45283h != null) {
                return true;
            } else {
                return false;
            }
        }

        @C0359n0
        /* renamed from: N */
        public final TextAppearanceSpan mo51465N(int i) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null);
        }

        /* renamed from: O */
        public final CharSequence mo51466O(@C0359n0 C17101a aVar) {
            CharSequence charSequence;
            C17897a c = C17897a.m81419c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequence2 = "";
            if (aVar.mo51472g() == null) {
                charSequence = charSequence2;
            } else {
                charSequence = aVar.mo51472g().mo51658f();
            }
            int i = -16777216;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f45282g.mo51658f();
                if (this.f45299a.mo51409r() != 0) {
                    i = this.f45299a.mo51409r();
                }
            }
            CharSequence m = c.mo52311m(charSequence);
            spannableStringBuilder.append(m);
            spannableStringBuilder.setSpan(mo51465N(i), spannableStringBuilder.length() - m.length(), spannableStringBuilder.length(), 33);
            if (aVar.mo51474i() != null) {
                charSequence2 = aVar.mo51474i();
            }
            spannableStringBuilder.append(GlideException.C22148a.f56917d).append(c.mo52311m(charSequence2));
            return spannableStringBuilder;
        }

        @C0359n0
        /* renamed from: P */
        public C17100m mo51467P(@C0363p0 CharSequence charSequence) {
            this.f45283h = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: Q */
        public C17100m mo51468Q(boolean z) {
            this.f45284i = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public void mo51322a(@C0359n0 Bundle bundle) {
            super.mo51322a(bundle);
            bundle.putCharSequence(C17075f2.f45080e0, this.f45282g.mo51658f());
            bundle.putBundle(C17075f2.f45082f0, this.f45282g.mo51665m());
            bundle.putCharSequence(C17075f2.f45092k0, this.f45283h);
            if (this.f45283h != null && this.f45284i.booleanValue()) {
                bundle.putCharSequence(C17075f2.f45084g0, this.f45283h);
            }
            if (!this.f45280e.isEmpty()) {
                bundle.putParcelableArray(C17075f2.f45086h0, C17101a.m79193a(this.f45280e));
            }
            if (!this.f45281f.isEmpty()) {
                bundle.putParcelableArray(C17075f2.f45088i0, C17101a.m79193a(this.f45281f));
            }
            Boolean bool = this.f45284i;
            if (bool != null) {
                bundle.putBoolean(C17075f2.f45090j0, bool.booleanValue());
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            Notification.MessagingStyle messagingStyle;
            mo51468Q(mo51464M());
            if (Build.VERSION.SDK_INT >= 28) {
                C17115g3.m79318a();
                messagingStyle = C17107f3.m79280a(this.f45282g.mo51663k());
            } else {
                messagingStyle = new Notification.MessagingStyle(this.f45282g.mo51658f());
            }
            for (C17101a l : this.f45280e) {
                messagingStyle.addMessage(l.mo51477l());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (C17101a l2 : this.f45281f) {
                    Notification.MessagingStyle unused = messagingStyle.addHistoricMessage(l2.mo51477l());
                }
            }
            if (this.f45284i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f45283h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Notification.MessagingStyle unused2 = messagingStyle.setGroupConversation(this.f45284i.booleanValue());
            }
            messagingStyle.setBuilder(f0Var.mo51268a());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: g */
        public void mo51316g(@C0359n0 Bundle bundle) {
            super.mo51316g(bundle);
            bundle.remove(C17075f2.f45082f0);
            bundle.remove(C17075f2.f45080e0);
            bundle.remove(C17075f2.f45084g0);
            bundle.remove(C17075f2.f45092k0);
            bundle.remove(C17075f2.f45086h0);
            bundle.remove(C17075f2.f45088i0);
            bundle.remove(C17075f2.f45090j0);
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: t */
        public String mo51317t() {
            return f45278j;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: y */
        public void mo51318y(@C0359n0 Bundle bundle) {
            super.mo51318y(bundle);
            this.f45280e.clear();
            if (bundle.containsKey(C17075f2.f45082f0)) {
                this.f45282g = C17218r4.m79527b(bundle.getBundle(C17075f2.f45082f0));
            } else {
                this.f45282g = new C17218r4.C17221c().mo51672f(bundle.getString(C17075f2.f45080e0)).mo51667a();
            }
            CharSequence charSequence = bundle.getCharSequence(C17075f2.f45084g0);
            this.f45283h = charSequence;
            if (charSequence == null) {
                this.f45283h = bundle.getCharSequence(C17075f2.f45092k0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C17075f2.f45086h0);
            if (parcelableArray != null) {
                this.f45280e.addAll(C17101a.m79195f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(C17075f2.f45088i0);
            if (parcelableArray2 != null) {
                this.f45281f.addAll(C17101a.m79195f(parcelableArray2));
            }
            if (bundle.containsKey(C17075f2.f45090j0)) {
                this.f45284i = Boolean.valueOf(bundle.getBoolean(C17075f2.f45090j0));
            }
        }

        @Deprecated
        public C17100m(@C0359n0 CharSequence charSequence) {
            this.f45282g = new C17218r4.C17221c().mo51672f(charSequence).mo51667a();
        }

        /* renamed from: androidx.core.app.f2$m$a */
        public static final class C17101a {

            /* renamed from: g */
            public static final String f45285g = "text";

            /* renamed from: h */
            public static final String f45286h = "time";

            /* renamed from: i */
            public static final String f45287i = "sender";

            /* renamed from: j */
            public static final String f45288j = "type";

            /* renamed from: k */
            public static final String f45289k = "uri";

            /* renamed from: l */
            public static final String f45290l = "extras";

            /* renamed from: m */
            public static final String f45291m = "person";

            /* renamed from: n */
            public static final String f45292n = "sender_person";

            /* renamed from: a */
            public final CharSequence f45293a;

            /* renamed from: b */
            public final long f45294b;
            @C0363p0

            /* renamed from: c */
            public final C17218r4 f45295c;

            /* renamed from: d */
            public Bundle f45296d;
            @C0363p0

            /* renamed from: e */
            public String f45297e;
            @C0363p0

            /* renamed from: f */
            public Uri f45298f;

            public C17101a(@C0363p0 CharSequence charSequence, long j, @C0363p0 C17218r4 r4Var) {
                this.f45296d = new Bundle();
                this.f45293a = charSequence;
                this.f45294b = j;
                this.f45295c = r4Var;
            }

            @C0359n0
            /* renamed from: a */
            public static Bundle[] m79193a(@C0359n0 List<C17101a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).mo51478m();
                }
                return bundleArr;
            }

            @C0363p0
            /* renamed from: e */
            public static C17101a m79194e(@C0359n0 Bundle bundle) {
                C17218r4 r4Var;
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            if (bundle.containsKey(f45291m)) {
                                r4Var = C17218r4.m79527b(bundle.getBundle(f45291m));
                            } else if (bundle.containsKey(f45292n) && Build.VERSION.SDK_INT >= 28) {
                                r4Var = C17218r4.m79526a(C17261u1.m79654a(bundle.getParcelable(f45292n)));
                            } else if (bundle.containsKey("sender")) {
                                r4Var = new C17218r4.C17221c().mo51672f(bundle.getCharSequence("sender")).mo51667a();
                            } else {
                                r4Var = null;
                            }
                            C17101a aVar = new C17101a(bundle.getCharSequence("text"), bundle.getLong("time"), r4Var);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                aVar.mo51476k(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                aVar.mo51471d().putAll(bundle.getBundle("extras"));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @C0359n0
            /* renamed from: f */
            public static List<C17101a> m79195f(@C0359n0 Parcelable[] parcelableArr) {
                C17101a e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Bundle bundle : parcelableArr) {
                    if ((bundle instanceof Bundle) && (e = m79194e(bundle)) != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }

            @C0363p0
            /* renamed from: b */
            public String mo51469b() {
                return this.f45297e;
            }

            @C0363p0
            /* renamed from: c */
            public Uri mo51470c() {
                return this.f45298f;
            }

            @C0359n0
            /* renamed from: d */
            public Bundle mo51471d() {
                return this.f45296d;
            }

            @C0363p0
            /* renamed from: g */
            public C17218r4 mo51472g() {
                return this.f45295c;
            }

            @C0363p0
            @Deprecated
            /* renamed from: h */
            public CharSequence mo51473h() {
                C17218r4 r4Var = this.f45295c;
                if (r4Var == null) {
                    return null;
                }
                return r4Var.mo51658f();
            }

            @C0363p0
            /* renamed from: i */
            public CharSequence mo51474i() {
                return this.f45293a;
            }

            /* renamed from: j */
            public long mo51475j() {
                return this.f45294b;
            }

            @C0359n0
            /* renamed from: k */
            public C17101a mo51476k(@C0363p0 String str, @C0363p0 Uri uri) {
                this.f45297e = str;
                this.f45298f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r3v5 */
            /* JADX WARNING: type inference failed for: r3v6 */
            /* JADX WARNING: Multi-variable type inference failed */
            @androidx.annotation.C0359n0
            @androidx.annotation.C0376v0(24)
            @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
            /* renamed from: l */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message mo51477l() {
                /*
                    r6 = this;
                    androidx.core.app.r4 r0 = r6.mo51472g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L_0x0022
                    androidx.core.app.C17134i3.m79361a()
                    java.lang.CharSequence r1 = r6.mo51474i()
                    long r4 = r6.mo51475j()
                    if (r0 != 0) goto L_0x0019
                    goto L_0x001d
                L_0x0019:
                    android.app.Person r3 = r0.mo51663k()
                L_0x001d:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.C17122h3.m79325a(r1, r4, r3)
                    goto L_0x0037
                L_0x0022:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r2 = r6.mo51474i()
                    long r4 = r6.mo51475j()
                    if (r0 != 0) goto L_0x002f
                    goto L_0x0033
                L_0x002f:
                    java.lang.CharSequence r3 = r0.mo51658f()
                L_0x0033:
                    r1.<init>(r2, r4, r3)
                    r0 = r1
                L_0x0037:
                    java.lang.String r1 = r6.mo51469b()
                    if (r1 == 0) goto L_0x0048
                    java.lang.String r1 = r6.mo51469b()
                    android.net.Uri r2 = r6.mo51470c()
                    r0.setData(r1, r2)
                L_0x0048:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C17075f2.C17100m.C17101a.mo51477l():android.app.Notification$MessagingStyle$Message");
            }

            @C0359n0
            /* renamed from: m */
            public final Bundle mo51478m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f45293a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f45294b);
                C17218r4 r4Var = this.f45295c;
                if (r4Var != null) {
                    bundle.putCharSequence("sender", r4Var.mo51658f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f45292n, this.f45295c.mo51663k());
                    } else {
                        bundle.putBundle(f45291m, this.f45295c.mo51665m());
                    }
                }
                String str = this.f45297e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f45298f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f45296d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Deprecated
            public C17101a(@C0363p0 CharSequence charSequence, long j, @C0363p0 CharSequence charSequence2) {
                this(charSequence, j, new C17218r4.C17221c().mo51672f(charSequence2).mo51667a());
            }
        }

        public C17100m(@C0359n0 C17218r4 r4Var) {
            if (!TextUtils.isEmpty(r4Var.mo51658f())) {
                this.f45282g = r4Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* renamed from: androidx.core.app.f2$r */
    public static final class C17106r implements C17097j {

        /* renamed from: A */
        public static final String f45303A = "displayIntent";

        /* renamed from: B */
        public static final String f45304B = "pages";

        /* renamed from: C */
        public static final String f45305C = "background";

        /* renamed from: D */
        public static final String f45306D = "contentIcon";

        /* renamed from: E */
        public static final String f45307E = "contentIconGravity";

        /* renamed from: F */
        public static final String f45308F = "contentActionIndex";

        /* renamed from: G */
        public static final String f45309G = "customSizePreset";

        /* renamed from: H */
        public static final String f45310H = "customContentHeight";

        /* renamed from: I */
        public static final String f45311I = "gravity";

        /* renamed from: J */
        public static final String f45312J = "hintScreenTimeout";

        /* renamed from: K */
        public static final String f45313K = "dismissalId";

        /* renamed from: L */
        public static final String f45314L = "bridgeTag";

        /* renamed from: M */
        public static final int f45315M = 1;

        /* renamed from: N */
        public static final int f45316N = 2;

        /* renamed from: O */
        public static final int f45317O = 4;

        /* renamed from: P */
        public static final int f45318P = 8;

        /* renamed from: Q */
        public static final int f45319Q = 16;

        /* renamed from: R */
        public static final int f45320R = 32;

        /* renamed from: S */
        public static final int f45321S = 64;

        /* renamed from: T */
        public static final int f45322T = 1;

        /* renamed from: U */
        public static final int f45323U = 8388613;

        /* renamed from: V */
        public static final int f45324V = 80;

        /* renamed from: o */
        public static final int f45325o = -1;
        @Deprecated

        /* renamed from: p */
        public static final int f45326p = 0;
        @Deprecated

        /* renamed from: q */
        public static final int f45327q = 1;
        @Deprecated

        /* renamed from: r */
        public static final int f45328r = 2;
        @Deprecated

        /* renamed from: s */
        public static final int f45329s = 3;
        @Deprecated

        /* renamed from: t */
        public static final int f45330t = 4;
        @Deprecated

        /* renamed from: u */
        public static final int f45331u = 5;
        @Deprecated

        /* renamed from: v */
        public static final int f45332v = 0;
        @Deprecated

        /* renamed from: w */
        public static final int f45333w = -1;

        /* renamed from: x */
        public static final String f45334x = "android.wearable.EXTENSIONS";

        /* renamed from: y */
        public static final String f45335y = "actions";

        /* renamed from: z */
        public static final String f45336z = "flags";

        /* renamed from: a */
        public ArrayList<C17077b> f45337a = new ArrayList<>();

        /* renamed from: b */
        public int f45338b = 1;

        /* renamed from: c */
        public PendingIntent f45339c;

        /* renamed from: d */
        public ArrayList<Notification> f45340d = new ArrayList<>();

        /* renamed from: e */
        public Bitmap f45341e;

        /* renamed from: f */
        public int f45342f;

        /* renamed from: g */
        public int f45343g = 8388613;

        /* renamed from: h */
        public int f45344h = -1;

        /* renamed from: i */
        public int f45345i = 0;

        /* renamed from: j */
        public int f45346j;

        /* renamed from: k */
        public int f45347k = 80;

        /* renamed from: l */
        public int f45348l;

        /* renamed from: m */
        public String f45349m;

        /* renamed from: n */
        public String f45350n;

        public C17106r() {
        }

        @C0376v0(20)
        /* renamed from: i */
        public static Notification.Action m79232i(C17077b bVar) {
            Icon icon;
            Bundle bundle;
            int i = Build.VERSION.SDK_INT;
            IconCompat f = bVar.mo51274f();
            if (f == null) {
                icon = null;
            } else {
                icon = f.mo51938K();
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(icon, bVar.mo51278j(), bVar.mo51269a());
            if (bVar.mo51272d() != null) {
                bundle = new Bundle(bVar.mo51272d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean(C17038b4.f44971c, bVar.mo51270b());
            builder.setAllowGeneratedReplies(bVar.mo51270b());
            if (i >= 31) {
                Notification.Action.Builder unused = builder.setAuthenticationRequired(bVar.mo51279k());
            }
            builder.addExtras(bundle);
            C17230s5[] g = bVar.mo51275g();
            if (g != null) {
                for (RemoteInput addRemoteInput : C17230s5.m79562d(g)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        /* renamed from: A */
        public boolean mo51490A() {
            return (this.f45338b & 4) != 0;
        }

        @C0359n0
        @Deprecated
        /* renamed from: B */
        public List<Notification> mo51491B() {
            return this.f45340d;
        }

        /* renamed from: C */
        public boolean mo51492C() {
            return (this.f45338b & 8) != 0;
        }

        @C0359n0
        @Deprecated
        /* renamed from: D */
        public C17106r mo51493D(@C0363p0 Bitmap bitmap) {
            this.f45341e = bitmap;
            return this;
        }

        @C0359n0
        /* renamed from: E */
        public C17106r mo51494E(@C0363p0 String str) {
            this.f45350n = str;
            return this;
        }

        @C0359n0
        /* renamed from: F */
        public C17106r mo51495F(int i) {
            this.f45344h = i;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: G */
        public C17106r mo51496G(int i) {
            this.f45342f = i;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: H */
        public C17106r mo51497H(int i) {
            this.f45343g = i;
            return this;
        }

        @C0359n0
        /* renamed from: I */
        public C17106r mo51498I(boolean z) {
            mo51503N(1, z);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: J */
        public C17106r mo51499J(int i) {
            this.f45346j = i;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: K */
        public C17106r mo51500K(int i) {
            this.f45345i = i;
            return this;
        }

        @C0359n0
        /* renamed from: L */
        public C17106r mo51501L(@C0363p0 String str) {
            this.f45349m = str;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: M */
        public C17106r mo51502M(@C0363p0 PendingIntent pendingIntent) {
            this.f45339c = pendingIntent;
            return this;
        }

        /* renamed from: N */
        public final void mo51503N(int i, boolean z) {
            if (z) {
                this.f45338b = i | this.f45338b;
                return;
            }
            this.f45338b = (~i) & this.f45338b;
        }

        @C0359n0
        @Deprecated
        /* renamed from: O */
        public C17106r mo51504O(int i) {
            this.f45347k = i;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: P */
        public C17106r mo51505P(boolean z) {
            mo51503N(32, z);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: Q */
        public C17106r mo51506Q(boolean z) {
            mo51503N(16, z);
            return this;
        }

        @C0359n0
        /* renamed from: R */
        public C17106r mo51507R(boolean z) {
            mo51503N(64, z);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: S */
        public C17106r mo51508S(boolean z) {
            mo51503N(2, z);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: T */
        public C17106r mo51509T(int i) {
            this.f45348l = i;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: U */
        public C17106r mo51510U(boolean z) {
            mo51503N(4, z);
            return this;
        }

        @C0359n0
        /* renamed from: V */
        public C17106r mo51511V(boolean z) {
            mo51503N(8, z);
            return this;
        }

        @C0359n0
        /* renamed from: a */
        public C17092g mo19263a(@C0359n0 C17092g gVar) {
            Bundle bundle = new Bundle();
            if (!this.f45337a.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f45337a.size());
                Iterator<C17077b> it = this.f45337a.iterator();
                while (it.hasNext()) {
                    arrayList.add(m79232i(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i = this.f45338b;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            PendingIntent pendingIntent = this.f45339c;
            if (pendingIntent != null) {
                bundle.putParcelable(f45303A, pendingIntent);
            }
            if (!this.f45340d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f45340d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f45341e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i2 = this.f45342f;
            if (i2 != 0) {
                bundle.putInt(f45306D, i2);
            }
            int i3 = this.f45343g;
            if (i3 != 8388613) {
                bundle.putInt(f45307E, i3);
            }
            int i4 = this.f45344h;
            if (i4 != -1) {
                bundle.putInt(f45308F, i4);
            }
            int i5 = this.f45345i;
            if (i5 != 0) {
                bundle.putInt(f45309G, i5);
            }
            int i6 = this.f45346j;
            if (i6 != 0) {
                bundle.putInt(f45310H, i6);
            }
            int i7 = this.f45347k;
            if (i7 != 80) {
                bundle.putInt(f45311I, i7);
            }
            int i8 = this.f45348l;
            if (i8 != 0) {
                bundle.putInt(f45312J, i8);
            }
            String str = this.f45349m;
            if (str != null) {
                bundle.putString(f45313K, str);
            }
            String str2 = this.f45350n;
            if (str2 != null) {
                bundle.putString(f45314L, str2);
            }
            gVar.mo51413t().putBundle("android.wearable.EXTENSIONS", bundle);
            return gVar;
        }

        @C0359n0
        /* renamed from: b */
        public C17106r mo51512b(@C0359n0 C17077b bVar) {
            this.f45337a.add(bVar);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17106r mo51513c(@C0359n0 List<C17077b> list) {
            this.f45337a.addAll(list);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: d */
        public C17106r mo51515d(@C0359n0 Notification notification) {
            this.f45340d.add(notification);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: e */
        public C17106r mo51516e(@C0359n0 List<Notification> list) {
            this.f45340d.addAll(list);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17106r mo51517f() {
            this.f45337a.clear();
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: g */
        public C17106r mo51518g() {
            this.f45340d.clear();
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C17106r clone() {
            C17106r rVar = new C17106r();
            rVar.f45337a = new ArrayList<>(this.f45337a);
            rVar.f45338b = this.f45338b;
            rVar.f45339c = this.f45339c;
            rVar.f45340d = new ArrayList<>(this.f45340d);
            rVar.f45341e = this.f45341e;
            rVar.f45342f = this.f45342f;
            rVar.f45343g = this.f45343g;
            rVar.f45344h = this.f45344h;
            rVar.f45345i = this.f45345i;
            rVar.f45346j = this.f45346j;
            rVar.f45347k = this.f45347k;
            rVar.f45348l = this.f45348l;
            rVar.f45349m = this.f45349m;
            rVar.f45350n = this.f45350n;
            return rVar;
        }

        @C0359n0
        /* renamed from: j */
        public List<C17077b> mo51520j() {
            return this.f45337a;
        }

        @C0363p0
        @Deprecated
        /* renamed from: k */
        public Bitmap mo51521k() {
            return this.f45341e;
        }

        @C0363p0
        /* renamed from: l */
        public String mo51522l() {
            return this.f45350n;
        }

        /* renamed from: m */
        public int mo51523m() {
            return this.f45344h;
        }

        @Deprecated
        /* renamed from: n */
        public int mo51524n() {
            return this.f45342f;
        }

        @Deprecated
        /* renamed from: o */
        public int mo51525o() {
            return this.f45343g;
        }

        /* renamed from: p */
        public boolean mo51526p() {
            return (this.f45338b & 1) != 0;
        }

        @Deprecated
        /* renamed from: q */
        public int mo51527q() {
            return this.f45346j;
        }

        @Deprecated
        /* renamed from: r */
        public int mo51528r() {
            return this.f45345i;
        }

        @C0363p0
        /* renamed from: s */
        public String mo51529s() {
            return this.f45349m;
        }

        @C0363p0
        @Deprecated
        /* renamed from: t */
        public PendingIntent mo51530t() {
            return this.f45339c;
        }

        @Deprecated
        /* renamed from: u */
        public int mo51531u() {
            return this.f45347k;
        }

        @Deprecated
        /* renamed from: v */
        public boolean mo51532v() {
            return (this.f45338b & 32) != 0;
        }

        @Deprecated
        /* renamed from: w */
        public boolean mo51533w() {
            return (this.f45338b & 16) != 0;
        }

        /* renamed from: x */
        public boolean mo51534x() {
            return (this.f45338b & 64) != 0;
        }

        @Deprecated
        /* renamed from: y */
        public boolean mo51535y() {
            return (this.f45338b & 2) != 0;
        }

        @Deprecated
        /* renamed from: z */
        public int mo51536z() {
            return this.f45348l;
        }

        public C17106r(@C0359n0 Notification notification) {
            Bundle n = C17075f2.m78942n(notification);
            Bundle bundle = n != null ? n.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    C17077b[] bVarArr = new C17077b[size];
                    for (int i = 0; i < size; i++) {
                        bVarArr[i] = C17075f2.m78930b((Notification.Action) parcelableArrayList.get(i));
                    }
                    Collections.addAll(this.f45337a, bVarArr);
                }
                this.f45338b = bundle.getInt("flags", 1);
                this.f45339c = (PendingIntent) bundle.getParcelable(f45303A);
                Notification[] u = C17075f2.m78949u(bundle, "pages");
                if (u != null) {
                    Collections.addAll(this.f45340d, u);
                }
                this.f45341e = (Bitmap) bundle.getParcelable("background");
                this.f45342f = bundle.getInt(f45306D);
                this.f45343g = bundle.getInt(f45307E, 8388613);
                this.f45344h = bundle.getInt(f45308F, -1);
                this.f45345i = bundle.getInt(f45309G, 0);
                this.f45346j = bundle.getInt(f45310H);
                this.f45347k = bundle.getInt(f45311I, 80);
                this.f45348l = bundle.getInt(f45312J);
                this.f45349m = bundle.getString(f45313K);
                this.f45350n = bundle.getString(f45314L);
            }
        }
    }

    /* renamed from: androidx.core.app.f2$g */
    public static class C17092g {

        /* renamed from: Y */
        public static final int f45195Y = 5120;

        /* renamed from: A */
        public boolean f45196A;

        /* renamed from: B */
        public boolean f45197B;

        /* renamed from: C */
        public boolean f45198C;

        /* renamed from: D */
        public String f45199D;

        /* renamed from: E */
        public Bundle f45200E;

        /* renamed from: F */
        public int f45201F;

        /* renamed from: G */
        public int f45202G;

        /* renamed from: H */
        public Notification f45203H;

        /* renamed from: I */
        public RemoteViews f45204I;

        /* renamed from: J */
        public RemoteViews f45205J;

        /* renamed from: K */
        public RemoteViews f45206K;

        /* renamed from: L */
        public String f45207L;

        /* renamed from: M */
        public int f45208M;

        /* renamed from: N */
        public String f45209N;

        /* renamed from: O */
        public C17358m0 f45210O;

        /* renamed from: P */
        public long f45211P;

        /* renamed from: Q */
        public int f45212Q;

        /* renamed from: R */
        public int f45213R;

        /* renamed from: S */
        public boolean f45214S;

        /* renamed from: T */
        public C17088f f45215T;

        /* renamed from: U */
        public Notification f45216U;

        /* renamed from: V */
        public boolean f45217V;

        /* renamed from: W */
        public Icon f45218W;
        @Deprecated

        /* renamed from: X */
        public ArrayList<String> f45219X;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: a */
        public Context f45220a;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: b */
        public ArrayList<C17077b> f45221b;
        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: c */
        public ArrayList<C17218r4> f45222c;

        /* renamed from: d */
        public ArrayList<C17077b> f45223d;

        /* renamed from: e */
        public CharSequence f45224e;

        /* renamed from: f */
        public CharSequence f45225f;

        /* renamed from: g */
        public PendingIntent f45226g;

        /* renamed from: h */
        public PendingIntent f45227h;

        /* renamed from: i */
        public RemoteViews f45228i;

        /* renamed from: j */
        public Bitmap f45229j;

        /* renamed from: k */
        public CharSequence f45230k;

        /* renamed from: l */
        public int f45231l;

        /* renamed from: m */
        public int f45232m;

        /* renamed from: n */
        public boolean f45233n;

        /* renamed from: o */
        public boolean f45234o;

        /* renamed from: p */
        public boolean f45235p;

        /* renamed from: q */
        public C17105q f45236q;

        /* renamed from: r */
        public CharSequence f45237r;

        /* renamed from: s */
        public CharSequence f45238s;

        /* renamed from: t */
        public CharSequence[] f45239t;

        /* renamed from: u */
        public int f45240u;

        /* renamed from: v */
        public int f45241v;

        /* renamed from: w */
        public boolean f45242w;

        /* renamed from: x */
        public String f45243x;

        /* renamed from: y */
        public boolean f45244y;

        /* renamed from: z */
        public String f45245z;

        @C0376v0(19)
        public C17092g(@C0359n0 Context context, @C0359n0 Notification notification) {
            this(context, C17075f2.m78937i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            C17105q s = C17105q.m79211s(notification);
            mo51364P(C17075f2.m78941m(notification)).mo51363O(C17075f2.m78940l(notification)).mo51361M(C17075f2.m78939k(notification)).mo51341A0(C17075f2.m78924D(notification)).mo51404o0(C17075f2.m78954z(notification)).mo51425z0(s).mo51362N(notification.contentIntent).mo51374Z(C17075f2.m78943o(notification)).mo51378b0(C17075f2.m78928H(notification)).mo51386f0(C17075f2.m78948t(notification)).mo51355H0(notification.when).mo51410r0(C17075f2.m78922B(notification)).mo51349E0(C17075f2.m78926F(notification)).mo51346D(C17075f2.m78933e(notification)).mo51394j0(C17075f2.m78951w(notification)).mo51392i0(C17075f2.m78950v(notification)).mo51384e0(C17075f2.m78947s(notification)).mo51380c0(notification.largeIcon).mo51348E(C17075f2.m78934f(notification)).mo51352G(C17075f2.m78936h(notification)).mo51350F(C17075f2.m78935g(notification)).mo51390h0(notification.number).mo51343B0(notification.tickerText).mo51362N(notification.contentIntent).mo51369U(notification.deleteIntent).mo51373Y(notification.fullScreenIntent, C17075f2.m78945q(notification)).mo51423y0(notification.sound, notification.audioStreamType).mo51351F0(notification.vibrate).mo51382d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).mo51368T(notification.defaults).mo51396k0(notification.priority).mo51358J(C17075f2.m78938j(notification)).mo51353G0(C17075f2.m78927G(notification)).mo51400m0(C17075f2.m78953y(notification)).mo51419w0(C17075f2.m78923C(notification)).mo51347D0(C17075f2.m78925E(notification)).mo51406p0(C17075f2.m78921A(notification)).mo51398l0(bundle.getInt(C17075f2.f45049M), bundle.getInt(C17075f2.f45047L), bundle.getBoolean(C17075f2.f45051N)).mo51344C(C17075f2.m78932d(notification)).mo51415u0(notification.icon, notification.iconLevel).mo51379c(m79047u(notification, s));
            this.f45218W = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action f : actionArr) {
                    mo51377b(C17077b.C17078a.m78967f(f).mo51283c());
                }
            }
            List<C17077b> r = C17075f2.m78946r(notification);
            if (!r.isEmpty()) {
                for (C17077b e : r) {
                    mo51383e(e);
                }
            }
            String[] stringArray = notification.extras.getStringArray(C17075f2.f45070Z);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String g : stringArray) {
                    mo51387g(g);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(C17075f2.f45072a0)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    mo51385f(C17218r4.m79526a(C17261u1.m79654a(it.next())));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (bundle.containsKey(C17075f2.f45055P)) {
                mo51356I(bundle.getBoolean(C17075f2.f45055P));
            }
            if (i >= 26 && bundle.containsKey(C17075f2.f45057Q)) {
                mo51359K(bundle.getBoolean(C17075f2.f45057Q));
            }
        }

        @C0363p0
        /* renamed from: A */
        public static CharSequence m79046A(@C0363p0 CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        @C0363p0
        @C0376v0(19)
        /* renamed from: u */
        public static Bundle m79047u(@C0359n0 Notification notification, @C0363p0 C17105q qVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(C17075f2.f45025A);
            bundle.remove(C17075f2.f45029C);
            bundle.remove(C17075f2.f45035F);
            bundle.remove(C17075f2.f45031D);
            bundle.remove(C17075f2.f45073b);
            bundle.remove(C17075f2.f45075c);
            bundle.remove(C17075f2.f45059R);
            bundle.remove(C17075f2.f45047L);
            bundle.remove(C17075f2.f45049M);
            bundle.remove(C17075f2.f45051N);
            bundle.remove(C17075f2.f45055P);
            bundle.remove(C17075f2.f45057Q);
            bundle.remove(C17075f2.f45072a0);
            bundle.remove(C17075f2.f45070Z);
            bundle.remove(C17013a4.f44958d);
            bundle.remove(C17013a4.f44956b);
            bundle.remove(C17013a4.f44957c);
            bundle.remove(C17013a4.f44955a);
            bundle.remove(C17013a4.f44959e);
            Bundle bundle2 = bundle.getBundle(C17093h.f45246d);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(C17093h.f45250h);
                bundle.putBundle(C17093h.f45246d, bundle3);
            }
            if (qVar != null) {
                qVar.mo51316g(bundle);
            }
            return bundle;
        }

        @C0359n0
        /* renamed from: A0 */
        public C17092g mo51341A0(@C0363p0 CharSequence charSequence) {
            this.f45237r = m79046A(charSequence);
            return this;
        }

        @C0363p0
        /* renamed from: B */
        public final Bitmap mo51342B(@C0363p0 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f45220a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C16986a.C16989c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C16986a.C16989c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        @C0359n0
        /* renamed from: B0 */
        public C17092g mo51343B0(@C0363p0 CharSequence charSequence) {
            this.f45216U.tickerText = m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C17092g mo51344C(boolean z) {
            this.f45214S = z;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: C0 */
        public C17092g mo51345C0(@C0363p0 CharSequence charSequence, @C0363p0 RemoteViews remoteViews) {
            this.f45216U.tickerText = m79046A(charSequence);
            this.f45228i = remoteViews;
            return this;
        }

        @C0359n0
        /* renamed from: D */
        public C17092g mo51346D(boolean z) {
            mo51371W(16, z);
            return this;
        }

        @C0359n0
        /* renamed from: D0 */
        public C17092g mo51347D0(long j) {
            this.f45211P = j;
            return this;
        }

        @C0359n0
        /* renamed from: E */
        public C17092g mo51348E(int i) {
            this.f45208M = i;
            return this;
        }

        @C0359n0
        /* renamed from: E0 */
        public C17092g mo51349E0(boolean z) {
            this.f45234o = z;
            return this;
        }

        @C0359n0
        /* renamed from: F */
        public C17092g mo51350F(@C0363p0 C17088f fVar) {
            this.f45215T = fVar;
            return this;
        }

        @C0359n0
        /* renamed from: F0 */
        public C17092g mo51351F0(@C0363p0 long[] jArr) {
            this.f45216U.vibrate = jArr;
            return this;
        }

        @C0359n0
        /* renamed from: G */
        public C17092g mo51352G(@C0363p0 String str) {
            this.f45199D = str;
            return this;
        }

        @C0359n0
        /* renamed from: G0 */
        public C17092g mo51353G0(int i) {
            this.f45202G = i;
            return this;
        }

        @C0359n0
        /* renamed from: H */
        public C17092g mo51354H(@C0359n0 String str) {
            this.f45207L = str;
            return this;
        }

        @C0359n0
        /* renamed from: H0 */
        public C17092g mo51355H0(long j) {
            this.f45216U.when = j;
            return this;
        }

        @C0359n0
        @C0376v0(24)
        /* renamed from: I */
        public C17092g mo51356I(boolean z) {
            this.f45235p = z;
            mo51413t().putBoolean(C17075f2.f45055P, z);
            return this;
        }

        /* renamed from: I0 */
        public final boolean mo51357I0() {
            C17105q qVar = this.f45236q;
            return qVar == null || !qVar.mo51446r();
        }

        @C0359n0
        /* renamed from: J */
        public C17092g mo51358J(@C0354l int i) {
            this.f45201F = i;
            return this;
        }

        @C0359n0
        /* renamed from: K */
        public C17092g mo51359K(boolean z) {
            this.f45197B = z;
            this.f45198C = true;
            return this;
        }

        @C0359n0
        /* renamed from: L */
        public C17092g mo51360L(@C0363p0 RemoteViews remoteViews) {
            this.f45216U.contentView = remoteViews;
            return this;
        }

        @C0359n0
        /* renamed from: M */
        public C17092g mo51361M(@C0363p0 CharSequence charSequence) {
            this.f45230k = m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: N */
        public C17092g mo51362N(@C0363p0 PendingIntent pendingIntent) {
            this.f45226g = pendingIntent;
            return this;
        }

        @C0359n0
        /* renamed from: O */
        public C17092g mo51363O(@C0363p0 CharSequence charSequence) {
            this.f45225f = m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: P */
        public C17092g mo51364P(@C0363p0 CharSequence charSequence) {
            this.f45224e = m79046A(charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: Q */
        public C17092g mo51365Q(@C0363p0 RemoteViews remoteViews) {
            this.f45205J = remoteViews;
            return this;
        }

        @C0359n0
        /* renamed from: R */
        public C17092g mo51366R(@C0363p0 RemoteViews remoteViews) {
            this.f45204I = remoteViews;
            return this;
        }

        @C0359n0
        /* renamed from: S */
        public C17092g mo51367S(@C0363p0 RemoteViews remoteViews) {
            this.f45206K = remoteViews;
            return this;
        }

        @C0359n0
        /* renamed from: T */
        public C17092g mo51368T(int i) {
            Notification notification = this.f45216U;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @C0359n0
        /* renamed from: U */
        public C17092g mo51369U(@C0363p0 PendingIntent pendingIntent) {
            this.f45216U.deleteIntent = pendingIntent;
            return this;
        }

        @C0359n0
        /* renamed from: V */
        public C17092g mo51370V(@C0363p0 Bundle bundle) {
            this.f45200E = bundle;
            return this;
        }

        /* renamed from: W */
        public final void mo51371W(int i, boolean z) {
            if (z) {
                Notification notification = this.f45216U;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f45216U;
            notification2.flags = (~i) & notification2.flags;
        }

        @C0359n0
        /* renamed from: X */
        public C17092g mo51372X(int i) {
            this.f45213R = i;
            return this;
        }

        @C0359n0
        /* renamed from: Y */
        public C17092g mo51373Y(@C0363p0 PendingIntent pendingIntent, boolean z) {
            this.f45227h = pendingIntent;
            mo51371W(128, z);
            return this;
        }

        @C0359n0
        /* renamed from: Z */
        public C17092g mo51374Z(@C0363p0 String str) {
            this.f45243x = str;
            return this;
        }

        @C0359n0
        /* renamed from: a */
        public C17092g mo51375a(int i, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent) {
            this.f45221b.add(new C17077b(i, charSequence, pendingIntent));
            return this;
        }

        @C0359n0
        /* renamed from: a0 */
        public C17092g mo51376a0(int i) {
            this.f45212Q = i;
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C17092g mo51377b(@C0363p0 C17077b bVar) {
            if (bVar != null) {
                this.f45221b.add(bVar);
            }
            return this;
        }

        @C0359n0
        /* renamed from: b0 */
        public C17092g mo51378b0(boolean z) {
            this.f45244y = z;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17092g mo51379c(@C0363p0 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f45200E;
                if (bundle2 == null) {
                    this.f45200E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: c0 */
        public C17092g mo51380c0(@C0363p0 Bitmap bitmap) {
            this.f45229j = mo51342B(bitmap);
            return this;
        }

        @C0359n0
        @C0376v0(21)
        /* renamed from: d */
        public C17092g mo51381d(int i, @C0363p0 CharSequence charSequence, @C0363p0 PendingIntent pendingIntent) {
            this.f45223d.add(new C17077b(i, charSequence, pendingIntent));
            return this;
        }

        @C0359n0
        /* renamed from: d0 */
        public C17092g mo51382d0(@C0354l int i, int i2, int i3) {
            int i4;
            Notification notification = this.f45216U;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 == 0 || i3 == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        @C0359n0
        @C0376v0(21)
        /* renamed from: e */
        public C17092g mo51383e(@C0363p0 C17077b bVar) {
            if (bVar != null) {
                this.f45223d.add(bVar);
            }
            return this;
        }

        @C0359n0
        /* renamed from: e0 */
        public C17092g mo51384e0(boolean z) {
            this.f45196A = z;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17092g mo51385f(@C0363p0 C17218r4 r4Var) {
            if (r4Var != null) {
                this.f45222c.add(r4Var);
            }
            return this;
        }

        @C0359n0
        /* renamed from: f0 */
        public C17092g mo51386f0(@C0363p0 C17358m0 m0Var) {
            this.f45210O = m0Var;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: g */
        public C17092g mo51387g(@C0363p0 String str) {
            if (str != null && !str.isEmpty()) {
                this.f45219X.add(str);
            }
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: g0 */
        public C17092g mo51388g0() {
            this.f45217V = true;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public Notification mo51389h() {
            return new C17306z3(this).mo51744c();
        }

        @C0359n0
        /* renamed from: h0 */
        public C17092g mo51390h0(int i) {
            this.f45231l = i;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C17092g mo51391i() {
            this.f45221b.clear();
            return this;
        }

        @C0359n0
        /* renamed from: i0 */
        public C17092g mo51392i0(boolean z) {
            mo51371W(2, z);
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C17092g mo51393j() {
            this.f45223d.clear();
            Bundle bundle = this.f45200E.getBundle(C17093h.f45246d);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(C17093h.f45250h);
                this.f45200E.putBundle(C17093h.f45246d, bundle2);
            }
            return this;
        }

        @C0359n0
        /* renamed from: j0 */
        public C17092g mo51394j0(boolean z) {
            mo51371W(8, z);
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C17092g mo51395k() {
            this.f45222c.clear();
            this.f45219X.clear();
            return this;
        }

        @C0359n0
        /* renamed from: k0 */
        public C17092g mo51396k0(int i) {
            this.f45232m = i;
            return this;
        }

        @C0363p0
        @SuppressLint({"BuilderSetStyle"})
        /* renamed from: l */
        public RemoteViews mo51397l() {
            RemoteViews v;
            if (this.f45205J != null && mo51357I0()) {
                return this.f45205J;
            }
            C17306z3 z3Var = new C17306z3(this);
            C17105q qVar = this.f45236q;
            if (qVar != null && (v = qVar.mo51447v(z3Var)) != null) {
                return v;
            }
            return Notification.Builder.recoverBuilder(this.f45220a, z3Var.mo51744c()).createBigContentView();
        }

        @C0359n0
        /* renamed from: l0 */
        public C17092g mo51398l0(int i, int i2, boolean z) {
            this.f45240u = i;
            this.f45241v = i2;
            this.f45242w = z;
            return this;
        }

        @C0363p0
        @SuppressLint({"BuilderSetStyle"})
        /* renamed from: m */
        public RemoteViews mo51399m() {
            RemoteViews w;
            if (this.f45204I != null && mo51357I0()) {
                return this.f45204I;
            }
            C17306z3 z3Var = new C17306z3(this);
            C17105q qVar = this.f45236q;
            if (qVar != null && (w = qVar.mo51448w(z3Var)) != null) {
                return w;
            }
            return Notification.Builder.recoverBuilder(this.f45220a, z3Var.mo51744c()).createContentView();
        }

        @C0359n0
        /* renamed from: m0 */
        public C17092g mo51400m0(@C0363p0 Notification notification) {
            this.f45203H = notification;
            return this;
        }

        @C0363p0
        @SuppressLint({"BuilderSetStyle"})
        /* renamed from: n */
        public RemoteViews mo51401n() {
            RemoteViews x;
            if (this.f45206K != null && mo51357I0()) {
                return this.f45206K;
            }
            C17306z3 z3Var = new C17306z3(this);
            C17105q qVar = this.f45236q;
            if (qVar != null && (x = qVar.mo51449x(z3Var)) != null) {
                return x;
            }
            return Notification.Builder.recoverBuilder(this.f45220a, z3Var.mo51744c()).createHeadsUpContentView();
        }

        @C0359n0
        /* renamed from: n0 */
        public C17092g mo51402n0(@C0363p0 CharSequence[] charSequenceArr) {
            this.f45239t = charSequenceArr;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C17092g mo51403o(@C0359n0 C17097j jVar) {
            jVar.mo19263a(this);
            return this;
        }

        @C0359n0
        /* renamed from: o0 */
        public C17092g mo51404o0(@C0363p0 CharSequence charSequence) {
            this.f45238s = m79046A(charSequence);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: p */
        public RemoteViews mo51405p() {
            return this.f45205J;
        }

        @C0359n0
        /* renamed from: p0 */
        public C17092g mo51406p0(@C0363p0 String str) {
            this.f45209N = str;
            return this;
        }

        @C0363p0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: q */
        public C17088f mo51407q() {
            return this.f45215T;
        }

        @C0359n0
        /* renamed from: q0 */
        public C17092g mo51408q0(@C0363p0 C17428s0 s0Var) {
            if (s0Var == null) {
                return this;
            }
            this.f45209N = s0Var.mo51825k();
            if (this.f45210O == null) {
                if (s0Var.mo51829o() != null) {
                    this.f45210O = s0Var.mo51829o();
                } else if (s0Var.mo51825k() != null) {
                    this.f45210O = new C17358m0(s0Var.mo51825k());
                }
            }
            if (this.f45224e == null) {
                mo51364P(s0Var.mo51833w());
            }
            return this;
        }

        @C0354l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: r */
        public int mo51409r() {
            return this.f45201F;
        }

        @C0359n0
        /* renamed from: r0 */
        public C17092g mo51410r0(boolean z) {
            this.f45233n = z;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: s */
        public RemoteViews mo51411s() {
            return this.f45204I;
        }

        @C0359n0
        /* renamed from: s0 */
        public C17092g mo51412s0(boolean z) {
            this.f45217V = z;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public Bundle mo51413t() {
            if (this.f45200E == null) {
                this.f45200E = new Bundle();
            }
            return this.f45200E;
        }

        @C0359n0
        /* renamed from: t0 */
        public C17092g mo51414t0(int i) {
            this.f45216U.icon = i;
            return this;
        }

        @C0359n0
        /* renamed from: u0 */
        public C17092g mo51415u0(int i, int i2) {
            Notification notification = this.f45216U;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: v */
        public int mo51416v() {
            return this.f45213R;
        }

        @C0359n0
        @C0376v0(23)
        /* renamed from: v0 */
        public C17092g mo51417v0(@C0359n0 IconCompat iconCompat) {
            this.f45218W = iconCompat.mo51939L(this.f45220a);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: w */
        public RemoteViews mo51418w() {
            return this.f45206K;
        }

        @C0359n0
        /* renamed from: w0 */
        public C17092g mo51419w0(@C0363p0 String str) {
            this.f45245z = str;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: x */
        public Notification mo51420x() {
            return mo51389h();
        }

        @C0359n0
        /* renamed from: x0 */
        public C17092g mo51421x0(@C0363p0 Uri uri) {
            Notification notification = this.f45216U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: y */
        public int mo51422y() {
            return this.f45232m;
        }

        @C0359n0
        /* renamed from: y0 */
        public C17092g mo51423y0(@C0363p0 Uri uri, int i) {
            Notification notification = this.f45216U;
            notification.sound = uri;
            notification.audioStreamType = i;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: z */
        public long mo51424z() {
            if (this.f45233n) {
                return this.f45216U.when;
            }
            return 0;
        }

        @C0359n0
        /* renamed from: z0 */
        public C17092g mo51425z0(@C0363p0 C17105q qVar) {
            if (this.f45236q != qVar) {
                this.f45236q = qVar;
                if (qVar != null) {
                    qVar.mo51489z(this);
                }
            }
            return this;
        }

        public C17092g(@C0359n0 Context context, @C0359n0 String str) {
            this.f45221b = new ArrayList<>();
            this.f45222c = new ArrayList<>();
            this.f45223d = new ArrayList<>();
            this.f45233n = true;
            this.f45196A = false;
            this.f45201F = 0;
            this.f45202G = 0;
            this.f45208M = 0;
            this.f45212Q = 0;
            this.f45213R = 0;
            Notification notification = new Notification();
            this.f45216U = notification;
            this.f45220a = context;
            this.f45207L = str;
            notification.when = System.currentTimeMillis();
            this.f45216U.audioStreamType = -1;
            this.f45232m = 0;
            this.f45219X = new ArrayList<>();
            this.f45214S = true;
        }

        @Deprecated
        public C17092g(@C0359n0 Context context) {
            this(context, (String) null);
        }
    }
}
