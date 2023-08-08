package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import androidx.core.util.C18007x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: androidx.core.view.k */
public final class C18274k {

    /* renamed from: b */
    public static final int f46902b = 0;

    /* renamed from: c */
    public static final int f46903c = 1;

    /* renamed from: d */
    public static final int f46904d = 2;

    /* renamed from: e */
    public static final int f46905e = 3;

    /* renamed from: f */
    public static final int f46906f = 4;

    /* renamed from: g */
    public static final int f46907g = 5;

    /* renamed from: h */
    public static final int f46908h = 1;
    @C0359n0

    /* renamed from: a */
    public final C18281g f46909a;

    @C0376v0(31)
    /* renamed from: androidx.core.view.k$a */
    public static final class C18275a {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static Pair<ContentInfo, ContentInfo> m82913a(@C0359n0 ContentInfo contentInfo, @C0359n0 Predicate<ClipData.Item> predicate) {
            ContentInfo contentInfo2;
            ClipData a = contentInfo.getClip();
            if (a.getItemCount() == 1) {
                boolean test = predicate.test(a.getItemAt(0));
                if (test) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> h = C18274k.m82902h(a, new C18266j(predicate));
            if (h.first == null) {
                return Pair.create((Object) null, contentInfo);
            }
            if (h.second == null) {
                return Pair.create(contentInfo, (Object) null);
            }
            C18231i.m82824a();
            ContentInfo a2 = C18192h.m82462a(contentInfo).setClip((ClipData) h.first).build();
            C18231i.m82824a();
            return Pair.create(a2, C18192h.m82462a(contentInfo).setClip((ClipData) h.second).build());
        }
    }

    /* renamed from: androidx.core.view.k$d */
    public interface C18278d {
        /* renamed from: a */
        void mo52947a(int i);

        /* renamed from: b */
        void mo52948b(@C0363p0 Uri uri);

        /* renamed from: c */
        void mo52949c(@C0359n0 ClipData clipData);

        /* renamed from: f */
        void mo52950f(int i);

        @C0359n0
        /* renamed from: g */
        C18274k mo52951g();

        void setExtras(@C0363p0 Bundle bundle);
    }

    @C0376v0(31)
    /* renamed from: androidx.core.view.k$f */
    public static final class C18280f implements C18281g {
        @C0359n0

        /* renamed from: a */
        public final ContentInfo f46917a;

        public C18280f(@C0359n0 ContentInfo contentInfo) {
            this.f46917a = C18139d.m82310a(C18001r.m81775l(contentInfo));
        }

        /* renamed from: C */
        public int mo52953C() {
            return this.f46917a.getFlags();
        }

        @C0363p0
        /* renamed from: a */
        public Uri mo52954a() {
            return this.f46917a.getLinkUri();
        }

        @C0359n0
        /* renamed from: b */
        public ContentInfo mo52955b() {
            return this.f46917a;
        }

        @C0359n0
        /* renamed from: e */
        public ClipData mo52956e() {
            return this.f46917a.getClip();
        }

        @C0363p0
        public Bundle getExtras() {
            return this.f46917a.getExtras();
        }

        public int getSource() {
            return this.f46917a.getSource();
        }

        @C0359n0
        public String toString() {
            return "ContentInfoCompat{" + this.f46917a + "}";
        }
    }

    /* renamed from: androidx.core.view.k$g */
    public interface C18281g {
        /* renamed from: C */
        int mo52953C();

        @C0363p0
        /* renamed from: a */
        Uri mo52954a();

        @C0363p0
        /* renamed from: b */
        ContentInfo mo52955b();

        @C0359n0
        /* renamed from: e */
        ClipData mo52956e();

        @C0363p0
        Bundle getExtras();

        int getSource();
    }

    /* renamed from: androidx.core.view.k$h */
    public static final class C18282h implements C18281g {
        @C0359n0

        /* renamed from: a */
        public final ClipData f46918a;

        /* renamed from: b */
        public final int f46919b;

        /* renamed from: c */
        public final int f46920c;
        @C0363p0

        /* renamed from: d */
        public final Uri f46921d;
        @C0363p0

        /* renamed from: e */
        public final Bundle f46922e;

        public C18282h(C18279e eVar) {
            this.f46918a = (ClipData) C18001r.m81775l(eVar.f46912a);
            this.f46919b = C18001r.m81770g(eVar.f46913b, 0, 5, "source");
            this.f46920c = C18001r.m81774k(eVar.f46914c, 1);
            this.f46921d = eVar.f46915d;
            this.f46922e = eVar.f46916e;
        }

        /* renamed from: C */
        public int mo52953C() {
            return this.f46920c;
        }

        @C0363p0
        /* renamed from: a */
        public Uri mo52954a() {
            return this.f46921d;
        }

        @C0363p0
        /* renamed from: b */
        public ContentInfo mo52955b() {
            return null;
        }

        @C0359n0
        /* renamed from: e */
        public ClipData mo52956e() {
            return this.f46918a;
        }

        @C0363p0
        public Bundle getExtras() {
            return this.f46922e;
        }

        public int getSource() {
            return this.f46919b;
        }

        @C0359n0
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f46918a.getDescription());
            sb.append(", source=");
            sb.append(C18274k.m82904k(this.f46919b));
            sb.append(", flags=");
            sb.append(C18274k.m82901b(this.f46920c));
            String str2 = "";
            if (this.f46921d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f46921d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f46922e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.k$i */
    public @interface C18283i {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.k$j */
    public @interface C18284j {
    }

    public C18274k(@C0359n0 C18281g gVar) {
        this.f46909a = gVar;
    }

    @C0359n0
    /* renamed from: a */
    public static ClipData m82900a(@C0359n0 ClipDescription clipDescription, @C0359n0 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static String m82901b(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    @C0359n0
    /* renamed from: h */
    public static Pair<ClipData, ClipData> m82902h(@C0359n0 ClipData clipData, @C0359n0 C18007x<ClipData.Item> xVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (xVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create((Object) null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, (Object) null);
        }
        return Pair.create(m82900a(clipData.getDescription(), arrayList), m82900a(clipData.getDescription(), arrayList2));
    }

    @C0359n0
    @C0376v0(31)
    /* renamed from: i */
    public static Pair<ContentInfo, ContentInfo> m82903i(@C0359n0 ContentInfo contentInfo, @C0359n0 Predicate<ClipData.Item> predicate) {
        return C18275a.m82913a(contentInfo, predicate);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public static String m82904k(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @C0359n0
    @C0376v0(31)
    /* renamed from: m */
    public static C18274k m82905m(@C0359n0 ContentInfo contentInfo) {
        return new C18274k(new C18280f(contentInfo));
    }

    @C0359n0
    /* renamed from: c */
    public ClipData mo52933c() {
        return this.f46909a.mo52956e();
    }

    @C0363p0
    /* renamed from: d */
    public Bundle mo52934d() {
        return this.f46909a.getExtras();
    }

    /* renamed from: e */
    public int mo52935e() {
        return this.f46909a.mo52953C();
    }

    @C0363p0
    /* renamed from: f */
    public Uri mo52936f() {
        return this.f46909a.mo52954a();
    }

    /* renamed from: g */
    public int mo52937g() {
        return this.f46909a.getSource();
    }

    @C0359n0
    /* renamed from: j */
    public Pair<C18274k, C18274k> mo52938j(@C0359n0 C18007x<ClipData.Item> xVar) {
        C18274k kVar;
        ClipData e = this.f46909a.mo52956e();
        C18274k kVar2 = null;
        if (e.getItemCount() == 1) {
            boolean test = xVar.test(e.getItemAt(0));
            if (test) {
                kVar = this;
            } else {
                kVar = null;
            }
            if (!test) {
                kVar2 = this;
            }
            return Pair.create(kVar, kVar2);
        }
        Pair<ClipData, ClipData> h = m82902h(e, xVar);
        if (h.first == null) {
            return Pair.create((Object) null, this);
        }
        if (h.second == null) {
            return Pair.create(this, (Object) null);
        }
        return Pair.create(new C18276b(this).mo52942b((ClipData) h.first).mo52941a(), new C18276b(this).mo52942b((ClipData) h.second).mo52941a());
    }

    @C0359n0
    @C0376v0(31)
    /* renamed from: l */
    public ContentInfo mo52939l() {
        ContentInfo b = this.f46909a.mo52955b();
        Objects.requireNonNull(b);
        return C18139d.m82310a(b);
    }

    @C0359n0
    public String toString() {
        return this.f46909a.toString();
    }

    @C0376v0(31)
    /* renamed from: androidx.core.view.k$c */
    public static final class C18277c implements C18278d {
        @C0359n0

        /* renamed from: a */
        public final ContentInfo.Builder f46911a;

        public C18277c(@C0359n0 ClipData clipData, int i) {
            C18231i.m82824a();
            this.f46911a = C18333p.m83047a(clipData, i);
        }

        /* renamed from: a */
        public void mo52947a(int i) {
            ContentInfo.Builder unused = this.f46911a.setSource(i);
        }

        /* renamed from: b */
        public void mo52948b(@C0363p0 Uri uri) {
            ContentInfo.Builder unused = this.f46911a.setLinkUri(uri);
        }

        /* renamed from: c */
        public void mo52949c(@C0359n0 ClipData clipData) {
            ContentInfo.Builder unused = this.f46911a.setClip(clipData);
        }

        /* renamed from: f */
        public void mo52950f(int i) {
            ContentInfo.Builder unused = this.f46911a.setFlags(i);
        }

        @C0359n0
        /* renamed from: g */
        public C18274k mo52951g() {
            return new C18274k(new C18280f(this.f46911a.build()));
        }

        public void setExtras(@C0363p0 Bundle bundle) {
            ContentInfo.Builder unused = this.f46911a.setExtras(bundle);
        }

        public C18277c(@C0359n0 C18274k kVar) {
            C18231i.m82824a();
            this.f46911a = C18192h.m82462a(kVar.mo52939l());
        }
    }

    /* renamed from: androidx.core.view.k$e */
    public static final class C18279e implements C18278d {
        @C0359n0

        /* renamed from: a */
        public ClipData f46912a;

        /* renamed from: b */
        public int f46913b;

        /* renamed from: c */
        public int f46914c;
        @C0363p0

        /* renamed from: d */
        public Uri f46915d;
        @C0363p0

        /* renamed from: e */
        public Bundle f46916e;

        public C18279e(@C0359n0 ClipData clipData, int i) {
            this.f46912a = clipData;
            this.f46913b = i;
        }

        /* renamed from: a */
        public void mo52947a(int i) {
            this.f46913b = i;
        }

        /* renamed from: b */
        public void mo52948b(@C0363p0 Uri uri) {
            this.f46915d = uri;
        }

        /* renamed from: c */
        public void mo52949c(@C0359n0 ClipData clipData) {
            this.f46912a = clipData;
        }

        /* renamed from: f */
        public void mo52950f(int i) {
            this.f46914c = i;
        }

        @C0359n0
        /* renamed from: g */
        public C18274k mo52951g() {
            return new C18274k(new C18282h(this));
        }

        public void setExtras(@C0363p0 Bundle bundle) {
            this.f46916e = bundle;
        }

        public C18279e(@C0359n0 C18274k kVar) {
            this.f46912a = kVar.mo52933c();
            this.f46913b = kVar.mo52937g();
            this.f46914c = kVar.mo52935e();
            this.f46915d = kVar.mo52936f();
            this.f46916e = kVar.mo52934d();
        }
    }

    /* renamed from: androidx.core.view.k$b */
    public static final class C18276b {
        @C0359n0

        /* renamed from: a */
        public final C18278d f46910a;

        public C18276b(@C0359n0 C18274k kVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f46910a = new C18277c(kVar);
            } else {
                this.f46910a = new C18279e(kVar);
            }
        }

        @C0359n0
        /* renamed from: a */
        public C18274k mo52941a() {
            return this.f46910a.mo52951g();
        }

        @C0359n0
        /* renamed from: b */
        public C18276b mo52942b(@C0359n0 ClipData clipData) {
            this.f46910a.mo52949c(clipData);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C18276b mo52943c(@C0363p0 Bundle bundle) {
            this.f46910a.setExtras(bundle);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C18276b mo52944d(int i) {
            this.f46910a.mo52950f(i);
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C18276b mo52945e(@C0363p0 Uri uri) {
            this.f46910a.mo52948b(uri);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C18276b mo52946f(int i) {
            this.f46910a.mo52947a(i);
            return this;
        }

        public C18276b(@C0359n0 ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f46910a = new C18277c(clipData, i);
            } else {
                this.f46910a = new C18279e(clipData, i);
            }
        }
    }
}
