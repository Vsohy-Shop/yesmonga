package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.a2 */
public interface C1353a2 extends AutoCloseable {

    /* renamed from: androidx.camera.core.a2$a */
    public interface C1354a {
        @C0359n0
        /* renamed from: e */
        ByteBuffer mo4906e();

        /* renamed from: f */
        int mo4907f();

        /* renamed from: g */
        int mo4908g();
    }

    @C0359n0
    /* renamed from: I2 */
    Rect mo4973I2();

    void close();

    int getFormat();

    int getHeight();

    @C0363p0
    @C1415i0
    Image getImage();

    int getWidth();

    @SuppressLint({"ArrayReturn"})
    @C0359n0
    /* renamed from: o2 */
    C1354a[] mo4911o2();

    @C0359n0
    /* renamed from: q3 */
    C1741z1 mo4977q3();

    /* renamed from: y1 */
    void mo4978y1(@C0363p0 Rect rect);
}
