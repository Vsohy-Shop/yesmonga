package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.data.C22116e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C22116e<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f56793a;

    @C0376v0(21)
    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f56794a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f56794a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f56794a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f56794a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @C0376v0(21)
    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C22110a implements C22116e.C22117a<ParcelFileDescriptor> {
        @C0359n0
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo65781a() {
            return ParcelFileDescriptor.class;
        }

        @C0359n0
        /* renamed from: c */
        public C22116e<ParcelFileDescriptor> mo65782b(@C0359n0 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @C0376v0(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f56793a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m100728c() {
        return true;
    }

    /* renamed from: b */
    public void mo65778b() {
    }

    @C0359n0
    @C0376v0(21)
    /* renamed from: d */
    public ParcelFileDescriptor mo65777a() throws IOException {
        return this.f56793a.rewind();
    }
}
