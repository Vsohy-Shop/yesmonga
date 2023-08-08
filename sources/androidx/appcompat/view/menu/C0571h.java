package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.C0359n0;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.C0467d;
import androidx.appcompat.view.menu.C0585n;
import androidx.core.view.C18124b2;

/* renamed from: androidx.appcompat.view.menu.h */
public class C0571h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0585n.C0586a {

    /* renamed from: a */
    public C0568g f1642a;

    /* renamed from: b */
    public C0467d f1643b;

    /* renamed from: c */
    public C0565e f1644c;

    /* renamed from: d */
    public C0585n.C0586a f1645d;

    public C0571h(C0568g gVar) {
        this.f1642a = gVar;
    }

    /* renamed from: a */
    public void mo2103a() {
        C0467d dVar = this.f1643b;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo1207b(@C0359n0 C0568g gVar, boolean z) {
        if (z || gVar == this.f1642a) {
            mo2103a();
        }
        C0585n.C0586a aVar = this.f1645d;
        if (aVar != null) {
            aVar.mo1207b(gVar, z);
        }
    }

    /* renamed from: c */
    public boolean mo1208c(@C0359n0 C0568g gVar) {
        C0585n.C0586a aVar = this.f1645d;
        if (aVar != null) {
            return aVar.mo1208c(gVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo2104d(C0585n.C0586a aVar) {
        this.f1645d = aVar;
    }

    /* renamed from: e */
    public void mo2105e(IBinder iBinder) {
        C0568g gVar = this.f1642a;
        C0467d.C0468a aVar = new C0467d.C0468a(gVar.mo2100x());
        C0565e eVar = new C0565e(aVar.mo1404b(), C0387a.C0397j.abc_list_menu_item_layout);
        this.f1644c = eVar;
        eVar.mo1939e(this);
        this.f1642a.mo2050b(this.f1644c);
        aVar.mo1405c(this.f1644c.mo1990a(), this);
        View B = gVar.mo2015B();
        if (B != null) {
            aVar.mo1408f(B);
        } else {
            aVar.mo1410h(gVar.mo2102z()).mo1398K(gVar.mo2014A());
        }
        aVar.mo1388A(this);
        C0467d a = aVar.mo1403a();
        this.f1643b = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1643b.getWindow().getAttributes();
        attributes.type = C18124b2.f46727f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1643b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1642a.mo2027O((C0573j) this.f1644c.mo1990a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1644c.mo1936b(this.f1642a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1643b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1643b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1642a.mo2061f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1642a.performShortcut(i, keyEvent, 0);
    }
}
