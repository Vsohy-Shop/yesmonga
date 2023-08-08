package com.contentsquare.android.sdk;

import android.view.ViewGroup;
import com.contentsquare.android.sdk.C14893yb;
import com.contentsquare.android.sdk.C14898ye;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.bd */
public final class C14225bd {

    /* renamed from: a */
    public final C14453jf f35132a = new C14453jf("ScreenGraphProducer");

    /* renamed from: b */
    public final C14296e6 f35133b;

    /* renamed from: c */
    public final C14533md<C14898ye.C14899a> f35134c;

    /* renamed from: d */
    public final C14408hg f35135d;

    /* renamed from: e */
    public final C14252cb f35136e;

    /* renamed from: com.contentsquare.android.sdk.bd$a */
    public static final class C14226a implements C14893yb.C14894a {

        /* renamed from: a */
        public final /* synthetic */ C14225bd f35137a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f35138b;

        /* renamed from: c */
        public final /* synthetic */ String f35139c;

        /* renamed from: d */
        public final /* synthetic */ String f35140d;

        /* renamed from: e */
        public final /* synthetic */ C14411i1 f35141e;

        public C14226a(C14225bd bdVar, ViewGroup viewGroup, String str, String str2, C14411i1 i1Var) {
            this.f35137a = bdVar;
            this.f35138b = viewGroup;
            this.f35139c = str;
            this.f35140d = str2;
            this.f35141e = i1Var;
        }

        /* renamed from: a */
        public void mo34717a(C14893yb.C14895b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "result");
            this.f35137a.f35134c.mo34827b(C14898ye.C14899a.C14908f.f36968a);
            String b = bVar.mo35540b(this.f35138b);
            Intrinsics.checkNotNullExpressionValue(b, "result.getScreenshot(rootView)");
            this.f35137a.f35134c.mo34827b(C14898ye.C14899a.C14905c.f36965a);
            C14749tb a = this.f35137a.f35135d.mo35508a(this.f35138b, this.f35137a.f35133b, bVar, new C14450jc(this.f35138b, bVar.mo35539a()));
            Intrinsics.checkNotNullExpressionValue(a, "treeTraverser.generateSc…eenCapture)\n            )");
            a.mo36523e(this.f35139c);
            a.mo36520b(this.f35140d);
            if (this.f35137a.f35133b.mo35041m()) {
                this.f35137a.f35133b.mo35037h(a, b, bVar, this.f35141e);
            } else {
                this.f35141e.mo35514a(a, b, bVar.mo35539a());
            }
        }

        /* renamed from: d */
        public void mo34718d(String str) {
            Intrinsics.checkNotNullParameter(str, "error");
            this.f35137a.f35132a.mo35677f(str, new Object[0]);
            this.f35137a.f35134c.mo34827b(new C14898ye.C14899a.C14900a(C14898ye.C14899a.C14901b.C14904c.f36964a, this.f35140d));
        }
    }

    public C14225bd(C14296e6 e6Var, C14533md<C14898ye.C14899a> mdVar, C14408hg hgVar, C14252cb cbVar) {
        Intrinsics.checkNotNullParameter(e6Var, "externalViewsProcessor");
        Intrinsics.checkNotNullParameter(mdVar, "statusRepository");
        Intrinsics.checkNotNullParameter(hgVar, "treeTraverser");
        Intrinsics.checkNotNullParameter(cbVar, "viewBitmapProviderFactory");
        this.f35133b = e6Var;
        this.f35134c = mdVar;
        this.f35135d = hgVar;
        this.f35136e = cbVar;
    }

    /* renamed from: b */
    public final C14226a mo34715b(ViewGroup viewGroup, String str, String str2, C14411i1 i1Var) {
        return new C14226a(this, viewGroup, str, str2, i1Var);
    }

    /* renamed from: d */
    public final void mo34716d(ViewGroup viewGroup, String str, String str2, C14411i1 i1Var) {
        Intrinsics.checkNotNullParameter(viewGroup, "rootView");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(i1Var, "screenGraphCallbackListener");
        this.f35136e.mo34855a().mo35538a(mo34715b(viewGroup, str, str2, i1Var));
    }
}
