package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.C22139e;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f57442a = new C22378a();

    /* renamed from: b */
    public static final DownsampleStrategy f57443b = new C22379b();

    /* renamed from: c */
    public static final DownsampleStrategy f57444c = new C22382e();

    /* renamed from: d */
    public static final DownsampleStrategy f57445d = new C22380c();

    /* renamed from: e */
    public static final DownsampleStrategy f57446e;

    /* renamed from: f */
    public static final DownsampleStrategy f57447f = new C22383f();

    /* renamed from: g */
    public static final DownsampleStrategy f57448g;

    /* renamed from: h */
    public static final C22139e<DownsampleStrategy> f57449h;

    /* renamed from: i */
    public static final boolean f57450i = true;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C22378a extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo66377a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo66378b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C22379b extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo66377a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public float mo66378b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C22380c extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo66377a(int i, int i2, int i3, int i4) {
            if (mo66378b(i, i2, i3, i4) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f57444c.mo66377a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo66378b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f57444c.mo66378b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C22381d extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo66377a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo66378b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C22382e extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo66377a(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f57450i) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public float mo66378b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f57450i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C22383f extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo66377a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo66378b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        C22381d dVar = new C22381d();
        f57446e = dVar;
        f57448g = dVar;
        f57449h = C22139e.m100836g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo66377a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo66378b(int i, int i2, int i3, int i4);
}
