package com.contentsquare.android.sdk;

import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import com.contentsquare.android.api.bridge.flutter.C14088a;
import com.contentsquare.android.api.bridge.flutter.C14089b;
import com.contentsquare.android.sdk.C14419i7;
import com.contentsquare.android.sdk.C14893yb;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.contentsquare.android.sdk.e6 */
public final class C14296e6 implements C14089b {

    /* renamed from: f */
    public static final WeakHashMap<View, C14088a> f35296f = new WeakHashMap<>();

    /* renamed from: g */
    public static final C14297a f35297g = new C14297a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public C14298b f35298a;

    /* renamed from: b */
    public final WeakHashMap<View, C14299c> f35299b = new WeakHashMap<>();

    /* renamed from: c */
    public final WeakHashMap<View, C14299c> f35300c = new WeakHashMap<>();

    /* renamed from: d */
    public final C14781ue f35301d;

    /* renamed from: e */
    public final C14419i7 f35302e;

    /* renamed from: com.contentsquare.android.sdk.e6$a */
    public static final class C14297a {
        public C14297a() {
        }

        @C11384m
        /* renamed from: a */
        public final void mo35046a(View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            C14296e6.f35296f.remove(view);
        }

        @C11384m
        /* renamed from: b */
        public final void mo35047b(View view, C14088a aVar) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(aVar, "externalViewGraphListener");
            C14296e6.f35296f.put(view, aVar);
        }

        public /* synthetic */ C14297a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.e6$b */
    public static final class C14298b {

        /* renamed from: a */
        public final C14749tb f35303a;

        /* renamed from: b */
        public final String f35304b;

        /* renamed from: c */
        public final C14893yb.C14895b f35305c;

        /* renamed from: d */
        public final C14411i1 f35306d;

        public C14298b(C14749tb tbVar, String str, C14893yb.C14895b bVar, C14411i1 i1Var) {
            Intrinsics.checkNotNullParameter(tbVar, "screenGraph");
            Intrinsics.checkNotNullParameter(str, "screenshot");
            Intrinsics.checkNotNullParameter(bVar, "result");
            Intrinsics.checkNotNullParameter(i1Var, "screenGraphCallbackListener");
            this.f35303a = tbVar;
            this.f35304b = str;
            this.f35305c = bVar;
            this.f35306d = i1Var;
        }

        /* renamed from: a */
        public final C14893yb.C14895b mo35048a() {
            return this.f35305c;
        }

        /* renamed from: b */
        public final C14749tb mo35049b() {
            return this.f35303a;
        }

        /* renamed from: c */
        public final C14411i1 mo35050c() {
            return this.f35306d;
        }

        /* renamed from: d */
        public final String mo35051d() {
            return this.f35304b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14298b)) {
                return false;
            }
            C14298b bVar = (C14298b) obj;
            return Intrinsics.areEqual((Object) this.f35303a, (Object) bVar.f35303a) && Intrinsics.areEqual((Object) this.f35304b, (Object) bVar.f35304b) && Intrinsics.areEqual((Object) this.f35305c, (Object) bVar.f35305c) && Intrinsics.areEqual((Object) this.f35306d, (Object) bVar.f35306d);
        }

        public int hashCode() {
            C14749tb tbVar = this.f35303a;
            int i = 0;
            int hashCode = (tbVar != null ? tbVar.hashCode() : 0) * 31;
            String str = this.f35304b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C14893yb.C14895b bVar = this.f35305c;
            int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            C14411i1 i1Var = this.f35306d;
            if (i1Var != null) {
                i = i1Var.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            C14749tb tbVar = this.f35303a;
            String str = this.f35304b;
            C14893yb.C14895b bVar = this.f35305c;
            C14411i1 i1Var = this.f35306d;
            return "Parameter(screenGraph=" + tbVar + ", screenshot=" + str + ", result=" + bVar + ", screenGraphCallbackListener=" + i1Var + ")";
        }
    }

    /* renamed from: com.contentsquare.android.sdk.e6$c */
    public static final class C14299c {

        /* renamed from: a */
        public final C14249c8 f35307a;

        /* renamed from: b */
        public final C14088a f35308b;

        public C14299c(C14249c8 c8Var, C14088a aVar) {
            Intrinsics.checkNotNullParameter(c8Var, "jsonView");
            this.f35307a = c8Var;
            this.f35308b = aVar;
        }

        /* renamed from: a */
        public final C14249c8 mo35055a() {
            return this.f35307a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14299c)) {
                return false;
            }
            C14299c cVar = (C14299c) obj;
            return Intrinsics.areEqual((Object) this.f35307a, (Object) cVar.f35307a) && Intrinsics.areEqual((Object) this.f35308b, (Object) cVar.f35308b);
        }

        public int hashCode() {
            C14249c8 c8Var = this.f35307a;
            int i = 0;
            int hashCode = (c8Var != null ? c8Var.hashCode() : 0) * 31;
            C14088a aVar = this.f35308b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            C14249c8 c8Var = this.f35307a;
            C14088a aVar = this.f35308b;
            return "ViewFound(jsonView=" + c8Var + ", listener=" + aVar + ")";
        }
    }

    /* renamed from: com.contentsquare.android.sdk.e6$d */
    public static final class C14300d extends C14419i7.C14421b {

        /* renamed from: d */
        public final /* synthetic */ C14296e6 f35309d;

        /* renamed from: e */
        public final /* synthetic */ SparseArray f35310e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14300d(C14296e6 e6Var, SparseArray sparseArray, SparseArray sparseArray2) {
            super(sparseArray2);
            this.f35309d = e6Var;
            this.f35310e = sparseArray;
        }

        /* renamed from: a */
        public void mo35059a() {
            this.f35309d.mo35038i();
            this.f35309d.mo35040l();
        }
    }

    public C14296e6(C14781ue ueVar, C14419i7 i7Var) {
        Intrinsics.checkNotNullParameter(ueVar, "pathDescriptor");
        Intrinsics.checkNotNullParameter(i7Var, "webViewScreenGraphProcessor");
        this.f35301d = ueVar;
        this.f35302e = i7Var;
    }

    @C11384m
    /* renamed from: c */
    public static final void m61464c(View view) {
        f35297g.mo35046a(view);
    }

    @C11384m
    /* renamed from: d */
    public static final void m61465d(View view, C14088a aVar) {
        f35297g.mo35047b(view, aVar);
    }

    /* renamed from: a */
    public void mo34340a(View view, String str) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(str, "jsonScreenGraph");
        mo35036f(view, str);
        mo35039j(view);
        mo35044p();
    }

    /* renamed from: e */
    public final void mo35035e(View view, C14249c8 c8Var) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(c8Var, "jsonView");
        if (view instanceof WebView) {
            this.f35299b.put(view, new C14299c(c8Var, (C14088a) null));
            return;
        }
        C14088a aVar = f35296f.get(view);
        if (aVar != null) {
            this.f35300c.put(view, new C14299c(c8Var, aVar));
        }
    }

    /* renamed from: f */
    public final void mo35036f(View view, String str) {
        C14299c cVar = this.f35300c.get(view);
        if (cVar != null) {
            cVar.mo35055a().mo34839b(1);
            cVar.mo35055a().mo34842e(new JSONArray(str));
        }
    }

    /* renamed from: h */
    public final void mo35037h(C14749tb tbVar, String str, C14893yb.C14895b bVar, C14411i1 i1Var) {
        Intrinsics.checkNotNullParameter(tbVar, "screenGraph");
        Intrinsics.checkNotNullParameter(str, "screenshot");
        Intrinsics.checkNotNullParameter(bVar, "result");
        Intrinsics.checkNotNullParameter(i1Var, "screenGraphCallbackListener");
        this.f35298a = new C14298b(tbVar, str, bVar, i1Var);
        mo35042n();
    }

    /* renamed from: i */
    public final void mo35038i() {
        this.f35299b.clear();
    }

    /* renamed from: j */
    public final void mo35039j(View view) {
        this.f35300c.remove(view);
    }

    /* renamed from: l */
    public final void mo35040l() {
        C14411i1 c;
        C14298b bVar = this.f35298a;
        if (bVar != null && (c = bVar.mo35050c()) != null) {
            c.mo35514a(bVar.mo35049b(), bVar.mo35051d(), bVar.mo35048a().mo35539a());
        }
    }

    /* renamed from: m */
    public final boolean mo35041m() {
        return (this.f35299b.isEmpty() ^ true) || (this.f35300c.isEmpty() ^ true);
    }

    /* renamed from: n */
    public final void mo35042n() {
        if (!this.f35300c.isEmpty()) {
            mo35043o();
        } else if (!this.f35299b.isEmpty()) {
            mo35045q();
        } else {
            mo35040l();
        }
    }

    /* renamed from: o */
    public final void mo35043o() {
        Set<Map.Entry<View, C14299c>> entrySet = this.f35300c.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "registeredViewsFound.entries");
        Object u2 = CollectionsKt___CollectionsKt.m40696u2(entrySet);
        Intrinsics.checkNotNullExpressionValue(u2, "registeredViewsFound.entries.first()");
        Map.Entry entry = (Map.Entry) u2;
        C14088a aVar = f35296f.get(entry.getKey());
        String b = this.f35301d.mo36586b((View) entry.getKey());
        Intrinsics.checkNotNullExpressionValue(b, "pathDescriptor.generateA…lyticsPath(viewFound.key)");
        if (aVar != null) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "viewFound.key");
            aVar.mo34339a((View) key, b, this);
        }
    }

    /* renamed from: p */
    public final void mo35044p() {
        if (this.f35298a != null) {
            mo35042n();
        }
    }

    /* renamed from: q */
    public final void mo35045q() {
        WeakHashMap<View, C14299c> weakHashMap = this.f35299b;
        ArrayList arrayList = new ArrayList(weakHashMap.size());
        for (Map.Entry<View, C14299c> key : weakHashMap.entrySet()) {
            Object key2 = key.getKey();
            if (key2 != null) {
                arrayList.add((WebView) key2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
            }
        }
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : this.f35299b.entrySet()) {
            sparseArray.put(((View) next.getKey()).hashCode(), ((C14299c) next.getValue()).mo35055a());
        }
        this.f35302e.mo35533a(arrayList, new C14300d(this, sparseArray, sparseArray));
    }
}
