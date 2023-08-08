package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40774j0;
import com.google.android.gms.dynamic.C41018e;
import java.util.LinkedList;

@C40473a
/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C41012a<T extends C41018e> {

    /* renamed from: a */
    public C41018e f104292a;
    @C0363p0

    /* renamed from: b */
    public Bundle f104293b;

    /* renamed from: c */
    public LinkedList f104294c;

    /* renamed from: d */
    public final C41020g f104295d = new C41022i(this);

    @C40473a
    /* renamed from: o */
    public static void m166725o(@C0359n0 FrameLayout frameLayout) {
        C40713g x = C40713g.m165640x();
        Context context = frameLayout.getContext();
        int j = x.mo134208j(context);
        String d = C40774j0.m165927d(context, j);
        String c = C40774j0.m165926c(context, j);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d);
        linearLayout.addView(textView);
        Intent e = x.mo134205e(context, j, (String) null);
        if (e != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new C41026m(context, e));
        }
    }

    @C40473a
    /* renamed from: a */
    public abstract void mo85974a(@C0359n0 C41020g<T> gVar);

    @C40473a
    @C0359n0
    /* renamed from: b */
    public T mo134796b() {
        return this.f104292a;
    }

    @C40473a
    /* renamed from: c */
    public void mo134797c(@C0359n0 FrameLayout frameLayout) {
        m166725o(frameLayout);
    }

    @C40473a
    /* renamed from: d */
    public void mo134798d(@C0363p0 Bundle bundle) {
        mo134810u(bundle, new C41024k(this, bundle));
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public View mo134799e(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        mo134810u(bundle, new C41025l(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f104292a == null) {
            mo134797c(frameLayout);
        }
        return frameLayout;
    }

    @C40473a
    /* renamed from: f */
    public void mo134800f() {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            eVar.mo85963c();
        } else {
            mo134809t(1);
        }
    }

    @C40473a
    /* renamed from: g */
    public void mo134801g() {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            eVar.mo85958L();
        } else {
            mo134809t(2);
        }
    }

    @C40473a
    /* renamed from: h */
    public void mo134802h(@C0359n0 Activity activity, @C0359n0 Bundle bundle, @C0363p0 Bundle bundle2) {
        mo134810u(bundle2, new C41023j(this, activity, bundle, bundle2));
    }

    @C40473a
    /* renamed from: i */
    public void mo134803i() {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
    }

    @C40473a
    /* renamed from: j */
    public void mo134804j() {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            eVar.mo85969v();
        } else {
            mo134809t(5);
        }
    }

    @C40473a
    /* renamed from: k */
    public void mo134805k() {
        mo134810u((Bundle) null, new C41028o(this));
    }

    @C40473a
    /* renamed from: l */
    public void mo134806l(@C0359n0 Bundle bundle) {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            eVar.mo85967m(bundle);
            return;
        }
        Bundle bundle2 = this.f104293b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @C40473a
    /* renamed from: m */
    public void mo134807m() {
        mo134810u((Bundle) null, new C41027n(this));
    }

    @C40473a
    /* renamed from: n */
    public void mo134808n() {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            eVar.mo85961a();
        } else {
            mo134809t(4);
        }
    }

    /* renamed from: t */
    public final void mo134809t(int i) {
        while (!this.f104294c.isEmpty() && ((C41029p) this.f104294c.getLast()).mo134839i() >= i) {
            this.f104294c.removeLast();
        }
    }

    /* renamed from: u */
    public final void mo134810u(@C0363p0 Bundle bundle, C41029p pVar) {
        C41018e eVar = this.f104292a;
        if (eVar != null) {
            pVar.mo134838a(eVar);
            return;
        }
        if (this.f104294c == null) {
            this.f104294c = new LinkedList();
        }
        this.f104294c.add(pVar);
        if (bundle != null) {
            Bundle bundle2 = this.f104293b;
            if (bundle2 == null) {
                this.f104293b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo85974a(this.f104295d);
    }
}
