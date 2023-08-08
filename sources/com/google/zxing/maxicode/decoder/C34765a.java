package com.google.zxing.maxicode.decoder;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.app.C17239t;
import androidx.core.location.C17699g;
import androidx.core.view.C18317n0;
import androidx.media.AudioAttributesCompat;
import com.bumptech.glide.gifdecoder.C22073d;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.presentation.p035ui.coupons.views.C23975b;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.LoyaltyBonusListFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.legacy.WithdrawalOrderDriveFragment;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.p046io.OneAppApiException;
import com.contentsquare.android.api.C14092c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.zxing.common.C34710b;
import com.google.zxing.oned.C34779d;
import com.skydoves.landscapist.C35345o;
import com.urbanairship.push.notifications.C9527p;
import com.usabilla.sdk.ubform.net.http.C9861c;
import org.joda.time.C12590b;
import org.joda.time.chrono.BuddhistChronology;

/* renamed from: com.google.zxing.maxicode.decoder.a */
public final class C34765a {

    /* renamed from: b */
    public static final int[][] f84284b = {new int[]{121, 120, 127, 126, 133, C14092c.f34515F, 139, 138, 145, C14092c.f34532K1, 151, 150, 157, C14092c.f34536M, 163, 162, LoyaltyConstantsKt.LOYALTY_MAX_WIDTH, C12590b.f30836K, HideBottomViewOnScrollBehavior.f74656f, C14092c.f34545P, 181, 180, 187, 186, C17699g.f46051u, C14092c.f34560U, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, C14092c.f34530K, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, C14092c.f34554S, 195, 194, ComposerKt.f22642l, 200, 816, -3}, new int[]{125, 124, 131, 130, 137, C14092c.f34527J, 143, 142, 149, C34779d.f84376g, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, C14092c.f34557T, 190, 197, LoyaltyBonusListFragment.f60703y, 203, ComposerKt.f22644n, C14092c.f34583b0, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, 253, 252, 247, 246, 241, C9527p.f26031b, 235, 234, 229, 228, 223, C14092c.f34587c0, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, AudioAttributesCompat.f50016O, 272, 267, 266, 261, 260, 255, C22073d.f56678l, C22073d.f56676j, 248, 243, C14092c.f34607h0, 237, 236, 231, C14092c.f34599f0, 225, 224, 219, DefaultImageHeaderParser.f57422j, 213, 212, ComposerKt.f22652v, ComposerKt.f22650t, 821, 820}, new int[]{287, 286, 281, 280, 275, DefaultImageHeaderParser.f57426n, 269, 268, 263, C14092c.f34575Z, 257, 256, 251, 250, 245, 244, 239, C14092c.f34603g0, 233, C14092c.f34591d0, 227, 226, 221, WithdrawalOrderDriveFragment.f61322x, ModuleDescriptor.MODULE_VERSION, C14092c.f34579a0, 209, C14092c.f34572Y, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, C16717v.C16718a.f42170s, 325, C14092c.f34639p0, 331, 330, 337, 336, 343, 342, 349, C14092c.f34659u0, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, C14092c.f34647r0, 339, 338, 345, C14092c.f34655t0, 351, 350, 357, C14092c.f34658u, 363, 362, 369, C14092c.f34679z0, 825, -3}, new int[]{293, C14092c.f34627m0, 299, 298, 305, 304, 311, 310, C16717v.C16718a.f42169r, C16717v.C16718a.f42168q, 323, 322, 329, C14092c.f34643q0, 335, 334, 341, C14092c.f34651s0, 347, 346, 353, C14092c.f34663v0, 359, 358, 365, C14092c.f34675y0, 371, 370, 827, C14092c.f34635o0}, new int[]{OneAppApiException.f70522g, C14092c.f34519G0, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, C22132b.f56831b, 379, 378, 373, 372, 828, -3}, new int[]{411, C14092c.f34522H0, 405, 404, 399, C14092c.f34513E0, 393, C14092c.f34507C0, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, C14092c.f34503B0, 383, 382, 377, C14092c.f34499A0, 831, -3}, new int[]{415, C14092c.f34525I0, 421, 420, 427, C14092c.f34537M0, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{C14092c.f34528J0, C16717v.C16720c.f42230q, C16717v.C16720c.f42234u, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, C14092c.f34546P0, 441, 440, 447, C14092c.f34552R0, C14092c.f34559T1, -3}, new int[]{419, C14092c.f34531K0, C16717v.C16720c.f42236w, C16717v.C16720c.f42235v, 431, C14092c.f34543O0, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{481, C14092c.f34573Y0, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, C14092c.f34567W0, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, FloatingActionButton.f75592Q0, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, C14092c.f34564V0, 453, 452, 839, 838}, new int[]{485, C14092c.f34580a1, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, C14092c.f34561U0, C14092c.f34594e, -3}, new int[]{487, 486, 493, 492, C23975b.f60174c, C14092c.f34588c1, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, C16717v.C16724g.f42309m, 504, C17239t.f45525u, C16717v.C16724g.f42314r, 517, C14092c.f34608h1, 842, 841}, new int[]{489, 488, 495, 494, C16717v.C16724g.f42305i, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, C16717v.C16724g.f42311o, C16717v.C16724g.f42310n, C18317n0.f46975j, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, C14092c.f34592d1, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, C16717v.C16724g.f42312p, 515, 514, 521, 520, 845, 844}, new int[]{559, C14092c.f34616j1, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, C14092c.f34551R, 549, C14092c.f34613i2, BuddhistChronology.f30973b1, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, C14092c.f34612i1, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, C14092c.f34566W, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, C16717v.C16722e.f42270w, C16717v.C16722e.f42269v, 613, C16717v.C16722e.f42247B, 619, 618, 625, 624, 631, 630, 637, 636, C14092c.f34664v1, 642, 851, 850}, new int[]{567, C14092c.f34620k1, 573, 572, 579, C14092c.f34498A, 585, 584, 591, C14092c.f34632n1, 597, 596, 603, 602, C16717v.C16722e.f42272y, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, C14092c.f34628m1, 593, 592, C9861c.f27017K0, C14092c.f34636o1, C16717v.C16722e.f42268u, 604, C16717v.C16722e.f42246A, C16717v.C16722e.f42273z, 617, 616, 623, 622, 629, 628, 635, C14092c.f34656t1, 641, 640, 647, C14092c.f34668w1, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, C14092c.f34508C1, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, C14092c.f34672x1, 649, 648, 855, -3}, new int[]{729, C14092c.f34529J1, 723, 722, 717, 716, 711, C14092c.f34540N0, C16717v.C16725h.f42330o, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, C35345o.f86835d, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, C16717v.C16725h.f42332q, 706, C16717v.C16725h.f42326k, 700, 695, C14092c.f34511D1, C28539g.f69237M, 688, 683, C14092c.f34500A1, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, C14092c.f34597e2, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, C14092c.f34549Q0, 763, 762, 769, 768, 775, 774, 781, C14092c.f34568W1, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, C14092c.f34609h2, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, C14092c.f34541N1, 759, 758, 765, C14092c.f34562U1, 771, 770, 777, C14092c.f34565V1, 783, 782, 789, C14092c.f34571X1, 795, 794, 801, 800, C14092c.f34555S0, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, C14092c.f34595e0, 755, 754, 761, C14092c.f34550Q1, 767, 766, 773, 772, 779, 778, 785, C14092c.f34589c2, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};

    /* renamed from: a */
    public final C34710b f84285a;

    public C34765a(C34710b bVar) {
        this.f84285a = bVar;
    }

    /* renamed from: a */
    public byte[] mo102889a() {
        byte[] bArr = new byte[C14092c.f34532K1];
        int k = this.f84285a.mo102670k();
        int o = this.f84285a.mo102674o();
        for (int i = 0; i < k; i++) {
            int[] iArr = f84284b[i];
            for (int i2 = 0; i2 < o; i2++) {
                int i3 = iArr[i2];
                if (i3 >= 0 && this.f84285a.mo102666h(i2, i)) {
                    int i4 = i3 / 6;
                    bArr[i4] = (byte) (((byte) (1 << (5 - (i3 % 6)))) | bArr[i4]);
                }
            }
        }
        return bArr;
    }
}
