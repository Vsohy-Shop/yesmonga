package com.urbanairship.images;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.images.C9275c;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.images.a */
public class C9270a implements C9275c {

    /* renamed from: a */
    public final Map<ImageView, C9278e> f25287a = new WeakHashMap();

    /* renamed from: b */
    public final C9272b f25288b;

    /* renamed from: com.urbanairship.images.a$a */
    public class C9271a extends C9278e {

        /* renamed from: k */
        public final /* synthetic */ C9282f f25289k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9271a(Context context, C9272b bVar, ImageView imageView, C9282f fVar, C9282f fVar2) {
            super(context, bVar, imageView, fVar);
            this.f25289k = fVar2;
        }

        /* renamed from: j */
        public void mo18653j(@C0363p0 ImageView imageView, boolean z) {
            if (imageView != null) {
                C9270a.this.f25287a.remove(imageView);
                C9275c.C9276a a = this.f25289k.mo18668a();
                if (a != null) {
                    a.mo18659a(z);
                }
            }
        }
    }

    public C9270a(@C0359n0 Context context) {
        this.f25288b = new C9272b(context);
    }

    /* renamed from: a */
    public void mo18651a(@C0359n0 Context context, @C0359n0 ImageView imageView, @C0359n0 C9282f fVar) {
        mo18652c(imageView);
        C9271a aVar = new C9271a(context, this.f25288b, imageView, fVar, fVar);
        this.f25287a.put(imageView, aVar);
        aVar.mo18662g();
    }

    /* renamed from: c */
    public final void mo18652c(@C0363p0 ImageView imageView) {
        C9278e remove;
        if (imageView != null && (remove = this.f25287a.remove(imageView)) != null) {
            remove.mo18661f();
        }
    }
}
