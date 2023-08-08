package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17978f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.content.c */
public class C19547c<D> {

    /* renamed from: a */
    public int f49975a;

    /* renamed from: b */
    public C19550c<D> f49976b;

    /* renamed from: c */
    public C19549b<D> f49977c;

    /* renamed from: d */
    public Context f49978d;

    /* renamed from: e */
    public boolean f49979e = false;

    /* renamed from: f */
    public boolean f49980f = false;

    /* renamed from: g */
    public boolean f49981g = true;

    /* renamed from: h */
    public boolean f49982h = false;

    /* renamed from: i */
    public boolean f49983i = false;

    /* renamed from: androidx.loader.content.c$a */
    public final class C19548a extends ContentObserver {
        public C19548a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C19547c.this.mo57822p();
        }
    }

    /* renamed from: androidx.loader.content.c$b */
    public interface C19549b<D> {
        /* renamed from: a */
        void mo57832a(@C0359n0 C19547c<D> cVar);
    }

    /* renamed from: androidx.loader.content.c$c */
    public interface C19550c<D> {
        /* renamed from: a */
        void mo57732a(@C0359n0 C19547c<D> cVar, @C0363p0 D d);
    }

    public C19547c(@C0359n0 Context context) {
        this.f49978d = context.getApplicationContext();
    }

    /* renamed from: A */
    public boolean mo57807A() {
        boolean z = this.f49982h;
        this.f49982h = false;
        this.f49983i |= z;
        return z;
    }

    @C0353k0
    /* renamed from: B */
    public void mo57808B(@C0359n0 C19550c<D> cVar) {
        C19550c<D> cVar2 = this.f49976b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar2 == cVar) {
            this.f49976b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @C0353k0
    /* renamed from: C */
    public void mo57809C(@C0359n0 C19549b<D> bVar) {
        C19549b<D> bVar2 = this.f49977c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f49977c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @C0353k0
    /* renamed from: a */
    public void mo57810a() {
        this.f49980f = true;
        mo57821n();
    }

    @C0353k0
    /* renamed from: b */
    public boolean mo57811b() {
        return mo57785o();
    }

    /* renamed from: c */
    public void mo57812c() {
        this.f49983i = false;
    }

    @C0359n0
    /* renamed from: d */
    public String mo57813d(@C0363p0 D d) {
        StringBuilder sb = new StringBuilder(64);
        C17978f.m81683a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @C0353k0
    /* renamed from: e */
    public void mo57814e() {
        C19549b<D> bVar = this.f49977c;
        if (bVar != null) {
            bVar.mo57832a(this);
        }
    }

    @C0353k0
    /* renamed from: f */
    public void mo57803f(@C0363p0 D d) {
        C19550c<D> cVar = this.f49976b;
        if (cVar != null) {
            cVar.mo57732a(this, d);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo57784g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f49975a);
        printWriter.print(" mListener=");
        printWriter.println(this.f49976b);
        if (this.f49979e || this.f49982h || this.f49983i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f49979e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f49982h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f49983i);
        }
        if (this.f49980f || this.f49981g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f49980f);
            printWriter.print(" mReset=");
            printWriter.println(this.f49981g);
        }
    }

    @C0353k0
    /* renamed from: h */
    public void mo57815h() {
        mo57786q();
    }

    @C0359n0
    /* renamed from: i */
    public Context mo57816i() {
        return this.f49978d;
    }

    /* renamed from: j */
    public int mo57817j() {
        return this.f49975a;
    }

    /* renamed from: k */
    public boolean mo57818k() {
        return this.f49980f;
    }

    /* renamed from: l */
    public boolean mo57819l() {
        return this.f49981g;
    }

    /* renamed from: m */
    public boolean mo57820m() {
        return this.f49979e;
    }

    @C0353k0
    /* renamed from: n */
    public void mo57821n() {
    }

    @C0353k0
    /* renamed from: o */
    public boolean mo57785o() {
        return false;
    }

    @C0353k0
    /* renamed from: p */
    public void mo57822p() {
        if (this.f49979e) {
            mo57815h();
        } else {
            this.f49982h = true;
        }
    }

    @C0353k0
    /* renamed from: q */
    public void mo57786q() {
    }

    @C0353k0
    /* renamed from: r */
    public void mo57804r() {
    }

    @C0353k0
    /* renamed from: s */
    public void mo57805s() {
    }

    @C0353k0
    /* renamed from: t */
    public void mo57806t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C17978f.m81683a(this, sb);
        sb.append(" id=");
        sb.append(this.f49975a);
        sb.append("}");
        return sb.toString();
    }

    @C0353k0
    /* renamed from: u */
    public void mo57824u(int i, @C0359n0 C19550c<D> cVar) {
        if (this.f49976b == null) {
            this.f49976b = cVar;
            this.f49975a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @C0353k0
    /* renamed from: v */
    public void mo57825v(@C0359n0 C19549b<D> bVar) {
        if (this.f49977c == null) {
            this.f49977c = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @C0353k0
    /* renamed from: w */
    public void mo57826w() {
        mo57804r();
        this.f49981g = true;
        this.f49979e = false;
        this.f49980f = false;
        this.f49982h = false;
        this.f49983i = false;
    }

    /* renamed from: x */
    public void mo57827x() {
        if (this.f49983i) {
            mo57822p();
        }
    }

    @C0353k0
    /* renamed from: y */
    public final void mo57828y() {
        this.f49979e = true;
        this.f49981g = false;
        this.f49980f = false;
        mo57805s();
    }

    @C0353k0
    /* renamed from: z */
    public void mo57829z() {
        this.f49979e = false;
        mo57806t();
    }
}
