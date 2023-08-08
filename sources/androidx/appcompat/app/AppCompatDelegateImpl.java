package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0310u;
import androidx.activity.C0311v;
import androidx.annotation.C0327c1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.C0455b;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.C0535b;
import androidx.appcompat.view.C0538d;
import androidx.appcompat.view.C0541f;
import androidx.appcompat.view.C0543g;
import androidx.appcompat.view.C0548i;
import androidx.appcompat.view.menu.C0565e;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0704c0;
import androidx.appcompat.widget.C0716g;
import androidx.appcompat.widget.C0722h1;
import androidx.appcompat.widget.C0755o0;
import androidx.appcompat.widget.C0793t1;
import androidx.appcompat.widget.C0796u1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C1886l;
import androidx.core.app.C17065e0;
import androidx.core.content.C17318d;
import androidx.core.content.res.C17465i;
import androidx.core.p027os.C17812o;
import androidx.core.view.C18196h2;
import androidx.core.view.C18325o0;
import androidx.core.view.C18334p0;
import androidx.core.view.C18402w3;
import androidx.core.view.C18414x1;
import androidx.core.view.C18416x3;
import androidx.core.view.C18426y3;
import androidx.core.view.C18436z4;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import com.contentsquare.android.api.C14092c;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AppCompatDelegateImpl extends C0481i implements C0568g.C0569a, LayoutInflater.Factory2 {

    /* renamed from: K1 */
    public static final C1886l<String, Integer> f989K1 = new C1886l<>();

    /* renamed from: L1 */
    public static final boolean f990L1 = false;

    /* renamed from: M1 */
    public static final int[] f991M1 = {16842836};

    /* renamed from: N1 */
    public static final boolean f992N1 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: O1 */
    public static final boolean f993O1 = true;

    /* renamed from: P1 */
    public static boolean f994P1 = false;

    /* renamed from: Q1 */
    public static final String f995Q1 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: A1 */
    public boolean f996A1;

    /* renamed from: B1 */
    public int f997B1;

    /* renamed from: C1 */
    public final Runnable f998C1;

    /* renamed from: D1 */
    public boolean f999D1;

    /* renamed from: E1 */
    public Rect f1000E1;

    /* renamed from: F1 */
    public Rect f1001F1;

    /* renamed from: G1 */
    public C0494s f1002G1;

    /* renamed from: H1 */
    public C0502w f1003H1;

    /* renamed from: I1 */
    public OnBackInvokedDispatcher f1004I1;

    /* renamed from: J1 */
    public OnBackInvokedCallback f1005J1;

    /* renamed from: K0 */
    public final Object f1006K0;

    /* renamed from: L0 */
    public final Context f1007L0;

    /* renamed from: M0 */
    public Window f1008M0;

    /* renamed from: N0 */
    public C0433q f1009N0;

    /* renamed from: O0 */
    public final C0478f f1010O0;

    /* renamed from: P0 */
    public C0441a f1011P0;

    /* renamed from: Q0 */
    public MenuInflater f1012Q0;

    /* renamed from: R0 */
    public CharSequence f1013R0;

    /* renamed from: S0 */
    public C0704c0 f1014S0;

    /* renamed from: T0 */
    public C0425j f1015T0;

    /* renamed from: U0 */
    public C0440w f1016U0;

    /* renamed from: V0 */
    public C0535b f1017V0;

    /* renamed from: W0 */
    public ActionBarContextView f1018W0;

    /* renamed from: X0 */
    public PopupWindow f1019X0;

    /* renamed from: Y0 */
    public Runnable f1020Y0;

    /* renamed from: Z0 */
    public C18402w3 f1021Z0;

    /* renamed from: a1 */
    public boolean f1022a1;

    /* renamed from: b1 */
    public boolean f1023b1;

    /* renamed from: c1 */
    public ViewGroup f1024c1;

    /* renamed from: d1 */
    public TextView f1025d1;

    /* renamed from: e1 */
    public View f1026e1;

    /* renamed from: f1 */
    public boolean f1027f1;

    /* renamed from: g1 */
    public boolean f1028g1;

    /* renamed from: h1 */
    public boolean f1029h1;

    /* renamed from: i1 */
    public boolean f1030i1;

    /* renamed from: j1 */
    public boolean f1031j1;

    /* renamed from: k1 */
    public boolean f1032k1;

    /* renamed from: l1 */
    public boolean f1033l1;

    /* renamed from: m1 */
    public boolean f1034m1;

    /* renamed from: n1 */
    public PanelFeatureState[] f1035n1;

    /* renamed from: o1 */
    public PanelFeatureState f1036o1;

    /* renamed from: p1 */
    public boolean f1037p1;

    /* renamed from: q1 */
    public boolean f1038q1;

    /* renamed from: r1 */
    public boolean f1039r1;

    /* renamed from: s1 */
    public boolean f1040s1;

    /* renamed from: t1 */
    public Configuration f1041t1;

    /* renamed from: u1 */
    public int f1042u1;

    /* renamed from: v1 */
    public int f1043v1;

    /* renamed from: w1 */
    public int f1044w1;

    /* renamed from: x1 */
    public boolean f1045x1;

    /* renamed from: y1 */
    public C0435s f1046y1;

    /* renamed from: z1 */
    public C0435s f1047z1;

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f1048a;

        /* renamed from: b */
        public int f1049b;

        /* renamed from: c */
        public int f1050c;

        /* renamed from: d */
        public int f1051d;

        /* renamed from: e */
        public int f1052e;

        /* renamed from: f */
        public int f1053f;

        /* renamed from: g */
        public ViewGroup f1054g;

        /* renamed from: h */
        public View f1055h;

        /* renamed from: i */
        public View f1056i;

        /* renamed from: j */
        public C0568g f1057j;

        /* renamed from: k */
        public C0565e f1058k;

        /* renamed from: l */
        public Context f1059l;

        /* renamed from: m */
        public boolean f1060m;

        /* renamed from: n */
        public boolean f1061n;

        /* renamed from: o */
        public boolean f1062o;

        /* renamed from: p */
        public boolean f1063p;

        /* renamed from: q */
        public boolean f1064q = false;

        /* renamed from: r */
        public boolean f1065r;

        /* renamed from: s */
        public boolean f1066s;

        /* renamed from: t */
        public Bundle f1067t;

        /* renamed from: u */
        public Bundle f1068u;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0414a();

            /* renamed from: a */
            public int f1069a;

            /* renamed from: b */
            public boolean f1070b;

            /* renamed from: c */
            public Bundle f1071c;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            public class C0414a implements Parcelable.ClassLoaderCreator<SavedState> {
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m1712a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m1712a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            /* renamed from: a */
            public static SavedState m1712a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f1069a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f1070b = z;
                if (z) {
                    savedState.f1071c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1069a);
                parcel.writeInt(this.f1070b ? 1 : 0);
                if (this.f1070b) {
                    parcel.writeBundle(this.f1071c);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f1048a = i;
        }

        /* renamed from: a */
        public void mo1174a() {
            Bundle bundle;
            C0568g gVar = this.f1057j;
            if (gVar != null && (bundle = this.f1067t) != null) {
                gVar.mo2033U(bundle);
                this.f1067t = null;
            }
        }

        /* renamed from: b */
        public void mo1175b() {
            C0568g gVar = this.f1057j;
            if (gVar != null) {
                gVar.mo2031S(this.f1058k);
            }
            this.f1058k = null;
        }

        /* renamed from: c */
        public C0587o mo1176c(C0585n.C0586a aVar) {
            if (this.f1057j == null) {
                return null;
            }
            if (this.f1058k == null) {
                C0565e eVar = new C0565e(this.f1059l, C0387a.C0397j.abc_list_menu_item_layout);
                this.f1058k = eVar;
                eVar.mo1939e(aVar);
                this.f1057j.mo2050b(this.f1058k);
            }
            return this.f1058k.mo1942h(this.f1054g);
        }

        /* renamed from: d */
        public boolean mo1177d() {
            if (this.f1055h == null) {
                return false;
            }
            if (this.f1056i != null) {
                return true;
            }
            if (this.f1058k.mo1990a().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void mo1178e(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f1048a = savedState.f1069a;
            this.f1066s = savedState.f1070b;
            this.f1067t = savedState.f1071c;
            this.f1055h = null;
            this.f1054g = null;
        }

        /* renamed from: f */
        public Parcelable mo1179f() {
            SavedState savedState = new SavedState();
            savedState.f1069a = this.f1048a;
            savedState.f1070b = this.f1062o;
            if (this.f1057j != null) {
                Bundle bundle = new Bundle();
                savedState.f1071c = bundle;
                this.f1057j.mo2035W(bundle);
            }
            return savedState;
        }

        /* renamed from: g */
        public void mo1180g(C0568g gVar) {
            C0565e eVar;
            C0568g gVar2 = this.f1057j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo2031S(this.f1058k);
                }
                this.f1057j = gVar;
                if (gVar != null && (eVar = this.f1058k) != null) {
                    gVar.mo2050b(eVar);
                }
            }
        }

        /* renamed from: h */
        public void mo1181h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0387a.C0389b.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0387a.C0389b.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C0387a.C0399l.Theme_AppCompat_CompactMenu, true);
            }
            C0538d dVar = new C0538d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1059l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0387a.C0400m.AppCompatTheme);
            this.f1049b = obtainStyledAttributes.getResourceId(C0387a.C0400m.AppCompatTheme_panelBackground, 0);
            this.f1053f = obtainStyledAttributes.getResourceId(C0387a.C0400m.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class C0415a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f1072a;

        public C0415a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1072a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        public final boolean mo1190a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(@C0359n0 Thread thread, @C0359n0 Throwable th) {
            if (mo1190a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.f995Q1);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f1072a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f1072a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C0416b implements Runnable {
        public C0416b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f997B1 & 1) != 0) {
                appCompatDelegateImpl.mo1072B0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f997B1 & 4096) != 0) {
                appCompatDelegateImpl2.mo1072B0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f996A1 = false;
            appCompatDelegateImpl3.f997B1 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public class C0417c implements C18414x1 {
        public C0417c() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            int r = z4Var.mo53149r();
            int y1 = AppCompatDelegateImpl.this.mo1170y1(z4Var, (Rect) null);
            if (r != y1) {
                z4Var = z4Var.mo53123D(z4Var.mo53147p(), y1, z4Var.mo53148q(), z4Var.mo53146o());
            }
            return C18196h2.m82582g1(view, z4Var);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class C0418d implements C0755o0.C0756a {
        public C0418d() {
        }

        /* renamed from: a */
        public void mo1194a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.mo1170y1((C18436z4) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0419e implements ContentFrameLayout.C0640a {
        public C0419e() {
        }

        /* renamed from: a */
        public void mo1195a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo1172z0();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public class C0420f implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f$a */
        public class C0421a extends C18426y3 {
            public C0421a() {
            }

            /* renamed from: b */
            public void mo1198b(View view) {
                AppCompatDelegateImpl.this.f1018W0.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f1021Z0.mo53076u((C18416x3) null);
                AppCompatDelegateImpl.this.f1021Z0 = null;
            }

            /* renamed from: c */
            public void mo1199c(View view) {
                AppCompatDelegateImpl.this.f1018W0.setVisibility(0);
            }
        }

        public C0420f() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f1019X0.showAtLocation(appCompatDelegateImpl.f1018W0, 55, 0, 0);
            AppCompatDelegateImpl.this.mo1074C0();
            if (AppCompatDelegateImpl.this.mo1143o1()) {
                AppCompatDelegateImpl.this.f1018W0.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f1021Z0 = C18196h2.m82580g(appCompatDelegateImpl2.f1018W0).mo53058b(1.0f);
                AppCompatDelegateImpl.this.f1021Z0.mo53076u(new C0421a());
                return;
            }
            AppCompatDelegateImpl.this.f1018W0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f1018W0.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public class C0422g extends C18426y3 {
        public C0422g() {
        }

        /* renamed from: b */
        public void mo1198b(View view) {
            AppCompatDelegateImpl.this.f1018W0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f1021Z0.mo53076u((C18416x3) null);
            AppCompatDelegateImpl.this.f1021Z0 = null;
        }

        /* renamed from: c */
        public void mo1199c(View view) {
            AppCompatDelegateImpl.this.f1018W0.setVisibility(0);
            if (AppCompatDelegateImpl.this.f1018W0.getParent() instanceof View) {
                C18196h2.m82642v1((View) AppCompatDelegateImpl.this.f1018W0.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public class C0423h implements C0455b.C0457b {
        public C0423h() {
        }

        /* renamed from: a */
        public void mo1200a(Drawable drawable, int i) {
            C0441a C = AppCompatDelegateImpl.this.mo1073C();
            if (C != null) {
                C.mo1287l0(drawable);
                C.mo1281i0(i);
            }
        }

        /* renamed from: b */
        public Drawable mo1201b() {
            C0722h1 F = C0722h1.m3538F(mo1203d(), (AttributeSet) null, new int[]{C0387a.C0389b.homeAsUpIndicator});
            Drawable h = F.mo3466h(0);
            F.mo3458I();
            return h;
        }

        /* renamed from: c */
        public void mo1202c(int i) {
            C0441a C = AppCompatDelegateImpl.this.mo1073C();
            if (C != null) {
                C.mo1281i0(i);
            }
        }

        /* renamed from: d */
        public Context mo1203d() {
            return AppCompatDelegateImpl.this.mo1081H0();
        }

        /* renamed from: e */
        public boolean mo1204e() {
            C0441a C = AppCompatDelegateImpl.this.mo1073C();
            if (C == null || (C.mo1294p() & 4) == 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public interface C0424i {
        /* renamed from: a */
        boolean mo1205a(int i);

        @C0363p0
        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public final class C0425j implements C0585n.C0586a {
        public C0425j() {
        }

        /* renamed from: b */
        public void mo1207b(@C0359n0 C0568g gVar, boolean z) {
            AppCompatDelegateImpl.this.mo1156t0(gVar);
        }

        /* renamed from: c */
        public boolean mo1208c(@C0359n0 C0568g gVar) {
            Window.Callback Q0 = AppCompatDelegateImpl.this.mo1097Q0();
            if (Q0 == null) {
                return true;
            }
            Q0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public class C0426k implements C0535b.C0536a {

        /* renamed from: a */
        public C0535b.C0536a f1082a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k$a */
        public class C0427a extends C18426y3 {
            public C0427a() {
            }

            /* renamed from: b */
            public void mo1198b(View view) {
                AppCompatDelegateImpl.this.f1018W0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f1019X0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f1018W0.getParent() instanceof View) {
                    C18196h2.m82642v1((View) AppCompatDelegateImpl.this.f1018W0.getParent());
                }
                AppCompatDelegateImpl.this.f1018W0.mo2361t();
                AppCompatDelegateImpl.this.f1021Z0.mo53076u((C18416x3) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f1021Z0 = null;
                C18196h2.m82642v1(appCompatDelegateImpl2.f1024c1);
            }
        }

        public C0426k(C0535b.C0536a aVar) {
            this.f1082a = aVar;
        }

        /* renamed from: a */
        public void mo1209a(C0535b bVar) {
            this.f1082a.mo1209a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f1019X0 != null) {
                appCompatDelegateImpl.f1008M0.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f1020Y0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f1018W0 != null) {
                appCompatDelegateImpl2.mo1074C0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f1021Z0 = C18196h2.m82580g(appCompatDelegateImpl3.f1018W0).mo53058b(0.0f);
                AppCompatDelegateImpl.this.f1021Z0.mo53076u(new C0427a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0478f fVar = appCompatDelegateImpl4.f1010O0;
            if (fVar != null) {
                fVar.mo1514z(appCompatDelegateImpl4.f1017V0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f1017V0 = null;
            C18196h2.m82642v1(appCompatDelegateImpl5.f1024c1);
            AppCompatDelegateImpl.this.mo1165w1();
        }

        /* renamed from: b */
        public boolean mo1210b(C0535b bVar, Menu menu) {
            return this.f1082a.mo1210b(bVar, menu);
        }

        /* renamed from: c */
        public boolean mo1211c(C0535b bVar, MenuItem menuItem) {
            return this.f1082a.mo1211c(bVar, menuItem);
        }

        /* renamed from: d */
        public boolean mo1212d(C0535b bVar, Menu menu) {
            C18196h2.m82642v1(AppCompatDelegateImpl.this.f1024c1);
            return this.f1082a.mo1212d(bVar, menu);
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public static class C0428l {
        /* renamed from: a */
        public static Context m1737a(@C0359n0 Context context, @C0359n0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m1738b(@C0359n0 Configuration configuration, @C0359n0 Configuration configuration2, @C0359n0 Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        @C0373u
        /* renamed from: c */
        public static void m1739c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @C0373u
        /* renamed from: d */
        public static void m1740d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public static class C0429m {
        /* renamed from: a */
        public static boolean m1741a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @C0373u
        /* renamed from: b */
        public static String m1742b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    public static class C0430n {
        @C0373u
        /* renamed from: a */
        public static void m1743a(@C0359n0 Configuration configuration, @C0359n0 Configuration configuration2, @C0359n0 Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        @C0373u
        /* renamed from: b */
        public static C17812o m1744b(Configuration configuration) {
            return C17812o.m81211c(configuration.getLocales().toLanguageTags());
        }

        @C0373u
        /* renamed from: c */
        public static void m1745c(C17812o oVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(oVar.mo52240m()));
        }

        @C0373u
        /* renamed from: d */
        public static void m1746d(Configuration configuration, C17812o oVar) {
            configuration.setLocales(LocaleList.forLanguageTags(oVar.mo52240m()));
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    public static class C0431o {
        /* renamed from: a */
        public static void m1747a(@C0359n0 Configuration configuration, @C0359n0 Configuration configuration2, @C0359n0 Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 3);
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 12);
            }
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    public static class C0432p {
        @C0373u
        /* renamed from: a */
        public static OnBackInvokedDispatcher m1748a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @C0373u
        /* renamed from: b */
        public static OnBackInvokedCallback m1749b(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            C0490o oVar = new C0490o(appCompatDelegateImpl);
            C0310u.m1557a(obj).registerOnBackInvokedCallback(1000000, oVar);
            return oVar;
        }

        @C0373u
        /* renamed from: c */
        public static void m1750c(Object obj, Object obj2) {
            C0310u.m1557a(obj).unregisterOnBackInvokedCallback(C0311v.m1558a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    public class C0433q extends C0548i {

        /* renamed from: b */
        public C0424i f1085b;

        /* renamed from: c */
        public boolean f1086c;

        /* renamed from: d */
        public boolean f1087d;

        /* renamed from: e */
        public boolean f1088e;

        public C0433q(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo1213b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f1087d = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f1087d = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f1087d = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo1214c(Window.Callback callback) {
            try {
                this.f1086c = true;
                callback.onContentChanged();
                this.f1086c = false;
            } catch (Throwable th) {
                this.f1086c = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo1215d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f1088e = true;
                callback.onPanelClosed(i, menu);
                this.f1088e = false;
            } catch (Throwable th) {
                this.f1088e = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f1087d) {
                return mo1815a().dispatchKeyEvent(keyEvent);
            }
            if (AppCompatDelegateImpl.this.mo1071A0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo1113a1(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void mo1218e(@C0363p0 C0424i iVar) {
            this.f1085b = iVar;
        }

        /* renamed from: f */
        public final ActionMode mo1219f(ActionMode.Callback callback) {
            C0541f.C0542a aVar = new C0541f.C0542a(AppCompatDelegateImpl.this.f1007L0, callback);
            C0535b k0 = AppCompatDelegateImpl.this.mo1134k0(aVar);
            if (k0 != null) {
                return aVar.mo1790e(k0);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f1086c) {
                mo1815a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0568g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            C0424i iVar = this.f1085b;
            if (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i)) == null) {
                return super.onCreatePanelView(i);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo1119d1(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f1088e) {
                mo1815a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo1120e1(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0568g gVar;
            if (menu instanceof C0568g) {
                gVar = (C0568g) menu;
            } else {
                gVar = null;
            }
            if (i == 0 && gVar == null) {
                return false;
            }
            boolean z = true;
            if (gVar != null) {
                gVar.mo2071i0(true);
            }
            C0424i iVar = this.f1085b;
            if (iVar == null || !iVar.mo1205a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (gVar != null) {
                gVar.mo2071i0(false);
            }
            return z;
        }

        @C0376v0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0568g gVar;
            PanelFeatureState N0 = AppCompatDelegateImpl.this.mo1091N0(0, true);
            if (N0 == null || (gVar = N0.f1057j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @C0376v0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo1082I() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo1219f(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    public class C0434r extends C0435s {

        /* renamed from: c */
        public final PowerManager f1090c;

        public C0434r(@C0359n0 Context context) {
            super();
            this.f1090c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public IntentFilter mo1229b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1230c() {
            return C0429m.m1741a(this.f1090c) ? 2 : 1;
        }

        /* renamed from: e */
        public void mo1231e() {
            AppCompatDelegateImpl.this.mo1127h();
        }
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    public abstract class C0435s {

        /* renamed from: a */
        public BroadcastReceiver f1092a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s$a */
        public class C0436a extends BroadcastReceiver {
            public C0436a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0435s.this.mo1231e();
            }
        }

        public C0435s() {
        }

        /* renamed from: a */
        public void mo1232a() {
            BroadcastReceiver broadcastReceiver = this.f1092a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f1007L0.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1092a = null;
            }
        }

        @C0363p0
        /* renamed from: b */
        public abstract IntentFilter mo1229b();

        /* renamed from: c */
        public abstract int mo1230c();

        /* renamed from: d */
        public boolean mo1233d() {
            return this.f1092a != null;
        }

        /* renamed from: e */
        public abstract void mo1231e();

        /* renamed from: f */
        public void mo1234f() {
            mo1232a();
            IntentFilter b = mo1229b();
            if (b != null && b.countActions() != 0) {
                if (this.f1092a == null) {
                    this.f1092a = new C0436a();
                }
                AppCompatDelegateImpl.this.f1007L0.registerReceiver(this.f1092a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    public class C0437t extends C0435s {

        /* renamed from: c */
        public final C0465c0 f1095c;

        public C0437t(@C0359n0 C0465c0 c0Var) {
            super();
            this.f1095c = c0Var;
        }

        /* renamed from: b */
        public IntentFilter mo1229b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1230c() {
            return this.f1095c.mo1369d() ? 2 : 1;
        }

        /* renamed from: e */
        public void mo1231e() {
            AppCompatDelegateImpl.this.mo1127h();
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$u */
    public static class C0438u {
        /* renamed from: a */
        public static void m1768a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$v */
    public class C0439v extends ContentFrameLayout {
        public C0439v(Context context) {
            super(context);
        }

        /* renamed from: b */
        public final boolean mo1236b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo1071A0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !mo1236b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo1161v0(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0507a.m2346b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$w */
    public final class C0440w implements C0585n.C0586a {
        public C0440w() {
        }

        /* renamed from: b */
        public void mo1207b(@C0359n0 C0568g gVar, boolean z) {
            boolean z2;
            C0568g G = gVar.mo2019G();
            if (G != gVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                gVar = G;
            }
            PanelFeatureState F0 = appCompatDelegateImpl.mo1080F0(gVar);
            if (F0 == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo1154s0(F0.f1048a, F0, G);
                AppCompatDelegateImpl.this.mo1164w0(F0, true);
                return;
            }
            AppCompatDelegateImpl.this.mo1164w0(F0, z);
        }

        /* renamed from: c */
        public boolean mo1208c(@C0359n0 C0568g gVar) {
            Window.Callback Q0;
            if (gVar != gVar.mo2019G()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f1029h1 || (Q0 = appCompatDelegateImpl.mo1097Q0()) == null || AppCompatDelegateImpl.this.f1040s1) {
                return true;
            }
            Q0.onMenuOpened(108, gVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, C0478f fVar) {
        this(activity, (Window) null, fVar, activity);
    }

    @C0359n0
    /* renamed from: G0 */
    public static Configuration m1602G0(@C0359n0 Configuration configuration, @C0363p0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            C0430n.m1743a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & C14092c.f34560U;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & C14092c.f34560U)) {
                configuration3.screenLayout |= i21 & C14092c.f34560U;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0431o.m1747a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C0428l.m1738b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: A0 */
    public boolean mo1071A0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1006K0;
        boolean z = true;
        if (((obj instanceof C18325o0.C18326a) || (obj instanceof C0492q)) && (decorView = this.f1008M0.getDecorView()) != null && C18325o0.m83026d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1009N0.mo1213b(this.f1008M0.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        if (z) {
            return mo1108Y0(keyCode, keyEvent);
        }
        return mo1116b1(keyCode, keyEvent);
    }

    /* renamed from: B0 */
    public void mo1072B0(int i) {
        PanelFeatureState N0;
        PanelFeatureState N02 = mo1091N0(i, true);
        if (N02.f1057j != null) {
            Bundle bundle = new Bundle();
            N02.f1057j.mo2034V(bundle);
            if (bundle.size() > 0) {
                N02.f1068u = bundle;
            }
            N02.f1057j.mo2080m0();
            N02.f1057j.clear();
        }
        N02.f1065r = true;
        N02.f1064q = true;
        if ((i == 108 || i == 0) && this.f1014S0 != null && (N0 = mo1091N0(0, false)) != null) {
            N0.f1060m = false;
            mo1133j1(N0, (KeyEvent) null);
        }
    }

    /* renamed from: C */
    public C0441a mo1073C() {
        mo1099R0();
        return this.f1011P0;
    }

    /* renamed from: C0 */
    public void mo1074C0() {
        C18402w3 w3Var = this.f1021Z0;
        if (w3Var != null) {
            w3Var.mo53060d();
        }
    }

    /* renamed from: D */
    public boolean mo1075D(int i) {
        boolean z;
        int l1 = mo1136l1(i);
        if (l1 == 1) {
            z = this.f1033l1;
        } else if (l1 == 2) {
            z = this.f1027f1;
        } else if (l1 == 5) {
            z = this.f1028g1;
        } else if (l1 == 10) {
            z = this.f1031j1;
        } else if (l1 == 108) {
            z = this.f1029h1;
        } else if (l1 != 109) {
            z = false;
        } else {
            z = this.f1030i1;
        }
        if (z || this.f1008M0.hasFeature(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: D0 */
    public final void mo1076D0() {
        if (!this.f1023b1) {
            this.f1024c1 = mo1169y0();
            CharSequence P0 = mo1095P0();
            if (!TextUtils.isEmpty(P0)) {
                C0704c0 c0Var = this.f1014S0;
                if (c0Var != null) {
                    c0Var.setWindowTitle(P0);
                } else if (mo1129h1() != null) {
                    mo1129h1().mo1243B0(P0);
                } else {
                    TextView textView = this.f1025d1;
                    if (textView != null) {
                        textView.setText(P0);
                    }
                }
            }
            mo1142o0();
            mo1123f1(this.f1024c1);
            this.f1023b1 = true;
            PanelFeatureState N0 = mo1091N0(0, false);
            if (this.f1040s1) {
                return;
            }
            if (N0 == null || N0.f1057j == null) {
                mo1105V0(108);
            }
        }
    }

    /* renamed from: E */
    public void mo1077E() {
        LayoutInflater from = LayoutInflater.from(this.f1007L0);
        if (from.getFactory() == null) {
            C18334p0.m83051d(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    /* renamed from: E0 */
    public final void mo1078E0() {
        if (this.f1008M0 == null) {
            Object obj = this.f1006K0;
            if (obj instanceof Activity) {
                mo1146p0(((Activity) obj).getWindow());
            }
        }
        if (this.f1008M0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: F */
    public void mo1079F() {
        if (mo1129h1() != null && !mo1073C().mo1246D()) {
            mo1105V0(0);
        }
    }

    /* renamed from: F0 */
    public PanelFeatureState mo1080F0(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f1035n1;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f1057j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: H0 */
    public final Context mo1081H0() {
        Context context;
        C0441a C = mo1073C();
        if (C != null) {
            context = C.mo1240A();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f1007L0;
        }
        return context;
    }

    /* renamed from: I */
    public boolean mo1082I() {
        return this.f1022a1;
    }

    /* renamed from: I0 */
    public final int mo1083I0(Context context) {
        int i;
        if (!this.f1045x1 && (this.f1006K0 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else {
                    i = 786432;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f1006K0.getClass()), i);
                if (activityInfo != null) {
                    this.f1044w1 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f1044w1 = 0;
            }
        }
        this.f1045x1 = true;
        return this.f1044w1;
    }

    /* renamed from: J0 */
    public final C0435s mo1084J0(@C0359n0 Context context) {
        if (this.f1047z1 == null) {
            this.f1047z1 = new C0434r(context);
        }
        return this.f1047z1;
    }

    @C0344h1
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: K0 */
    public final C0435s mo1085K0() {
        return mo1087L0(this.f1007L0);
    }

    /* renamed from: L */
    public void mo1086L(Configuration configuration) {
        C0441a C;
        if (this.f1029h1 && this.f1023b1 && (C = mo1073C()) != null) {
            C.mo1252I(configuration);
        }
        C0716g.m3506b().mo3430g(this.f1007L0);
        this.f1041t1 = new Configuration(this.f1007L0.getResources().getConfiguration());
        mo1140n0(false, false);
    }

    /* renamed from: L0 */
    public final C0435s mo1087L0(@C0359n0 Context context) {
        if (this.f1046y1 == null) {
            this.f1046y1 = new C0437t(C0465c0.m1993a(context));
        }
        return this.f1046y1;
    }

    /* renamed from: M */
    public void mo1088M(Bundle bundle) {
        String str;
        this.f1038q1 = true;
        mo1138m0(false);
        mo1078E0();
        Object obj = this.f1006K0;
        if (obj instanceof Activity) {
            try {
                str = C17065e0.m78905d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0441a h1 = mo1129h1();
                if (h1 == null) {
                    this.f999D1 = true;
                } else {
                    h1.mo1267X(true);
                }
            }
            C0481i.m2236e(this);
        }
        this.f1041t1 = new Configuration(this.f1007L0.getResources().getConfiguration());
        this.f1039r1 = true;
    }

    /* renamed from: M0 */
    public C17812o mo1089M0(Configuration configuration) {
        return C0430n.m1744b(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1090N() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1006K0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0481i.m2228T(r3)
        L_0x0009:
            boolean r0 = r3.f996A1
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f1008M0
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f998C1
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f1040s1 = r0
            int r0 = r3.f1042u1
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f1006K0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            androidx.collection.l<java.lang.String, java.lang.Integer> r0 = f989K1
            java.lang.Object r1 = r3.f1006K0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1042u1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            androidx.collection.l<java.lang.String, java.lang.Integer> r0 = f989K1
            java.lang.Object r1 = r3.f1006K0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f1011P0
            if (r0 == 0) goto L_0x005b
            r0.mo1253J()
        L_0x005b:
            r3.mo1159u0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1090N():void");
    }

    /* renamed from: N0 */
    public PanelFeatureState mo1091N0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f1035n1;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f1035n1 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: O */
    public void mo1092O(Bundle bundle) {
        mo1076D0();
    }

    /* renamed from: O0 */
    public ViewGroup mo1093O0() {
        return this.f1024c1;
    }

    /* renamed from: P */
    public void mo1094P() {
        C0441a C = mo1073C();
        if (C != null) {
            C.mo1305u0(true);
        }
    }

    /* renamed from: P0 */
    public final CharSequence mo1095P0() {
        Object obj = this.f1006K0;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f1013R0;
    }

    /* renamed from: Q */
    public void mo1096Q(Bundle bundle) {
    }

    /* renamed from: Q0 */
    public final Window.Callback mo1097Q0() {
        return this.f1008M0.getCallback();
    }

    /* renamed from: R */
    public void mo1098R() {
        mo1140n0(true, false);
    }

    /* renamed from: R0 */
    public final void mo1099R0() {
        mo1076D0();
        if (this.f1029h1 && this.f1011P0 == null) {
            Object obj = this.f1006K0;
            if (obj instanceof Activity) {
                this.f1011P0 = new C0469d0((Activity) this.f1006K0, this.f1030i1);
            } else if (obj instanceof Dialog) {
                this.f1011P0 = new C0469d0((Dialog) this.f1006K0);
            }
            C0441a aVar = this.f1011P0;
            if (aVar != null) {
                aVar.mo1267X(this.f999D1);
            }
        }
    }

    /* renamed from: S */
    public void mo1100S() {
        C0441a C = mo1073C();
        if (C != null) {
            C.mo1305u0(false);
        }
    }

    /* renamed from: S0 */
    public final boolean mo1101S0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f1056i;
        if (view != null) {
            panelFeatureState.f1055h = view;
            return true;
        } else if (panelFeatureState.f1057j == null) {
            return false;
        } else {
            if (this.f1016U0 == null) {
                this.f1016U0 = new C0440w();
            }
            View view2 = (View) panelFeatureState.mo1176c(this.f1016U0);
            panelFeatureState.f1055h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: T0 */
    public final boolean mo1102T0(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo1181h(mo1081H0());
        panelFeatureState.f1054g = new C0439v(panelFeatureState.f1059l);
        panelFeatureState.f1050c = 81;
        return true;
    }

    /* renamed from: U0 */
    public final boolean mo1103U0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f1007L0;
        int i = panelFeatureState.f1048a;
        if ((i == 0 || i == 108) && this.f1014S0 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C0387a.C0389b.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C0387a.C0389b.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(C0387a.C0389b.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C0538d dVar = new C0538d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        C0568g gVar = new C0568g(context);
        gVar.mo2036X(this);
        panelFeatureState.mo1180g(gVar);
        return true;
    }

    /* renamed from: V */
    public boolean mo1104V(int i) {
        int l1 = mo1136l1(i);
        if (this.f1033l1 && l1 == 108) {
            return false;
        }
        if (this.f1029h1 && l1 == 1) {
            this.f1029h1 = false;
        }
        if (l1 == 1) {
            mo1155s1();
            this.f1033l1 = true;
            return true;
        } else if (l1 == 2) {
            mo1155s1();
            this.f1027f1 = true;
            return true;
        } else if (l1 == 5) {
            mo1155s1();
            this.f1028g1 = true;
            return true;
        } else if (l1 == 10) {
            mo1155s1();
            this.f1031j1 = true;
            return true;
        } else if (l1 == 108) {
            mo1155s1();
            this.f1029h1 = true;
            return true;
        } else if (l1 != 109) {
            return this.f1008M0.requestFeature(l1);
        } else {
            mo1155s1();
            this.f1030i1 = true;
            return true;
        }
    }

    /* renamed from: V0 */
    public final void mo1105V0(int i) {
        this.f997B1 = (1 << i) | this.f997B1;
        if (!this.f996A1) {
            C18196h2.m82618p1(this.f1008M0.getDecorView(), this.f998C1);
            this.f996A1 = true;
        }
    }

    /* renamed from: W0 */
    public int mo1106W0(@C0359n0 Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return mo1084J0(context).mo1230c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return mo1087L0(context).mo1230c();
            }
        }
        return i;
    }

    /* renamed from: X0 */
    public boolean mo1107X0() {
        boolean z = this.f1037p1;
        this.f1037p1 = false;
        PanelFeatureState N0 = mo1091N0(0, false);
        if (N0 == null || !N0.f1062o) {
            C0535b bVar = this.f1017V0;
            if (bVar != null) {
                bVar.mo1452c();
                return true;
            }
            C0441a C = mo1073C();
            if (C == null || !C.mo1288m()) {
                return false;
            }
            return true;
        }
        if (!z) {
            mo1164w0(N0, true);
        }
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo1108Y0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1037p1 = z;
        } else if (i == 82) {
            mo1110Z0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public void mo1109Z(int i) {
        mo1076D0();
        ViewGroup viewGroup = (ViewGroup) this.f1024c1.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1007L0).inflate(i, viewGroup);
        this.f1009N0.mo1214c(this.f1008M0.getCallback());
    }

    /* renamed from: Z0 */
    public final boolean mo1110Z0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState N0 = mo1091N0(i, true);
        if (!N0.f1062o) {
            return mo1133j1(N0, keyEvent);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
        PanelFeatureState F0;
        Window.Callback Q0 = mo1097Q0();
        if (Q0 == null || this.f1040s1 || (F0 = mo1080F0(gVar.mo2019G())) == null) {
            return false;
        }
        return Q0.onMenuItemSelected(F0.f1048a, menuItem);
    }

    /* renamed from: a0 */
    public void mo1112a0(View view) {
        mo1076D0();
        ViewGroup viewGroup = (ViewGroup) this.f1024c1.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1009N0.mo1214c(this.f1008M0.getCallback());
    }

    /* renamed from: a1 */
    public boolean mo1113a1(int i, KeyEvent keyEvent) {
        C0441a C = mo1073C();
        if (C != null && C.mo1254K(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f1036o1;
        if (panelFeatureState == null || !mo1131i1(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1036o1 == null) {
                PanelFeatureState N0 = mo1091N0(0, true);
                mo1133j1(N0, keyEvent);
                boolean i1 = mo1131i1(N0, keyEvent.getKeyCode(), keyEvent, 1);
                N0.f1060m = false;
                if (i1) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f1036o1;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f1061n = true;
        }
        return true;
    }

    /* renamed from: b */
    public void mo1114b(@C0359n0 C0568g gVar) {
        mo1135k1(true);
    }

    /* renamed from: b0 */
    public void mo1115b0(View view, ViewGroup.LayoutParams layoutParams) {
        mo1076D0();
        ViewGroup viewGroup = (ViewGroup) this.f1024c1.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1009N0.mo1214c(this.f1008M0.getCallback());
    }

    /* renamed from: b1 */
    public boolean mo1116b1(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                mo1117c1(0, keyEvent);
                return true;
            }
        } else if (mo1107X0()) {
            return true;
        }
        return false;
    }

    /* renamed from: c1 */
    public final boolean mo1117c1(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z;
        C0704c0 c0Var;
        if (this.f1017V0 != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState N0 = mo1091N0(i, true);
        if (i != 0 || (c0Var = this.f1014S0) == null || !c0Var.mo2372d() || ViewConfiguration.get(this.f1007L0).hasPermanentMenuKey()) {
            boolean z3 = N0.f1062o;
            if (z3 || N0.f1061n) {
                mo1164w0(N0, true);
                z2 = z3;
                if (z2 && (audioManager = (AudioManager) this.f1007L0.getApplicationContext().getSystemService("audio")) != null) {
                    audioManager.playSoundEffect(0);
                }
                return z2;
            } else if (N0.f1060m) {
                if (N0.f1065r) {
                    N0.f1060m = false;
                    z = mo1133j1(N0, keyEvent);
                } else {
                    z = true;
                }
                if (z) {
                    mo1126g1(N0, keyEvent);
                    audioManager.playSoundEffect(0);
                    return z2;
                }
            }
        } else {
            if (this.f1014S0.mo2377g()) {
                z2 = this.f1014S0.mo2374e();
            } else if (!this.f1040s1 && mo1133j1(N0, keyEvent)) {
                z2 = this.f1014S0.mo2375f();
            }
            audioManager.playSoundEffect(0);
            return z2;
        }
        z2 = false;
        audioManager.playSoundEffect(0);
        return z2;
    }

    /* renamed from: d0 */
    public void mo1118d0(boolean z) {
        this.f1022a1 = z;
    }

    /* renamed from: d1 */
    public void mo1119d1(int i) {
        C0441a C;
        if (i == 108 && (C = mo1073C()) != null) {
            C.mo1290n(true);
        }
    }

    /* renamed from: e1 */
    public void mo1120e1(int i) {
        if (i == 108) {
            C0441a C = mo1073C();
            if (C != null) {
                C.mo1290n(false);
            }
        } else if (i == 0) {
            PanelFeatureState N0 = mo1091N0(i, true);
            if (N0.f1062o) {
                mo1164w0(N0, false);
            }
        }
    }

    /* renamed from: f */
    public void mo1121f(View view, ViewGroup.LayoutParams layoutParams) {
        mo1076D0();
        ((ViewGroup) this.f1024c1.findViewById(16908290)).addView(view, layoutParams);
        this.f1009N0.mo1214c(this.f1008M0.getCallback());
    }

    @C0376v0(17)
    /* renamed from: f0 */
    public void mo1122f0(int i) {
        if (this.f1042u1 != i) {
            this.f1042u1 = i;
            if (this.f1038q1) {
                mo1127h();
            }
        }
    }

    /* renamed from: f1 */
    public void mo1123f1(ViewGroup viewGroup) {
    }

    /* renamed from: g */
    public boolean mo1124g() {
        if (C0481i.m2224G(this.f1007L0) && C0481i.m2222A() != null && !C0481i.m2222A().equals(C0481i.m2223B())) {
            mo1517k(this.f1007L0);
        }
        return mo1138m0(true);
    }

    @C0376v0(33)
    /* renamed from: g0 */
    public void mo1125g0(@C0363p0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo1125g0(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f1004I1;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f1005J1) == null)) {
            C0432p.m1750c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f1005J1 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f1006K0;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f1004I1 = C0432p.m1748a((Activity) this.f1006K0);
                mo1165w1();
            }
        }
        this.f1004I1 = onBackInvokedDispatcher;
        mo1165w1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1126g1(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f1062o
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r12.f1040s1
            if (r0 == 0) goto L_0x000a
            goto L_0x00f8
        L_0x000a:
            int r0 = r13.f1048a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f1007L0
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.mo1097Q0()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f1048a
            androidx.appcompat.view.menu.g r4 = r13.f1057j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.mo1164w0(r13, r2)
            return
        L_0x003b:
            android.content.Context r0 = r12.f1007L0
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.mo1133j1(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f1054g
            r3 = -2
            if (r14 == 0) goto L_0x006a
            boolean r4 = r13.f1064q
            if (r4 == 0) goto L_0x0059
            goto L_0x006a
        L_0x0059:
            android.view.View r14 = r13.f1056i
            if (r14 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x00cc
            int r14 = r14.width
            r4 = -1
            if (r14 != r4) goto L_0x00cc
            r5 = r4
            goto L_0x00cd
        L_0x006a:
            if (r14 != 0) goto L_0x0077
            boolean r14 = r12.mo1102T0(r13)
            if (r14 == 0) goto L_0x0076
            android.view.ViewGroup r14 = r13.f1054g
            if (r14 != 0) goto L_0x0086
        L_0x0076:
            return
        L_0x0077:
            boolean r4 = r13.f1064q
            if (r4 == 0) goto L_0x0086
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x0086
            android.view.ViewGroup r14 = r13.f1054g
            r14.removeAllViews()
        L_0x0086:
            boolean r14 = r12.mo1101S0(r13)
            if (r14 == 0) goto L_0x00f6
            boolean r14 = r13.mo1177d()
            if (r14 != 0) goto L_0x0093
            goto L_0x00f6
        L_0x0093:
            android.view.View r14 = r13.f1055h
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x00a0:
            int r4 = r13.f1049b
            android.view.ViewGroup r5 = r13.f1054g
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f1055h
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00b8
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f1055h
            r4.removeView(r5)
        L_0x00b8:
            android.view.ViewGroup r4 = r13.f1054g
            android.view.View r5 = r13.f1055h
            r4.addView(r5, r14)
            android.view.View r14 = r13.f1055h
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x00cc
            android.view.View r14 = r13.f1055h
            r14.requestFocus()
        L_0x00cc:
            r5 = r3
        L_0x00cd:
            r13.f1061n = r1
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            int r7 = r13.f1051d
            int r8 = r13.f1052e
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r1 = r13.f1050c
            r14.gravity = r1
            int r1 = r13.f1053f
            r14.windowAnimations = r1
            android.view.ViewGroup r1 = r13.f1054g
            r0.addView(r1, r14)
            r13.f1062o = r2
            int r13 = r13.f1048a
            if (r13 != 0) goto L_0x00f5
            r12.mo1165w1()
        L_0x00f5:
            return
        L_0x00f6:
            r13.f1064q = r2
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1126g1(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    /* renamed from: h */
    public boolean mo1127h() {
        return mo1138m0(true);
    }

    /* renamed from: h0 */
    public void mo1128h0(Toolbar toolbar) {
        if (this.f1006K0 instanceof Activity) {
            C0441a C = mo1073C();
            if (!(C instanceof C0469d0)) {
                this.f1012Q0 = null;
                if (C != null) {
                    C.mo1253J();
                }
                this.f1011P0 = null;
                if (toolbar != null) {
                    C0449a0 a0Var = new C0449a0(toolbar, mo1095P0(), this.f1009N0);
                    this.f1011P0 = a0Var;
                    this.f1009N0.mo1218e(a0Var.f1111k);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f1009N0.mo1218e((C0424i) null);
                }
                mo1079F();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: h1 */
    public final C0441a mo1129h1() {
        return this.f1011P0;
    }

    /* renamed from: i0 */
    public void mo1130i0(@C0327c1 int i) {
        this.f1043v1 = i;
    }

    /* renamed from: i1 */
    public final boolean mo1131i1(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C0568g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f1060m || mo1133j1(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f1057j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1014S0 == null) {
            mo1164w0(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: j0 */
    public final void mo1132j0(CharSequence charSequence) {
        this.f1013R0 = charSequence;
        C0704c0 c0Var = this.f1014S0;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (mo1129h1() != null) {
            mo1129h1().mo1243B0(charSequence);
        } else {
            TextView textView = this.f1025d1;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: j1 */
    public final boolean mo1133j1(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        C0704c0 c0Var;
        C0704c0 c0Var2;
        C0704c0 c0Var3;
        if (this.f1040s1) {
            return false;
        }
        if (panelFeatureState.f1060m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f1036o1;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo1164w0(panelFeatureState2, false);
        }
        Window.Callback Q0 = mo1097Q0();
        if (Q0 != null) {
            panelFeatureState.f1056i = Q0.onCreatePanelView(panelFeatureState.f1048a);
        }
        int i2 = panelFeatureState.f1048a;
        if (i2 == 0 || i2 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c0Var3 = this.f1014S0) != null) {
            c0Var3.setMenuPrepared();
        }
        if (panelFeatureState.f1056i == null && (!z || !(mo1129h1() instanceof C0449a0))) {
            C0568g gVar = panelFeatureState.f1057j;
            if (gVar == null || panelFeatureState.f1065r) {
                if (gVar == null && (!mo1103U0(panelFeatureState) || panelFeatureState.f1057j == null)) {
                    return false;
                }
                if (z && this.f1014S0 != null) {
                    if (this.f1015T0 == null) {
                        this.f1015T0 = new C0425j();
                    }
                    this.f1014S0.setMenu(panelFeatureState.f1057j, this.f1015T0);
                }
                panelFeatureState.f1057j.mo2080m0();
                if (!Q0.onCreatePanelMenu(panelFeatureState.f1048a, panelFeatureState.f1057j)) {
                    panelFeatureState.mo1180g((C0568g) null);
                    if (z && (c0Var2 = this.f1014S0) != null) {
                        c0Var2.setMenu((Menu) null, this.f1015T0);
                    }
                    return false;
                }
                panelFeatureState.f1065r = false;
            }
            panelFeatureState.f1057j.mo2080m0();
            Bundle bundle = panelFeatureState.f1068u;
            if (bundle != null) {
                panelFeatureState.f1057j.mo2032T(bundle);
                panelFeatureState.f1068u = null;
            }
            if (!Q0.onPreparePanel(0, panelFeatureState.f1056i, panelFeatureState.f1057j)) {
                if (z && (c0Var = this.f1014S0) != null) {
                    c0Var.setMenu((Menu) null, this.f1015T0);
                }
                panelFeatureState.f1057j.mo2078l0();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f1063p = z2;
            panelFeatureState.f1057j.setQwertyMode(z2);
            panelFeatureState.f1057j.mo2078l0();
        }
        panelFeatureState.f1060m = true;
        panelFeatureState.f1061n = false;
        this.f1036o1 = panelFeatureState;
        return true;
    }

    /* renamed from: k0 */
    public C0535b mo1134k0(@C0359n0 C0535b.C0536a aVar) {
        C0478f fVar;
        if (aVar != null) {
            C0535b bVar = this.f1017V0;
            if (bVar != null) {
                bVar.mo1452c();
            }
            C0426k kVar = new C0426k(aVar);
            C0441a C = mo1073C();
            if (C != null) {
                C0535b D0 = C.mo1247D0(kVar);
                this.f1017V0 = D0;
                if (!(D0 == null || (fVar = this.f1010O0) == null)) {
                    fVar.mo1513y(D0);
                }
            }
            if (this.f1017V0 == null) {
                this.f1017V0 = mo1152r1(kVar);
            }
            mo1165w1();
            return this.f1017V0;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: k1 */
    public final void mo1135k1(boolean z) {
        C0704c0 c0Var = this.f1014S0;
        if (c0Var == null || !c0Var.mo2372d() || (ViewConfiguration.get(this.f1007L0).hasPermanentMenuKey() && !this.f1014S0.mo2385i())) {
            PanelFeatureState N0 = mo1091N0(0, true);
            N0.f1064q = true;
            mo1164w0(N0, false);
            mo1126g1(N0, (KeyEvent) null);
            return;
        }
        Window.Callback Q0 = mo1097Q0();
        if (this.f1014S0.mo2377g() && z) {
            this.f1014S0.mo2374e();
            if (!this.f1040s1) {
                Q0.onPanelClosed(108, mo1091N0(0, true).f1057j);
            }
        } else if (Q0 != null && !this.f1040s1) {
            if (this.f996A1 && (this.f997B1 & 1) != 0) {
                this.f1008M0.getDecorView().removeCallbacks(this.f998C1);
                this.f998C1.run();
            }
            PanelFeatureState N02 = mo1091N0(0, true);
            C0568g gVar = N02.f1057j;
            if (gVar != null && !N02.f1065r && Q0.onPreparePanel(0, N02.f1056i, gVar)) {
                Q0.onMenuOpened(108, N02.f1057j);
                this.f1014S0.mo2375f();
            }
        }
    }

    /* renamed from: l1 */
    public final int mo1136l1(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    @C0359n0
    @C0346i
    /* renamed from: m */
    public Context mo1137m(@C0359n0 Context context) {
        Configuration configuration;
        boolean z = true;
        this.f1038q1 = true;
        int W0 = mo1106W0(context, mo1151r0());
        if (C0481i.m2224G(context)) {
            C0481i.m2240l0(context);
        }
        C17812o q0 = mo1148q0(context);
        if (f993O1 && (context instanceof ContextThemeWrapper)) {
            try {
                C0438u.m1768a((ContextThemeWrapper) context, mo1167x0(context, W0, q0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0538d) {
            try {
                ((C0538d) context).mo1759a(mo1167x0(context, W0, q0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f992N1) {
            return super.mo1137m(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C0428l.m1737a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m1602G0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration x0 = mo1167x0(context, W0, q0, configuration, true);
        C0538d dVar = new C0538d(context, C0387a.C0399l.Theme_AppCompat_Empty);
        dVar.mo1759a(x0);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C17465i.C17473h.m80201a(dVar.getTheme());
        }
        return super.mo1137m(dVar);
    }

    /* renamed from: m0 */
    public final boolean mo1138m0(boolean z) {
        return mo1140n0(z, true);
    }

    /* renamed from: m1 */
    public void mo1139m1(Configuration configuration, @C0359n0 C17812o oVar) {
        C0430n.m1746d(configuration, oVar);
    }

    /* renamed from: n0 */
    public final boolean mo1140n0(boolean z, boolean z2) {
        C17812o oVar;
        if (this.f1040s1) {
            return false;
        }
        int r0 = mo1151r0();
        int W0 = mo1106W0(this.f1007L0, r0);
        if (Build.VERSION.SDK_INT < 33) {
            oVar = mo1148q0(this.f1007L0);
        } else {
            oVar = null;
        }
        if (!z2 && oVar != null) {
            oVar = mo1089M0(this.f1007L0.getResources().getConfiguration());
        }
        boolean v1 = mo1162v1(W0, oVar, z);
        if (r0 == 0) {
            mo1087L0(this.f1007L0).mo1234f();
        } else {
            C0435s sVar = this.f1046y1;
            if (sVar != null) {
                sVar.mo1232a();
            }
        }
        if (r0 == 3) {
            mo1084J0(this.f1007L0).mo1234f();
        } else {
            C0435s sVar2 = this.f1047z1;
            if (sVar2 != null) {
                sVar2.mo1232a();
            }
        }
        return v1;
    }

    /* renamed from: n1 */
    public void mo1141n1(C17812o oVar) {
        C0430n.m1745c(oVar);
    }

    /* renamed from: o0 */
    public final void mo1142o0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1024c1.findViewById(16908290);
        View decorView = this.f1008M0.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1007L0.obtainStyledAttributes(C0387a.C0400m.AppCompatTheme);
        obtainStyledAttributes.getValue(C0387a.C0400m.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0387a.C0400m.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i = C0387a.C0400m.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C0387a.C0400m.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C0387a.C0400m.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C0387a.C0400m.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1024c1;
     */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1143o1() {
        /*
            r1 = this;
            boolean r0 = r1.f1023b1
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f1024c1
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.C18196h2.m82539U0(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1143o1():boolean");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo1150r(view, str, context, attributeSet);
    }

    /* renamed from: p0 */
    public final void mo1146p0(@C0359n0 Window window) {
        if (this.f1008M0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0433q)) {
                C0433q qVar = new C0433q(callback);
                this.f1009N0 = qVar;
                window.setCallback(qVar);
                C0722h1 F = C0722h1.m3538F(this.f1007L0, (AttributeSet) null, f991M1);
                Drawable i = F.mo3467i(0);
                if (i != null) {
                    window.setBackgroundDrawable(i);
                }
                F.mo3458I();
                this.f1008M0 = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f1004I1 == null) {
                    mo1125g0((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: p1 */
    public final boolean mo1147p1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1008M0.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C18196h2.m82521O0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @C0363p0
    /* renamed from: q0 */
    public C17812o mo1148q0(@C0359n0 Context context) {
        C17812o A;
        if (Build.VERSION.SDK_INT >= 33 || (A = C0481i.m2222A()) == null) {
            return null;
        }
        C17812o M0 = mo1089M0(context.getApplicationContext().getResources().getConfiguration());
        C17812o c = C0503x.m2338c(A, M0);
        if (c.mo52238j()) {
            return M0;
        }
        return c;
    }

    /* renamed from: q1 */
    public boolean mo1149q1() {
        if (this.f1004I1 == null) {
            return false;
        }
        PanelFeatureState N0 = mo1091N0(0, false);
        if ((N0 == null || !N0.f1062o) && this.f1017V0 == null) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public View mo1150r(View view, String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f1002G1 == null) {
            String string = this.f1007L0.obtainStyledAttributes(C0387a.C0400m.AppCompatTheme).getString(C0387a.C0400m.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f1002G1 = new C0494s();
            } else {
                try {
                    this.f1002G1 = (C0494s) this.f1007L0.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.f1002G1 = new C0494s();
                }
            }
        }
        boolean z3 = f990L1;
        if (z3) {
            if (this.f1003H1 == null) {
                this.f1003H1 = new C0502w();
            }
            if (this.f1003H1.mo1560a(attributeSet)) {
                z = true;
                return this.f1002G1.mo1549r(view, str, context, attributeSet, z, z3, true, C0793t1.m3855d());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z2 = mo1147p1((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
        }
        z = z2;
        return this.f1002G1.mo1549r(view, str, context, attributeSet, z, z3, true, C0793t1.m3855d());
    }

    /* renamed from: r0 */
    public final int mo1151r0() {
        int i = this.f1042u1;
        return i != -100 ? i : C0481i.m2246v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.C0535b mo1152r1(@androidx.annotation.C0359n0 androidx.appcompat.view.C0535b.C0536a r8) {
        /*
            r7 = this;
            r7.mo1074C0()
            androidx.appcompat.view.b r0 = r7.f1017V0
            if (r0 == 0) goto L_0x000a
            r0.mo1452c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0426k
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$k r0 = new androidx.appcompat.app.AppCompatDelegateImpl$k
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.f r0 = r7.f1010O0
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f1040s1
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.mo1476E(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f1017V0 = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1018W0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f1032k1
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1007L0
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.C0387a.C0389b.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f1007L0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f1007L0
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f1007L0
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1018W0 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.C0387a.C0389b.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f1019X0 = r5
            r6 = 2
            androidx.core.widget.C18492o.m83694d(r5, r6)
            android.widget.PopupWindow r5 = r7.f1019X0
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f1018W0
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1019X0
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.C0387a.C0389b.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1018W0
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1019X0
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>()
            r7.f1020Y0 = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f1024c1
            int r4 = androidx.appcompat.C0387a.C0394g.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo1081H0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo3241a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f1018W0 = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1018W0
            if (r0 == 0) goto L_0x015b
            r7.mo1074C0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f1018W0
            r0.mo2361t()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f1018W0
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f1018W0
            android.widget.PopupWindow r6 = r7.f1019X0
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo1454e()
            boolean r8 = r8.mo1210b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo1458k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            r8.mo2351q(r0)
            r7.f1017V0 = r0
            boolean r8 = r7.mo1143o1()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            androidx.core.view.w3 r8 = androidx.core.view.C18196h2.m82580g(r8)
            androidx.core.view.w3 r8 = r8.mo53058b(r0)
            r7.f1021Z0 = r8
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>()
            r8.mo53076u(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f1018W0
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.C18196h2.m82642v1(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f1019X0
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f1008M0
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1020Y0
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f1017V0 = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f1017V0
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.f r0 = r7.f1010O0
            if (r0 == 0) goto L_0x0166
            r0.mo1513y(r8)
        L_0x0166:
            r7.mo1165w1()
            androidx.appcompat.view.b r8 = r7.f1017V0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1152r1(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    @C0363p0
    /* renamed from: s */
    public <T extends View> T mo1153s(@C0329d0 int i) {
        mo1076D0();
        return this.f1008M0.findViewById(i);
    }

    /* renamed from: s0 */
    public void mo1154s0(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f1035n1;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f1057j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f1062o) && !this.f1040s1) {
            this.f1009N0.mo1215d(this.f1008M0.getCallback(), i, menu);
        }
    }

    /* renamed from: s1 */
    public final void mo1155s1() {
        if (this.f1023b1) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: t0 */
    public void mo1156t0(@C0359n0 C0568g gVar) {
        if (!this.f1034m1) {
            this.f1034m1 = true;
            this.f1014S0.mo2388l();
            Window.Callback Q0 = mo1097Q0();
            if (Q0 != null && !this.f1040s1) {
                Q0.onPanelClosed(108, gVar);
            }
            this.f1034m1 = false;
        }
    }

    @C0363p0
    /* renamed from: t1 */
    public final C0475e mo1157t1() {
        Context context = this.f1007L0;
        while (context != null) {
            if (!(context instanceof C0475e)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0475e) context;
            }
        }
        return null;
    }

    /* renamed from: u */
    public Context mo1158u() {
        return this.f1007L0;
    }

    /* renamed from: u0 */
    public final void mo1159u0() {
        C0435s sVar = this.f1046y1;
        if (sVar != null) {
            sVar.mo1232a();
        }
        C0435s sVar2 = this.f1047z1;
        if (sVar2 != null) {
            sVar2.mo1232a();
        }
    }

    /* renamed from: u1 */
    public final void mo1160u1(Configuration configuration) {
        Activity activity = (Activity) this.f1006K0;
        if (activity instanceof C19499w) {
            if (((C19499w) activity).getLifecycle().mo57465b().mo57474q(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f1039r1 && !this.f1040s1) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: v0 */
    public void mo1161v0(int i) {
        mo1164w0(mo1091N0(i, true), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1162v1(int r9, @androidx.annotation.C0363p0 androidx.core.p027os.C17812o r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f1007L0
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.mo1167x0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f1007L0
            int r1 = r8.mo1083I0(r1)
            android.content.res.Configuration r2 = r8.f1041t1
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.f1007L0
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.o r2 = r8.mo1089M0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.o r0 = r8.mo1089M0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0047
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0047
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L_0x0047:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x0071
            if (r11 == 0) goto L_0x0071
            boolean r11 = r8.f1038q1
            if (r11 == 0) goto L_0x0071
            boolean r11 = f992N1
            if (r11 != 0) goto L_0x005a
            boolean r11 = r8.f1039r1
            if (r11 == 0) goto L_0x0071
        L_0x005a:
            java.lang.Object r11 = r8.f1006K0
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0071
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x0071
            java.lang.Object r11 = r8.f1006K0
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.C17018b.m78741H(r11)
            r11 = r7
            goto L_0x0072
        L_0x0071:
            r11 = r6
        L_0x0072:
            if (r11 != 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            r11 = r3 & r1
            if (r11 != r3) goto L_0x007b
            r6 = r7
        L_0x007b:
            r8.mo1168x1(r4, r0, r6, r5)
            goto L_0x0080
        L_0x007f:
            r7 = r11
        L_0x0080:
            if (r7 == 0) goto L_0x009c
            java.lang.Object r11 = r8.f1006K0
            boolean r1 = r11 instanceof androidx.appcompat.app.C0475e
            if (r1 == 0) goto L_0x009c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0091
            androidx.appcompat.app.e r11 = (androidx.appcompat.app.C0475e) r11
            r11.mo1478F0(r9)
        L_0x0091:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x009c
            java.lang.Object r9 = r8.f1006K0
            androidx.appcompat.app.e r9 = (androidx.appcompat.app.C0475e) r9
            r9.mo1477E0(r10)
        L_0x009c:
            if (r7 == 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            android.content.Context r9 = r8.f1007L0
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.o r9 = r8.mo1089M0(r9)
            r8.mo1141n1(r9)
        L_0x00b1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1162v1(int, androidx.core.os.o, boolean):boolean");
    }

    /* renamed from: w */
    public final C0455b.C0457b mo1163w() {
        return new C0423h();
    }

    /* renamed from: w0 */
    public void mo1164w0(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        C0704c0 c0Var;
        if (!z || panelFeatureState.f1048a != 0 || (c0Var = this.f1014S0) == null || !c0Var.mo2377g()) {
            WindowManager windowManager = (WindowManager) this.f1007L0.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f1062o || (viewGroup = panelFeatureState.f1054g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo1154s0(panelFeatureState.f1048a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f1060m = false;
            panelFeatureState.f1061n = false;
            panelFeatureState.f1062o = false;
            panelFeatureState.f1055h = null;
            panelFeatureState.f1064q = true;
            if (this.f1036o1 == panelFeatureState) {
                this.f1036o1 = null;
            }
            if (panelFeatureState.f1048a == 0) {
                mo1165w1();
                return;
            }
            return;
        }
        mo1156t0(panelFeatureState.f1057j);
    }

    /* renamed from: w1 */
    public void mo1165w1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean q1 = mo1149q1();
            if (q1 && this.f1005J1 == null) {
                this.f1005J1 = C0432p.m1749b(this.f1004I1, this);
            } else if (!q1 && (onBackInvokedCallback = this.f1005J1) != null) {
                C0432p.m1750c(this.f1004I1, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: x */
    public int mo1166x() {
        return this.f1042u1;
    }

    @C0359n0
    /* renamed from: x0 */
    public final Configuration mo1167x0(@C0359n0 Context context, int i, @C0363p0 C17812o oVar, @C0363p0 Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (oVar != null) {
            mo1139m1(configuration2, oVar);
        }
        return configuration2;
    }

    /* renamed from: x1 */
    public final void mo1168x1(int i, @C0363p0 C17812o oVar, boolean z, @C0363p0 Configuration configuration) {
        Resources resources = this.f1007L0.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        if (oVar != null) {
            mo1139m1(configuration2, oVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            C0505z.m2339a(resources);
        }
        int i2 = this.f1043v1;
        if (i2 != 0) {
            this.f1007L0.setTheme(i2);
            this.f1007L0.getTheme().applyStyle(this.f1043v1, true);
        }
        if (z && (this.f1006K0 instanceof Activity)) {
            mo1160u1(configuration2);
        }
    }

    /* renamed from: y0 */
    public final ViewGroup mo1169y0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1007L0.obtainStyledAttributes(C0387a.C0400m.AppCompatTheme);
        int i = C0387a.C0400m.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C0387a.C0400m.AppCompatTheme_windowNoTitle, false)) {
                mo1104V(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo1104V(108);
            }
            if (obtainStyledAttributes.getBoolean(C0387a.C0400m.AppCompatTheme_windowActionBarOverlay, false)) {
                mo1104V(109);
            }
            if (obtainStyledAttributes.getBoolean(C0387a.C0400m.AppCompatTheme_windowActionModeOverlay, false)) {
                mo1104V(10);
            }
            this.f1032k1 = obtainStyledAttributes.getBoolean(C0387a.C0400m.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            mo1078E0();
            this.f1008M0.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1007L0);
            if (this.f1033l1) {
                viewGroup = this.f1031j1 ? (ViewGroup) from.inflate(C0387a.C0397j.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C0387a.C0397j.abc_screen_simple, (ViewGroup) null);
            } else if (this.f1032k1) {
                viewGroup = (ViewGroup) from.inflate(C0387a.C0397j.abc_dialog_title_material, (ViewGroup) null);
                this.f1030i1 = false;
                this.f1029h1 = false;
            } else if (this.f1029h1) {
                TypedValue typedValue = new TypedValue();
                this.f1007L0.getTheme().resolveAttribute(C0387a.C0389b.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C0538d(this.f1007L0, typedValue.resourceId);
                } else {
                    context = this.f1007L0;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0387a.C0397j.abc_screen_toolbar, (ViewGroup) null);
                C0704c0 c0Var = (C0704c0) viewGroup.findViewById(C0387a.C0394g.decor_content_parent);
                this.f1014S0 = c0Var;
                c0Var.setWindowCallback(mo1097Q0());
                if (this.f1030i1) {
                    this.f1014S0.mo2387k(109);
                }
                if (this.f1027f1) {
                    this.f1014S0.mo2387k(2);
                }
                if (this.f1028g1) {
                    this.f1014S0.mo2387k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C18196h2.m82559a2(viewGroup, new C0417c());
                if (this.f1014S0 == null) {
                    this.f1025d1 = (TextView) viewGroup.findViewById(C0387a.C0394g.title);
                }
                C0796u1.m3860c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0387a.C0394g.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1008M0.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f1008M0.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0419e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1029h1 + ", windowActionBarOverlay: " + this.f1030i1 + ", android:windowIsFloating: " + this.f1032k1 + ", windowActionModeOverlay: " + this.f1031j1 + ", windowNoTitle: " + this.f1033l1 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: y1 */
    public final int mo1170y1(@C0363p0 C18436z4 z4Var, @C0363p0 Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        if (z4Var != null) {
            i = z4Var.mo53149r();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f1018W0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f1018W0.getLayoutParams();
            boolean z3 = true;
            if (this.f1018W0.isShown()) {
                if (this.f1000E1 == null) {
                    this.f1000E1 = new Rect();
                    this.f1001F1 = new Rect();
                }
                Rect rect2 = this.f1000E1;
                Rect rect3 = this.f1001F1;
                if (z4Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(z4Var.mo53147p(), z4Var.mo53149r(), z4Var.mo53148q(), z4Var.mo53146o());
                }
                C0796u1.m3858a(this.f1024c1, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                C18436z4 o0 = C18196h2.m82613o0(this.f1024c1);
                if (o0 == null) {
                    i2 = 0;
                } else {
                    i2 = o0.mo53147p();
                }
                if (o0 == null) {
                    i3 = 0;
                } else {
                    i3 = o0.mo53148q();
                }
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z2 = true;
                }
                if (i6 <= 0 || this.f1026e1 != null) {
                    View view = this.f1026e1;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        this.f1026e1.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f1007L0);
                    this.f1026e1 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f1024c1.addView(this.f1026e1, -1, layoutParams);
                }
                View view3 = this.f1026e1;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    mo1173z1(this.f1026e1);
                }
                if (!this.f1031j1 && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f1018W0.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f1026e1;
        if (view4 != null) {
            if (!z) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i;
    }

    /* renamed from: z */
    public MenuInflater mo1171z() {
        Context context;
        if (this.f1012Q0 == null) {
            mo1099R0();
            C0441a aVar = this.f1011P0;
            if (aVar != null) {
                context = aVar.mo1240A();
            } else {
                context = this.f1007L0;
            }
            this.f1012Q0 = new C0543g(context);
        }
        return this.f1012Q0;
    }

    /* renamed from: z0 */
    public void mo1172z0() {
        C0568g gVar;
        C0704c0 c0Var = this.f1014S0;
        if (c0Var != null) {
            c0Var.mo2388l();
        }
        if (this.f1019X0 != null) {
            this.f1008M0.getDecorView().removeCallbacks(this.f1020Y0);
            if (this.f1019X0.isShowing()) {
                try {
                    this.f1019X0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1019X0 = null;
        }
        mo1074C0();
        PanelFeatureState N0 = mo1091N0(0, false);
        if (N0 != null && (gVar = N0.f1057j) != null) {
            gVar.close();
        }
    }

    /* renamed from: z1 */
    public final void mo1173z1(View view) {
        boolean z;
        int i;
        if ((C18196h2.m82477C0(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = C17318d.m79723f(this.f1007L0, C0387a.C0391d.abc_decor_view_status_guard_light);
        } else {
            i = C17318d.m79723f(this.f1007L0, C0387a.C0391d.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    public AppCompatDelegateImpl(Dialog dialog, C0478f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, C0478f fVar) {
        this(context, window, fVar, context);
    }

    public AppCompatDelegateImpl(Context context, Activity activity, C0478f fVar) {
        this(context, (Window) null, fVar, activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f989K1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0478f r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1021Z0 = r0
            r0 = 1
            r2.f1022a1 = r0
            r0 = -100
            r2.f1042u1 = r0
            androidx.appcompat.app.AppCompatDelegateImpl$b r1 = new androidx.appcompat.app.AppCompatDelegateImpl$b
            r1.<init>()
            r2.f998C1 = r1
            r2.f1007L0 = r3
            r2.f1010O0 = r5
            r2.f1006K0 = r6
            int r3 = r2.f1042u1
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.e r3 = r2.mo1157t1()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.i r3 = r3.mo1472A0()
            int r3 = r3.mo1166x()
            r2.f1042u1 = r3
        L_0x0032:
            int r3 = r2.f1042u1
            if (r3 != r0) goto L_0x0059
            androidx.collection.l<java.lang.String, java.lang.Integer> r3 = f989K1
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f1042u1 = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.mo1146p0(r4)
        L_0x005e:
            androidx.appcompat.widget.C0716g.m3508i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.f, java.lang.Object):void");
    }
}
