package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.C17519a;
import androidx.core.view.C18306m0;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.drawable.q */
public final class C17565q {

    /* renamed from: a */
    public static final String f45920a = "RoundedBitmapDrawableFa";

    /* renamed from: androidx.core.graphics.drawable.q$a */
    public static class C17566a extends C17564p {
        public C17566a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* renamed from: f */
        public void mo51949f(int i, int i2, int i3, Rect rect, Rect rect2) {
            C18306m0.m82989b(i, i2, i3, rect, rect2, 0);
        }

        /* renamed from: h */
        public boolean mo51951h() {
            Bitmap bitmap = this.f45907a;
            return bitmap != null && C17519a.m80297c(bitmap);
        }

        /* renamed from: o */
        public void mo51952o(boolean z) {
            Bitmap bitmap = this.f45907a;
            if (bitmap != null) {
                C17519a.m80298d(bitmap, z);
                invalidateSelf();
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C17564p m80514a(@C0359n0 Resources resources, @C0363p0 Bitmap bitmap) {
        return new C17563o(resources, bitmap);
    }

    @C0359n0
    /* renamed from: b */
    public static C17564p m80515b(@C0359n0 Resources resources, @C0359n0 InputStream inputStream) {
        C17564p a = m80514a(resources, BitmapFactory.decodeStream(inputStream));
        if (a.mo51954b() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("RoundedBitmapDrawable cannot decode ");
            sb.append(inputStream);
        }
        return a;
    }

    @C0359n0
    /* renamed from: c */
    public static C17564p m80516c(@C0359n0 Resources resources, @C0359n0 String str) {
        C17564p a = m80514a(resources, BitmapFactory.decodeFile(str));
        if (a.mo51954b() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("RoundedBitmapDrawable cannot decode ");
            sb.append(str);
        }
        return a;
    }
}
