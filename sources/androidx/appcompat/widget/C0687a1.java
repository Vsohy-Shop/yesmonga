package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.C0696c;
import androidx.core.view.C18119b;

/* renamed from: androidx.appcompat.widget.a1 */
public class C0687a1 extends C18119b {

    /* renamed from: k */
    public static final int f2263k = 4;

    /* renamed from: l */
    public static final String f2264l = "share_history.xml";

    /* renamed from: e */
    public int f2265e = 4;

    /* renamed from: f */
    public final C0690c f2266f = new C0690c();

    /* renamed from: g */
    public final Context f2267g;

    /* renamed from: h */
    public String f2268h = f2264l;

    /* renamed from: i */
    public C0688a f2269i;

    /* renamed from: j */
    public C0696c.C0702f f2270j;

    /* renamed from: androidx.appcompat.widget.a1$a */
    public interface C0688a {
        /* renamed from: a */
        boolean mo3265a(C0687a1 a1Var, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.a1$b */
    public class C0689b implements C0696c.C0702f {
        public C0689b() {
        }

        /* renamed from: a */
        public boolean mo3266a(C0696c cVar, Intent intent) {
            C0687a1 a1Var = C0687a1.this;
            C0688a aVar = a1Var.f2269i;
            if (aVar == null) {
                return false;
            }
            aVar.mo3265a(a1Var, intent);
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.a1$c */
    public class C0690c implements MenuItem.OnMenuItemClickListener {
        public C0690c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0687a1 a1Var = C0687a1.this;
            Intent b = C0696c.m3383d(a1Var.f2267g, a1Var.f2268h).mo3303b(menuItem.getItemId());
            if (b == null) {
                return true;
            }
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                C0687a1.this.mo3264r(b);
            }
            C0687a1.this.f2267g.startActivity(b);
            return true;
        }
    }

    public C0687a1(Context context) {
        super(context);
        this.f2267g = context;
    }

    /* renamed from: b */
    public boolean mo2227b() {
        return true;
    }

    /* renamed from: d */
    public View mo2228d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f2267g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C0696c.m3383d(this.f2267g, this.f2268h));
        }
        TypedValue typedValue = new TypedValue();
        this.f2267g.getTheme().resolveAttribute(C0387a.C0389b.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C0507a.m2346b(this.f2267g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C0387a.C0398k.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C0387a.C0398k.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    /* renamed from: g */
    public void mo2230g(SubMenu subMenu) {
        subMenu.clear();
        C0696c d = C0696c.m3383d(this.f2267g, this.f2268h);
        PackageManager packageManager = this.f2267g.getPackageManager();
        int f = d.mo3306f();
        int min = Math.min(f, this.f2265e);
        for (int i = 0; i < min; i++) {
            ResolveInfo e = d.mo3305e(i);
            subMenu.add(0, i, i, e.loadLabel(packageManager)).setIcon(e.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2266f);
        }
        if (min < f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f2267g.getString(C0387a.C0398k.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < f; i2++) {
                ResolveInfo e2 = d.mo3305e(i2);
                addSubMenu.add(0, i2, i2, e2.loadLabel(packageManager)).setIcon(e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2266f);
            }
        }
    }

    /* renamed from: n */
    public final void mo3260n() {
        if (this.f2269i != null) {
            if (this.f2270j == null) {
                this.f2270j = new C0689b();
            }
            C0696c.m3383d(this.f2267g, this.f2268h).mo3321u(this.f2270j);
        }
    }

    /* renamed from: o */
    public void mo3261o(C0688a aVar) {
        this.f2269i = aVar;
        mo3260n();
    }

    /* renamed from: p */
    public void mo3262p(String str) {
        this.f2268h = str;
        mo3260n();
    }

    /* renamed from: q */
    public void mo3263q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                mo3264r(intent);
            }
        }
        C0696c.m3383d(this.f2267g, this.f2268h).mo3320t(intent);
    }

    /* renamed from: r */
    public void mo3264r(Intent intent) {
        intent.addFlags(134742016);
    }
}
