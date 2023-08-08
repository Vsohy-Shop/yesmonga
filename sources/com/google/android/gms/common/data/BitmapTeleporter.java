package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.ImageSaver;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@C40473a
@C40858y
@SafeParcelable.C40812a(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C40704m();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103650a;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public ParcelFileDescriptor f103651b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final int f103652c;
    @C0363p0

    /* renamed from: d */
    public Bitmap f103653d;

    /* renamed from: e */
    public boolean f103654e;

    /* renamed from: f */
    public File f103655f;

    @SafeParcelable.C40813b
    public BitmapTeleporter(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.C40816e(mo134492id = 3) int i2) {
        this.f103650a = i;
        this.f103651b = parcelFileDescriptor;
        this.f103652c = i2;
        this.f103653d = null;
        this.f103654e = false;
    }

    /* renamed from: W */
    public static final void m165560W(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: M */
    public Bitmap mo134122M() {
        if (!this.f103654e) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) C40843u.m166202l(this.f103651b)));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                m165560W(dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.f103653d = createBitmap;
                this.f103654e = true;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                m165560W(dataInputStream);
                throw th;
            }
        }
        return this.f103653d;
    }

    @C40473a
    /* renamed from: Q */
    public void mo134123Q(@C0359n0 File file) {
        if (file != null) {
            this.f103655f = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    @C40473a
    public void release() {
        if (!this.f103654e) {
            try {
                ((ParcelFileDescriptor) C40843u.m166202l(this.f103651b)).close();
            } catch (IOException unused) {
            }
        }
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        if (this.f103651b == null) {
            Bitmap bitmap = (Bitmap) C40843u.m166202l(this.f103653d);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f103655f;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ImageSaver.f3843w, file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f103651b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                            m165560W(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m165560W(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103650a);
        C40820a.m166102S(parcel, 2, this.f103651b, i | 1, false);
        C40820a.m166089F(parcel, 3, this.f103652c);
        C40820a.m166112b(parcel, a);
        this.f103651b = null;
    }

    @C40473a
    public BitmapTeleporter(@C0359n0 Bitmap bitmap) {
        this.f103650a = 1;
        this.f103651b = null;
        this.f103652c = 0;
        this.f103653d = bitmap;
        this.f103654e = true;
    }
}
