package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0341g1;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17997q;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: androidx.asynclayoutinflater.view.a */
public final class C0855a {

    /* renamed from: e */
    public static final String f2674e = "AsyncLayoutInflater";

    /* renamed from: a */
    public LayoutInflater f2675a;

    /* renamed from: b */
    public Handler f2676b;

    /* renamed from: c */
    public C0859d f2677c;

    /* renamed from: d */
    public Handler.Callback f2678d = new C0856a();

    /* renamed from: androidx.asynclayoutinflater.view.a$a */
    public class C0856a implements Handler.Callback {
        public C0856a() {
        }

        public boolean handleMessage(Message message) {
            C0858c cVar = (C0858c) message.obj;
            if (cVar.f2684d == null) {
                cVar.f2684d = C0855a.this.f2675a.inflate(cVar.f2683c, cVar.f2682b, false);
            }
            cVar.f2685e.mo3842a(cVar.f2684d, cVar.f2683c, cVar.f2682b);
            C0855a.this.f2677c.mo3839e(cVar);
            return true;
        }
    }

    /* renamed from: androidx.asynclayoutinflater.view.a$b */
    public static class C0857b extends LayoutInflater {

        /* renamed from: a */
        public static final String[] f2680a = {"android.widget.", "android.webkit.", "android.app."};

        public C0857b(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new C0857b(context);
        }

        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = f2680a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: androidx.asynclayoutinflater.view.a$c */
    public static class C0858c {

        /* renamed from: a */
        public C0855a f2681a;

        /* renamed from: b */
        public ViewGroup f2682b;

        /* renamed from: c */
        public int f2683c;

        /* renamed from: d */
        public View f2684d;

        /* renamed from: e */
        public C0860e f2685e;
    }

    /* renamed from: androidx.asynclayoutinflater.view.a$d */
    public static class C0859d extends Thread {

        /* renamed from: c */
        public static final C0859d f2686c;

        /* renamed from: a */
        public ArrayBlockingQueue<C0858c> f2687a = new ArrayBlockingQueue<>(10);

        /* renamed from: b */
        public C17997q.C18000c<C0858c> f2688b = new C17997q.C18000c<>(10);

        static {
            C0859d dVar = new C0859d();
            f2686c = dVar;
            dVar.start();
        }

        /* renamed from: c */
        public static C0859d m4013c() {
            return f2686c;
        }

        /* renamed from: a */
        public void mo3837a(C0858c cVar) {
            try {
                this.f2687a.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        /* renamed from: d */
        public C0858c mo3838d() {
            C0858c b = this.f2688b.mo52469b();
            if (b == null) {
                return new C0858c();
            }
            return b;
        }

        /* renamed from: e */
        public void mo3839e(C0858c cVar) {
            cVar.f2685e = null;
            cVar.f2681a = null;
            cVar.f2682b = null;
            cVar.f2683c = 0;
            cVar.f2684d = null;
            this.f2688b.mo52468a(cVar);
        }

        /* renamed from: f */
        public void mo3840f() {
            try {
                C0858c take = this.f2687a.take();
                try {
                    take.f2684d = take.f2681a.f2675a.inflate(take.f2683c, take.f2682b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.f2681a.f2676b, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        public void run() {
            while (true) {
                mo3840f();
            }
        }
    }

    /* renamed from: androidx.asynclayoutinflater.view.a$e */
    public interface C0860e {
        /* renamed from: a */
        void mo3842a(@C0359n0 View view, @C0347i0 int i, @C0363p0 ViewGroup viewGroup);
    }

    public C0855a(@C0359n0 Context context) {
        this.f2675a = new C0857b(context);
        this.f2676b = new Handler(this.f2678d);
        this.f2677c = C0859d.m4013c();
    }

    @C0341g1
    /* renamed from: a */
    public void mo3833a(@C0347i0 int i, @C0363p0 ViewGroup viewGroup, @C0359n0 C0860e eVar) {
        if (eVar != null) {
            C0858c d = this.f2677c.mo3838d();
            d.f2681a = this;
            d.f2683c = i;
            d.f2682b = viewGroup;
            d.f2685e = eVar;
            this.f2677c.mo3837a(d);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
