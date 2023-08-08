package com.google.zxing.pdf417.encoder;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.app.C17239t;
import androidx.core.location.C17699g;
import androidx.core.view.C18317n0;
import androidx.media.AudioAttributesCompat;
import com.bumptech.glide.gifdecoder.C22073d;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.presentation.p035ui.coupons.views.C23975b;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.p046io.OneAppApiException;
import com.contentsquare.android.api.C14092c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.WriterException;
import com.google.zxing.oned.C34779d;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import com.urbanairship.push.notifications.C9527p;
import com.usabilla.sdk.ubform.net.http.C9861c;
import org.joda.time.C12590b;
import org.joda.time.chrono.BuddhistChronology;

/* renamed from: com.google.zxing.pdf417.encoder.e */
public final class C34853e {

    /* renamed from: a */
    public static final int[][] f84676a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, C14092c.f34668w1, 653, 428, 379}, new int[]{DefaultImageHeaderParser.f57426n, 562, C14092c.f34591d0, 755, C9861c.f27017K0, C14092c.f34612i1, 801, C14092c.f34515F, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, DecodedBitStreamParser.f84565j, 525, 176, C14092c.f34628m1, 640, 321, 536, 742, 677, 742, 687, 284, C17699g.f46051u, 517, AudioAttributesCompat.f50016O, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, C14092c.f34522H0}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, C16717v.C16722e.f42273z, 287, 107, C16717v.C16724g.f42309m, 733, 877, 381, C16717v.C16722e.f42247B, 723, 476, C14092c.f34567W0, 172, C14092c.f34543O0, C16717v.C16722e.f42272y, C14092c.f34597e2, 822, BuddhistChronology.f30973b1, C14092c.f34499A0, C17239t.f45525u, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, C14092c.f34663v0, C16717v.C16722e.f42268u, 158, 651, ComposerKt.f22642l, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, C14092c.f34594e, 629, 4, 381, 843, 623, 264, BuddhistChronology.f30973b1}, new int[]{521, 310, 864, 547, C14092c.f34597e2, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, C14092c.f34572Y, 928, 244, 583, 620, 246, C34779d.f84376g, 447, 631, C14092c.f34627m0, 908, 490, 704, C14092c.f34608h1, 258, 457, 907, 594, 723, 674, C14092c.f34627m0, 272, 96, 684, 432, 686, C16717v.C16722e.f42269v, C14092c.f34609h2, 569, C17699g.f46051u, 219, 129, 186, 236, 287, C14092c.f34560U, 775, 278, 173, 40, 379, 712, 463, C14092c.f34668w1, C14092c.f34565V1, 171, 491, 297, 763, C14092c.f34536M, 732, 95, 270, 447, 90, C16717v.C16724g.f42311o, 48, 228, 821, 808, 898, C14092c.f34589c2, 663, 627, 378, 382, C14092c.f34575Z, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, C14092c.f34607h0, 726, 600, 269, 375, 898, 845, C14092c.f34561U0, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, C14092c.f34559T1, 315, 550, 86, 801, 4, 108, 539}, new int[]{C14092c.f34612i1, 894, 75, 766, C14092c.f34676y1, 857, 74, 204, 82, C14092c.f34628m1, 708, 250, C16717v.C16719b.f42192o, 786, 138, 720, C14092c.f34597e2, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, ComposerKt.f22642l, 280, 828, 757, C14092c.f34540N0, 814, 919, 89, 68, 569, 11, 204, 796, C16717v.C16722e.f42268u, 540, 913, 801, 700, 799, 137, 439, C14092c.f34531K0, 592, 668, 353, 859, 370, C14092c.f34511D1, 325, C9527p.f26031b, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, DefaultImageHeaderParser.f57426n, 877, 162, 749, 812, 684, 461, 334, C14092c.f34499A0, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, C17239t.f45525u, 51, 8, 517, 225, 289, FloatingActionButton.f75592Q0, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, C14092c.f34527J, 538, C16717v.C16719b.f42193p, 90, 2, 290, 743, 199, 655, C16717v.C16719b.f42190m, 329, 49, 802, 580, 355, 588, C14092c.f34554S, C14092c.f34567W0, 10, 134, 628, 320, 479, 130, 739, 71, 263, C16717v.C16718a.f42170s, 374, 601, C14092c.f34560U, C16717v.C16722e.f42268u, 142, 673, 687, 234, 722, C22132b.f56831b, 177, C14092c.f34541N1, C16717v.C16722e.f42270w, 640, 455, C17699g.f46051u, C28539g.f69237M, C16717v.C16725h.f42332q, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, C14092c.f34549Q0, 60, 231, 773, C14092c.f34546P0, 421, 726, 528, 503, 118, 49, 795, 32, C14092c.f34532K1, 500, C14092c.f34603g0, 836, 394, 280, C14092c.f34620k1, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, C16717v.C16722e.f42272y, 441, 180, 791, 893, 754, C16717v.C16722e.f42268u, 383, 228, 749, C14092c.f34550Q1, 213, 54, 297, 134, 54, C14092c.f34559T1, 299, DecodedBitStreamParser.f84565j, C14092c.f34557T, 910, C14092c.f34566W, C16717v.C16722e.f42272y, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, C16717v.C16724g.f42309m, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, BuddhistChronology.f30973b1, 307, 159, 924, C14092c.f34616j1, 648, 55, 497, 10}, new int[]{C14092c.f34663v0, 77, 373, 504, 35, C9861c.f27017K0, 428, ComposerKt.f22652v, OneAppApiException.f70522g, 574, 118, C14092c.f34588c1, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, C14092c.f34664v1, 294, 871, 306, 88, 87, C17699g.f46051u, C14092c.f34663v0, 781, 846, 75, 327, 520, 435, BuddhistChronology.f30973b1, 203, 666, C22073d.f56676j, 346, 781, 621, 640, 268, 794, 534, 539, 781, C14092c.f34519G0, 390, 644, 102, 476, C23975b.f60174c, 290, 632, 545, 37, C14092c.f34597e2, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, C14092c.f34541N1, 472, 761, 107, C14092c.f34589c2, C14092c.f34609h2, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, C18317n0.f46975j, C14092c.f34560U, C14092c.f34608h1, 258, C9527p.f26031b, 518, 794, 395, 768, 848, 51, C16717v.C16722e.f42273z, C22132b.f56831b, C12590b.f30836K, 190, C14092c.f34635o0, C14092c.f34643q0, 596, 786, 303, 570, 381, 415, 641, C14092c.f34536M, 237, 151, 429, 531, ComposerKt.f22652v, 676, C14092c.f34540N0, 89, C12590b.f30836K, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, C16717v.C16725h.f42332q, 94, 8, 494, 114, 521, 2, C23975b.f60174c, 851, BuddhistChronology.f30973b1, C14092c.f34530K, 729, 771, 95, 248, 361, C14092c.f34498A, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, C14092c.f34498A, 37, 124, 298, C14092c.f34647r0, 552, 43, 427, 119, 662, 777, 475, 850, C14092c.f34562U1, C14092c.f34675y0, C14092c.f34498A, 911, 283, 711, 472, 420, 245, 288, 594, 394, C17239t.f45525u, 327, 589, 777, 699, 688, 43, C14092c.f34519G0, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, C17699g.f46051u, C14092c.f34528J0, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, C14092c.f34522H0, 579, 870, 617, 841, 632, C14092c.f34609h2, 289, 536, 35, 777, 618, C14092c.f34628m1, C16717v.C16720c.f42235v, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, DecodedBitStreamParser.f84565j, 437, 519, 644, C16717v.C16719b.f42192o, 789, 420, 305, 441, ComposerKt.f22652v, 300, 892, 827, 141, 537, 381, 662, C18317n0.f46975j, 56, 252, 341, C14092c.f34607h0, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, C14092c.f34549Q0, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, C14092c.f34632n1, 731, C16717v.C16720c.f42236w, 216, C14092c.f34613i2, C22073d.f56676j, 321, 881, 699, 535, 673, 782, 210, 815, C16717v.C16719b.f42192o, 303, 843, DecodedBitStreamParser.f84565j, 281, 73, 469, 791, 660, 162, C14092c.f34588c1, 308, 155, 422, 907, 817, 187, 62, 16, C16717v.C16720c.f42236w, 535, 336, 286, 437, 375, AudioAttributesCompat.f50016O, C16717v.C16722e.f42273z, 296, 183, DecodedBitStreamParser.f84564i, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, DecodedBitStreamParser.f84564i, 311, C16717v.C16720c.f42235v, C14092c.f34607h0, 749, 321, 54, 669, C16717v.C16718a.f42168q, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, C16717v.C16718a.f42168q, 486, 721, C16717v.C16722e.f42273z, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, C14092c.f34541N1, 533, HideBottomViewOnScrollBehavior.f74656f, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, C14092c.f34668w1, 411, 877, 669, 141, 919, 45, C14092c.f34568W1, 407, 164, C14092c.f34647r0, 899, 165, 726, 600, 325, C14092c.f34588c1, 655, 357, C14092c.f34541N1, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, C14092c.f34522H0, 389, 244, 31, 121, 303, 263}};

    /* renamed from: a */
    public static String m142400a(CharSequence charSequence, int i) {
        int b = m142401b(i);
        char[] cArr = new char[b];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = b - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % 929;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((f84676a[i][i3] * charAt) % 929))) % 929);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * f84676a[i][0]) % 929)) % 929);
        }
        StringBuilder sb = new StringBuilder(b);
        for (int i4 = b - 1; i4 >= 0; i4--) {
            char c = cArr[i4];
            if (c != 0) {
                cArr[i4] = (char) (929 - c);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static int m142401b(int i) {
        if (i >= 0 && i <= 8) {
            return 1 << (i + 1);
        }
        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
    }

    /* renamed from: c */
    public static int m142402c(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        } else if (i <= 40) {
            return 2;
        } else {
            if (i <= 160) {
                return 3;
            }
            if (i <= 320) {
                return 4;
            }
            if (i <= 863) {
                return 5;
            }
            throw new WriterException("No recommendation possible");
        }
    }
}
