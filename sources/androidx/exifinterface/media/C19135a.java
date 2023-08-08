package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.view.C18317n0;
import androidx.media.AudioAttributesCompat;
import com.bumptech.glide.gifdecoder.C22073d;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.contentsquare.android.api.C14092c;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.joda.time.DateTimeFieldType;
import p073j$.util.DesugarTimeZone;

/* renamed from: androidx.exifinterface.media.a */
public class C19135a {

    /* renamed from: A */
    public static final String f48665A = "Compression";

    /* renamed from: A0 */
    public static final String f48666A0 = "OECF";

    /* renamed from: A1 */
    public static final String f48667A1 = "GPSLongitudeRef";

    /* renamed from: A2 */
    public static final String f48668A2 = "CameraSettingsIFDPointer";

    /* renamed from: A3 */
    public static final short f48669A3 = 9;

    /* renamed from: A4 */
    public static final short f48670A4 = 2;

    /* renamed from: A5 */
    public static final int f48671A5 = 0;

    /* renamed from: A6 */
    public static final int f48672A6 = 9;

    /* renamed from: A7 */
    public static final byte f48673A7 = -50;

    /* renamed from: B */
    public static final String f48674B = "PhotometricInterpretation";

    /* renamed from: B0 */
    public static final String f48675B0 = "SensitivityType";

    /* renamed from: B1 */
    public static final String f48676B1 = "GPSLongitude";

    /* renamed from: B2 */
    public static final String f48677B2 = "ImageProcessingIFDPointer";

    /* renamed from: B3 */
    public static final short f48678B3 = 10;

    /* renamed from: B4 */
    public static final short f48679B4 = 3;

    /* renamed from: B5 */
    public static final int f48680B5 = 1;

    /* renamed from: B6 */
    public static final int f48681B6 = 10;

    /* renamed from: B7 */
    public static final byte f48682B7 = -49;

    /* renamed from: C */
    public static final String f48683C = "Orientation";

    /* renamed from: C0 */
    public static final String f48684C0 = "StandardOutputSensitivity";

    /* renamed from: C1 */
    public static final String f48685C1 = "GPSAltitudeRef";

    /* renamed from: C2 */
    public static final int f48686C2 = 512;

    /* renamed from: C3 */
    public static final short f48687C3 = 11;

    /* renamed from: C4 */
    public static final short f48688C4 = 4;

    /* renamed from: C5 */
    public static final int f48689C5 = 5000;

    /* renamed from: C6 */
    public static final int f48690C6 = 11;

    /* renamed from: C7 */
    public static final byte f48691C7 = -38;

    /* renamed from: D */
    public static final String f48692D = "SamplesPerPixel";

    /* renamed from: D0 */
    public static final String f48693D0 = "RecommendedExposureIndex";

    /* renamed from: D1 */
    public static final String f48694D1 = "GPSAltitude";

    /* renamed from: D2 */
    public static final int f48695D2 = 0;

    /* renamed from: D3 */
    public static final short f48696D3 = 12;

    /* renamed from: D4 */
    public static final short f48697D4 = 0;

    /* renamed from: D5 */
    public static final byte[] f48698D5 = {-1, f49018o7, -1};

    /* renamed from: D6 */
    public static final int f48699D6 = 12;

    /* renamed from: D7 */
    public static final byte f48700D7 = -31;

    /* renamed from: E */
    public static final String f48701E = "PlanarConfiguration";

    /* renamed from: E0 */
    public static final String f48702E0 = "ISOSpeed";

    /* renamed from: E1 */
    public static final String f48703E1 = "GPSTimeStamp";

    /* renamed from: E2 */
    public static final int f48704E2 = 1;

    /* renamed from: E3 */
    public static final short f48705E3 = 13;

    /* renamed from: E4 */
    public static final short f48706E4 = 1;

    /* renamed from: E5 */
    public static final String f48707E5 = "FUJIFILMCCD-RAW";

    /* renamed from: E6 */
    public static final int f48708E6 = 13;

    /* renamed from: E7 */
    public static final byte f48709E7 = -2;

    /* renamed from: F */
    public static final String f48710F = "YCbCrSubSampling";

    /* renamed from: F0 */
    public static final String f48711F0 = "ISOSpeedLatitudeyyy";

    /* renamed from: F1 */
    public static final String f48712F1 = "GPSSatellites";

    /* renamed from: F2 */
    public static final int f48713F2 = 2;

    /* renamed from: F3 */
    public static final short f48714F3 = 14;

    /* renamed from: F4 */
    public static final short f48715F4 = 2;

    /* renamed from: F5 */
    public static final int f48716F5 = 84;

    /* renamed from: F6 */
    public static final String[] f48717F6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: F7 */
    public static final byte f48718F7 = -39;

    /* renamed from: G */
    public static final String f48719G = "YCbCrPositioning";

    /* renamed from: G0 */
    public static final String f48720G0 = "ISOSpeedLatitudezzz";

    /* renamed from: G1 */
    public static final String f48721G1 = "GPSStatus";

    /* renamed from: G2 */
    public static final int f48722G2 = 3;

    /* renamed from: G3 */
    public static final short f48723G3 = 15;

    /* renamed from: G4 */
    public static final short f48724G4 = 0;

    /* renamed from: G5 */
    public static final byte[] f48725G5 = {102, 116, 121, 112};

    /* renamed from: G6 */
    public static final int[] f48726G6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: G7 */
    public static final int f48727G7 = 0;

    /* renamed from: H */
    public static final String f48728H = "XResolution";

    /* renamed from: H0 */
    public static final String f48729H0 = "ShutterSpeedValue";

    /* renamed from: H1 */
    public static final String f48730H1 = "GPSMeasureMode";

    /* renamed from: H2 */
    public static final int f48731H2 = 4;

    /* renamed from: H3 */
    public static final short f48732H3 = 16;

    /* renamed from: H4 */
    public static final short f48733H4 = 0;

    /* renamed from: H5 */
    public static final byte[] f48734H5 = {109, 105, 102, 49};

    /* renamed from: H6 */
    public static final byte[] f48735H6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: H7 */
    public static final int f48736H7 = 1;

    /* renamed from: I */
    public static final String f48737I = "YResolution";

    /* renamed from: I0 */
    public static final String f48738I0 = "ApertureValue";

    /* renamed from: I1 */
    public static final String f48739I1 = "GPSDOP";

    /* renamed from: I2 */
    public static final int f48740I2 = 5;

    /* renamed from: I3 */
    public static final short f48741I3 = 17;

    /* renamed from: I4 */
    public static final short f48742I4 = 0;

    /* renamed from: I5 */
    public static final byte[] f48743I5 = {104, 101, 105, 99};

    /* renamed from: I6 */
    public static final C19141f[] f48744I6;

    /* renamed from: I7 */
    public static final int f48745I7 = 2;

    /* renamed from: J */
    public static final String f48746J = "ResolutionUnit";

    /* renamed from: J0 */
    public static final String f48747J0 = "BrightnessValue";

    /* renamed from: J1 */
    public static final String f48748J1 = "GPSSpeedRef";

    /* renamed from: J2 */
    public static final int f48749J2 = 6;

    /* renamed from: J3 */
    public static final short f48750J3 = 18;

    /* renamed from: J4 */
    public static final short f48751J4 = 0;

    /* renamed from: J5 */
    public static final short f48752J5 = 20306;

    /* renamed from: J6 */
    public static final C19141f[] f48753J6;

    /* renamed from: J7 */
    public static final int f48754J7 = 3;

    /* renamed from: K */
    public static final String f48755K = "StripOffsets";

    /* renamed from: K0 */
    public static final String f48756K0 = "ExposureBiasValue";

    /* renamed from: K1 */
    public static final String f48757K1 = "GPSSpeed";

    /* renamed from: K2 */
    public static final int f48758K2 = 7;

    /* renamed from: K3 */
    public static final short f48759K3 = 19;

    /* renamed from: K4 */
    public static final short f48760K4 = 1;

    /* renamed from: K5 */
    public static final short f48761K5 = 21330;

    /* renamed from: K6 */
    public static final C19141f[] f48762K6;

    /* renamed from: K7 */
    public static final int f48763K7 = 4;

    /* renamed from: L */
    public static final String f48764L = "RowsPerStrip";

    /* renamed from: L0 */
    public static final String f48765L0 = "MaxApertureValue";

    /* renamed from: L1 */
    public static final String f48766L1 = "GPSTrackRef";

    /* renamed from: L2 */
    public static final int f48767L2 = 8;

    /* renamed from: L3 */
    public static final short f48768L3 = 20;

    /* renamed from: L4 */
    public static final short f48769L4 = 2;

    /* renamed from: L5 */
    public static final byte[] f48770L5 = {79, 76, 89, 77, 80, 0};

    /* renamed from: L6 */
    public static final C19141f[] f48771L6;

    /* renamed from: L7 */
    public static final int f48772L7 = 5;

    /* renamed from: M */
    public static final String f48773M = "StripByteCounts";

    /* renamed from: M0 */
    public static final String f48774M0 = "SubjectDistance";

    /* renamed from: M1 */
    public static final String f48775M1 = "GPSTrack";

    /* renamed from: M2 */
    public static final List<Integer> f48776M2 = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: M3 */
    public static final short f48777M3 = 21;

    /* renamed from: M4 */
    public static final short f48778M4 = 0;

    /* renamed from: M5 */
    public static final byte[] f48779M5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: M6 */
    public static final C19141f[] f48780M6;

    /* renamed from: M7 */
    public static final int f48781M7 = 6;

    /* renamed from: N */
    public static final String f48782N = "JPEGInterchangeFormat";

    /* renamed from: N0 */
    public static final String f48783N0 = "MeteringMode";

    /* renamed from: N1 */
    public static final String f48784N1 = "GPSImgDirectionRef";

    /* renamed from: N2 */
    public static final List<Integer> f48785N2 = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: N3 */
    public static final short f48786N3 = 22;

    /* renamed from: N4 */
    public static final short f48787N4 = 1;

    /* renamed from: N5 */
    public static final int f48788N5 = 8;

    /* renamed from: N6 */
    public static final C19141f f48789N6 = new C19141f(f48755K, AudioAttributesCompat.f50016O, 3);

    /* renamed from: N7 */
    public static final int f48790N7 = 7;

    /* renamed from: O */
    public static final String f48791O = "JPEGInterchangeFormatLength";

    /* renamed from: O0 */
    public static final String f48792O0 = "LightSource";

    /* renamed from: O1 */
    public static final String f48793O1 = "GPSImgDirection";

    /* renamed from: O2 */
    public static final short f48794O2 = 1;

    /* renamed from: O3 */
    public static final short f48795O3 = 23;

    /* renamed from: O4 */
    public static final short f48796O4 = 2;

    /* renamed from: O5 */
    public static final int f48797O5 = 12;

    /* renamed from: O6 */
    public static final C19141f[] f48798O6;

    /* renamed from: O7 */
    public static final int f48799O7 = 8;

    /* renamed from: P */
    public static final String f48800P = "TransferFunction";

    /* renamed from: P0 */
    public static final String f48801P0 = "Flash";

    /* renamed from: P1 */
    public static final String f48802P1 = "GPSMapDatum";

    /* renamed from: P2 */
    public static final short f48803P2 = 2;

    /* renamed from: P3 */
    public static final short f48804P3 = 24;

    /* renamed from: P4 */
    public static final short f48805P4 = 3;

    /* renamed from: P5 */
    public static final short f48806P5 = 85;

    /* renamed from: P6 */
    public static final C19141f[] f48807P6;

    /* renamed from: P7 */
    public static final int f48808P7 = 9;

    /* renamed from: Q */
    public static final String f48809Q = "WhitePoint";

    /* renamed from: Q0 */
    public static final String f48810Q0 = "SubjectArea";

    /* renamed from: Q1 */
    public static final String f48811Q1 = "GPSDestLatitudeRef";

    /* renamed from: Q2 */
    public static final short f48812Q2 = 1;

    /* renamed from: Q3 */
    public static final short f48813Q3 = 255;

    /* renamed from: Q4 */
    public static final String f48814Q4 = "N";

    /* renamed from: Q5 */
    public static final String f48815Q5 = "PENTAX";

    /* renamed from: Q6 */
    public static final C19141f[] f48816Q6;

    /* renamed from: Q7 */
    public static final int f48817Q7 = 10;

    /* renamed from: R */
    public static final String f48818R = "PrimaryChromaticities";

    /* renamed from: R0 */
    public static final String f48819R0 = "FocalLength";

    /* renamed from: R1 */
    public static final String f48820R1 = "GPSDestLatitude";

    /* renamed from: R2 */
    public static final short f48821R2 = 2;

    /* renamed from: R3 */
    public static final short f48822R3 = 1;

    /* renamed from: R4 */
    public static final String f48823R4 = "S";

    /* renamed from: R5 */
    public static final int f48824R5 = 6;

    /* renamed from: R6 */
    public static final C19141f[] f48825R6;

    /* renamed from: R7 */
    public static final int f48826R7 = 11;

    /* renamed from: S */
    public static final String f48827S = "YCbCrCoefficients";

    /* renamed from: S0 */
    public static final String f48828S0 = "FlashEnergy";

    /* renamed from: S1 */
    public static final String f48829S1 = "GPSDestLongitudeRef";

    /* renamed from: S2 */
    public static final short f48830S2 = 2;

    /* renamed from: S3 */
    public static final short f48831S3 = 4;

    /* renamed from: S4 */
    public static final String f48832S4 = "E";

    /* renamed from: S5 */
    public static final byte[] f48833S5 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: S6 */
    public static final int f48834S6 = 0;

    /* renamed from: S7 */
    public static final int f48835S7 = 12;

    /* renamed from: T */
    public static final String f48836T = "ReferenceBlackWhite";

    /* renamed from: T0 */
    public static final String f48837T0 = "SpatialFrequencyResponse";

    /* renamed from: T1 */
    public static final String f48838T1 = "GPSDestLongitude";

    /* renamed from: T2 */
    public static final short f48839T2 = 3;

    /* renamed from: T3 */
    public static final short f48840T3 = 6;

    /* renamed from: T4 */
    public static final String f48841T4 = "W";

    /* renamed from: T5 */
    public static final byte[] f48842T5 = {101, 88, 73, 102};

    /* renamed from: T6 */
    public static final int f48843T6 = 1;

    /* renamed from: T7 */
    public static final int f48844T7 = 13;

    /* renamed from: U */
    public static final String f48845U = "DateTime";

    /* renamed from: U0 */
    public static final String f48846U0 = "FocalPlaneXResolution";

    /* renamed from: U1 */
    public static final String f48847U1 = "GPSDestBearingRef";

    /* renamed from: U2 */
    public static final int f48848U2 = 1;

    /* renamed from: U3 */
    public static final short f48849U3 = 8;

    /* renamed from: U4 */
    public static final short f48850U4 = 0;

    /* renamed from: U5 */
    public static final byte[] f48851U5 = {73, 72, 68, 82};

    /* renamed from: U6 */
    public static final int f48852U6 = 2;

    /* renamed from: U7 */
    public static final int f48853U7 = 14;

    /* renamed from: V */
    public static final String f48854V = "ImageDescription";

    /* renamed from: V0 */
    public static final String f48855V0 = "FocalPlaneYResolution";

    /* renamed from: V1 */
    public static final String f48856V1 = "GPSDestBearing";

    /* renamed from: V2 */
    public static final int f48857V2 = 65535;

    /* renamed from: V3 */
    public static final short f48858V3 = 16;

    /* renamed from: V4 */
    public static final short f48859V4 = 1;

    /* renamed from: V5 */
    public static final byte[] f48860V5 = {73, 69, 78, 68};

    /* renamed from: V6 */
    public static final int f48861V6 = 3;

    /* renamed from: V7 */
    public static final Pattern f48862V7 = Pattern.compile(".*[1-9].*");

    /* renamed from: W */
    public static final String f48863W = "Make";

    /* renamed from: W0 */
    public static final String f48864W0 = "FocalPlaneResolutionUnit";

    /* renamed from: W1 */
    public static final String f48865W1 = "GPSDestDistanceRef";

    /* renamed from: W2 */
    public static final short f48866W2 = 0;

    /* renamed from: W3 */
    public static final short f48867W3 = 24;

    /* renamed from: W4 */
    public static final String f48868W4 = "A";

    /* renamed from: W5 */
    public static final int f48869W5 = 4;

    /* renamed from: W6 */
    public static final int f48870W6 = 4;

    /* renamed from: W7 */
    public static final Pattern f48871W7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: X */
    public static final String f48872X = "Model";

    /* renamed from: X0 */
    public static final String f48873X0 = "SubjectLocation";

    /* renamed from: X1 */
    public static final String f48874X1 = "GPSDestDistance";

    /* renamed from: X2 */
    public static final short f48875X2 = 1;

    /* renamed from: X3 */
    public static final short f48876X3 = 32;

    /* renamed from: X4 */
    public static final String f48877X4 = "V";

    /* renamed from: X5 */
    public static final int f48878X5 = 4;

    /* renamed from: X6 */
    public static final int f48879X6 = 5;

    /* renamed from: X7 */
    public static final Pattern f48880X7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: Y */
    public static final String f48881Y = "Software";

    /* renamed from: Y0 */
    public static final String f48882Y0 = "ExposureIndex";

    /* renamed from: Y1 */
    public static final String f48883Y1 = "GPSProcessingMethod";

    /* renamed from: Y2 */
    public static final short f48884Y2 = 2;

    /* renamed from: Y3 */
    public static final short f48885Y3 = 64;

    /* renamed from: Y4 */
    public static final String f48886Y4 = "2";

    /* renamed from: Y5 */
    public static final byte[] f48887Y5 = {82, 73, 70, 70};

    /* renamed from: Y6 */
    public static final int f48888Y6 = 6;

    /* renamed from: Y7 */
    public static final Pattern f48889Y7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: Z */
    public static final String f48890Z = "Artist";

    /* renamed from: Z0 */
    public static final String f48891Z0 = "SensingMethod";

    /* renamed from: Z1 */
    public static final String f48892Z1 = "GPSAreaInformation";

    /* renamed from: Z2 */
    public static final short f48893Z2 = 3;

    /* renamed from: Z3 */
    public static final short f48894Z3 = 1;

    /* renamed from: Z4 */
    public static final String f48895Z4 = "3";

    /* renamed from: Z5 */
    public static final byte[] f48896Z5 = {87, 69, 66, 80};

    /* renamed from: Z6 */
    public static final int f48897Z6 = 7;

    /* renamed from: Z7 */
    public static final int f48898Z7 = 19;

    /* renamed from: a0 */
    public static final String f48899a0 = "Copyright";

    /* renamed from: a1 */
    public static final String f48900a1 = "FileSource";

    /* renamed from: a2 */
    public static final String f48901a2 = "GPSDateStamp";

    /* renamed from: a3 */
    public static final short f48902a3 = 4;

    /* renamed from: a4 */
    public static final short f48903a4 = 2;

    /* renamed from: a5 */
    public static final String f48904a5 = "K";

    /* renamed from: a6 */
    public static final int f48905a6 = 4;

    /* renamed from: a7 */
    public static final int f48906a7 = 8;

    /* renamed from: b0 */
    public static final String f48907b0 = "ExifVersion";

    /* renamed from: b1 */
    public static final String f48908b1 = "SceneType";

    /* renamed from: b2 */
    public static final String f48909b2 = "GPSDifferential";

    /* renamed from: b3 */
    public static final short f48910b3 = 5;

    /* renamed from: b4 */
    public static final short f48911b4 = 3;

    /* renamed from: b5 */
    public static final String f48912b5 = "M";

    /* renamed from: b6 */
    public static final byte[] f48913b6 = {69, 88, 73, 70};

    /* renamed from: b7 */
    public static final int f48914b7 = 9;

    /* renamed from: c0 */
    public static final String f48915c0 = "FlashpixVersion";

    /* renamed from: c1 */
    public static final String f48916c1 = "CFAPattern";

    /* renamed from: c2 */
    public static final String f48917c2 = "GPSHPositioningError";

    /* renamed from: c3 */
    public static final short f48918c3 = 6;

    /* renamed from: c4 */
    public static final short f48919c4 = 4;

    /* renamed from: c5 */
    public static final String f48920c5 = "N";

    /* renamed from: c6 */
    public static final byte[] f48921c6 = {-99, 1, 42};

    /* renamed from: c7 */
    public static final C19141f[][] f48922c7;

    /* renamed from: d0 */
    public static final String f48923d0 = "ColorSpace";

    /* renamed from: d1 */
    public static final String f48924d1 = "CustomRendered";

    /* renamed from: d2 */
    public static final String f48925d2 = "InteroperabilityIndex";

    /* renamed from: d3 */
    public static final short f48926d3 = 7;

    /* renamed from: d4 */
    public static final short f48927d4 = 5;

    /* renamed from: d5 */
    public static final String f48928d5 = "T";

    /* renamed from: d6 */
    public static final byte f48929d6 = 47;

    /* renamed from: d7 */
    public static final C19141f[] f48930d7 = {new C19141f("SubIFDPointer", 330, 4), new C19141f("ExifIFDPointer", 34665, 4), new C19141f("GPSInfoIFDPointer", 34853, 4), new C19141f("InteroperabilityIFDPointer", 40965, 4), new C19141f(f48668A2, 8224, 1), new C19141f(f48677B2, 8256, 1)};

    /* renamed from: e0 */
    public static final String f48931e0 = "Gamma";

    /* renamed from: e1 */
    public static final String f48932e1 = "ExposureMode";

    /* renamed from: e2 */
    public static final String f48933e2 = "ThumbnailImageLength";

    /* renamed from: e3 */
    public static final short f48934e3 = 8;

    /* renamed from: e4 */
    public static final short f48935e4 = 7;

    /* renamed from: e5 */
    public static final String f48936e5 = "M";

    /* renamed from: e6 */
    public static final byte[] f48937e6 = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: e7 */
    public static final C19141f f48938e7 = new C19141f(f48782N, C18317n0.f46975j, 4);

    /* renamed from: f0 */
    public static final String f48939f0 = "PixelXDimension";

    /* renamed from: f1 */
    public static final String f48940f1 = "WhiteBalance";

    /* renamed from: f2 */
    public static final String f48941f2 = "ThumbnailImageWidth";

    /* renamed from: f3 */
    public static final short f48942f3 = 0;

    /* renamed from: f4 */
    public static final short f48943f4 = 8;

    /* renamed from: f5 */
    public static final String f48944f5 = "K";

    /* renamed from: f6 */
    public static final byte[] f48945f6 = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: f7 */
    public static final C19141f f48946f7 = new C19141f(f48791O, 514, 4);

    /* renamed from: g0 */
    public static final String f48947g0 = "PixelYDimension";

    /* renamed from: g1 */
    public static final String f48948g1 = "DigitalZoomRatio";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: g2 */
    public static final String f48949g2 = "ThumbnailOrientation";

    /* renamed from: g3 */
    public static final short f48950g3 = 1;

    /* renamed from: g4 */
    public static final short f48951g4 = 0;

    /* renamed from: g5 */
    public static final String f48952g5 = "M";

    /* renamed from: g6 */
    public static final byte[] f48953g6 = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: g7 */
    public static final HashMap<Integer, C19141f>[] f48954g7;

    /* renamed from: h0 */
    public static final String f48955h0 = "ComponentsConfiguration";

    /* renamed from: h1 */
    public static final String f48956h1 = "FocalLengthIn35mmFilm";

    /* renamed from: h2 */
    public static final String f48957h2 = "DNGVersion";

    /* renamed from: h3 */
    public static final short f48958h3 = 2;

    /* renamed from: h4 */
    public static final short f48959h4 = 1;

    /* renamed from: h5 */
    public static final String f48960h5 = "N";

    /* renamed from: h6 */
    public static final byte[] f48961h6 = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: h7 */
    public static final HashMap<String, C19141f>[] f48962h7;

    /* renamed from: i0 */
    public static final String f48963i0 = "CompressedBitsPerPixel";

    /* renamed from: i1 */
    public static final String f48964i1 = "SceneCaptureType";

    /* renamed from: i2 */
    public static final String f48965i2 = "DefaultCropSize";

    /* renamed from: i3 */
    public static final short f48966i3 = 3;

    /* renamed from: i4 */
    public static final short f48967i4 = 2;

    /* renamed from: i5 */
    public static final short f48968i5 = 0;

    /* renamed from: i6 */
    public static final byte[] f48969i6 = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: i7 */
    public static final HashSet<String> f48970i7 = new HashSet<>(Arrays.asList(new String[]{f49068v0, f48948g1, f49059u0, f48774M0, f48703E1}));

    /* renamed from: j0 */
    public static final String f48971j0 = "MakerNote";

    /* renamed from: j1 */
    public static final String f48972j1 = "GainControl";

    /* renamed from: j2 */
    public static final String f48973j2 = "ThumbnailImage";

    /* renamed from: j3 */
    public static final short f48974j3 = 4;

    /* renamed from: j4 */
    public static final short f48975j4 = 3;

    /* renamed from: j5 */
    public static final short f48976j5 = 1;

    /* renamed from: j6 */
    public static final int f48977j6 = 10;

    /* renamed from: j7 */
    public static final HashMap<Integer, Integer> f48978j7 = new HashMap<>();

    /* renamed from: k0 */
    public static final String f48979k0 = "UserComment";

    /* renamed from: k1 */
    public static final String f48980k1 = "Contrast";

    /* renamed from: k2 */
    public static final String f48981k2 = "PreviewImageStart";

    /* renamed from: k3 */
    public static final short f48982k3 = 5;

    /* renamed from: k4 */
    public static final short f48983k4 = 1;

    /* renamed from: k5 */
    public static final int f48984k5 = 1;

    /* renamed from: k6 */
    public static final int f48985k6 = 4;

    /* renamed from: k7 */
    public static final Charset f48986k7;

    /* renamed from: l0 */
    public static final String f48987l0 = "RelatedSoundFile";

    /* renamed from: l1 */
    public static final String f48988l1 = "Saturation";

    /* renamed from: l2 */
    public static final String f48989l2 = "PreviewImageLength";

    /* renamed from: l3 */
    public static final short f48990l3 = 6;

    /* renamed from: l4 */
    public static final short f48991l4 = 0;

    /* renamed from: l5 */
    public static final int f48992l5 = 2;

    /* renamed from: l6 */
    public static final int f48993l6 = 4;

    /* renamed from: l7 */
    public static final byte[] f48994l7;

    /* renamed from: m0 */
    public static final String f48995m0 = "DateTimeOriginal";

    /* renamed from: m1 */
    public static final String f48996m1 = "Sharpness";

    /* renamed from: m2 */
    public static final String f48997m2 = "AspectFrame";

    /* renamed from: m3 */
    public static final short f48998m3 = 7;

    /* renamed from: m4 */
    public static final short f48999m4 = 1;

    /* renamed from: m5 */
    public static final int f49000m5 = 6;

    /* renamed from: m6 */
    public static SimpleDateFormat f49001m6 = null;

    /* renamed from: m7 */
    public static final byte[] f49002m7;

    /* renamed from: n0 */
    public static final String f49003n0 = "DateTimeDigitized";

    /* renamed from: n1 */
    public static final String f49004n1 = "DeviceSettingDescription";

    /* renamed from: n2 */
    public static final String f49005n2 = "SensorBottomBorder";

    /* renamed from: n3 */
    public static final short f49006n3 = 0;

    /* renamed from: n4 */
    public static final short f49007n4 = 0;

    /* renamed from: n5 */
    public static final int f49008n5 = 7;

    /* renamed from: n6 */
    public static SimpleDateFormat f49009n6 = null;

    /* renamed from: n7 */
    public static final byte f49010n7 = -1;

    /* renamed from: o0 */
    public static final String f49011o0 = "OffsetTime";

    /* renamed from: o1 */
    public static final String f49012o1 = "SubjectDistanceRange";

    /* renamed from: o2 */
    public static final String f49013o2 = "SensorLeftBorder";

    /* renamed from: o3 */
    public static final short f49014o3 = 1;

    /* renamed from: o4 */
    public static final short f49015o4 = 1;

    /* renamed from: o5 */
    public static final int f49016o5 = 8;

    /* renamed from: o6 */
    public static final short f49017o6 = 18761;

    /* renamed from: o7 */
    public static final byte f49018o7 = -40;

    /* renamed from: p0 */
    public static final String f49019p0 = "OffsetTimeOriginal";

    /* renamed from: p1 */
    public static final String f49020p1 = "ImageUniqueID";

    /* renamed from: p2 */
    public static final String f49021p2 = "SensorRightBorder";

    /* renamed from: p3 */
    public static final short f49022p3 = 2;

    /* renamed from: p4 */
    public static final short f49023p4 = 2;

    /* renamed from: p5 */
    public static final int f49024p5 = 32773;

    /* renamed from: p6 */
    public static final short f49025p6 = 19789;

    /* renamed from: p7 */
    public static final byte f49026p7 = -64;

    /* renamed from: q0 */
    public static final String f49027q0 = "OffsetTimeDigitized";
    @Deprecated

    /* renamed from: q1 */
    public static final String f49028q1 = "CameraOwnerName";

    /* renamed from: q2 */
    public static final String f49029q2 = "SensorTopBorder";

    /* renamed from: q3 */
    public static final short f49030q3 = 3;
    @Deprecated

    /* renamed from: q4 */
    public static final int f49031q4 = 0;

    /* renamed from: q5 */
    public static final int f49032q5 = 34892;

    /* renamed from: q6 */
    public static final byte f49033q6 = 42;

    /* renamed from: q7 */
    public static final byte f49034q7 = -63;

    /* renamed from: r0 */
    public static final String f49035r0 = "SubSecTime";

    /* renamed from: r1 */
    public static final String f49036r1 = "CameraOwnerName";

    /* renamed from: r2 */
    public static final String f49037r2 = "ISO";

    /* renamed from: r3 */
    public static final short f49038r3 = 4;
    @Deprecated

    /* renamed from: r4 */
    public static final int f49039r4 = 1;

    /* renamed from: r5 */
    public static final int[] f49040r5 = {8, 8, 8};

    /* renamed from: r6 */
    public static final int f49041r6 = 8;

    /* renamed from: r7 */
    public static final byte f49042r7 = -62;

    /* renamed from: s0 */
    public static final String f49043s0 = "SubSecTimeOriginal";

    /* renamed from: s1 */
    public static final String f49044s1 = "BodySerialNumber";

    /* renamed from: s2 */
    public static final String f49045s2 = "JpgFromRaw";

    /* renamed from: s3 */
    public static final short f49046s3 = 5;

    /* renamed from: s4 */
    public static final short f49047s4 = 0;

    /* renamed from: s5 */
    public static final int[] f49048s5 = {4};

    /* renamed from: s6 */
    public static final int f49049s6 = 1;

    /* renamed from: s7 */
    public static final byte f49050s7 = -61;

    /* renamed from: t0 */
    public static final String f49051t0 = "SubSecTimeDigitized";

    /* renamed from: t1 */
    public static final String f49052t1 = "LensSpecification";

    /* renamed from: t2 */
    public static final String f49053t2 = "Xmp";

    /* renamed from: t3 */
    public static final short f49054t3 = 6;

    /* renamed from: t4 */
    public static final short f49055t4 = 1;

    /* renamed from: t5 */
    public static final int[] f49056t5 = {8};

    /* renamed from: t6 */
    public static final int f49057t6 = 2;

    /* renamed from: t7 */
    public static final byte f49058t7 = -59;

    /* renamed from: u0 */
    public static final String f49059u0 = "ExposureTime";

    /* renamed from: u1 */
    public static final String f49060u1 = "LensMake";

    /* renamed from: u2 */
    public static final String f49061u2 = "NewSubfileType";

    /* renamed from: u3 */
    public static final short f49062u3 = 255;

    /* renamed from: u4 */
    public static final short f49063u4 = 0;

    /* renamed from: u5 */
    public static final int f49064u5 = 0;

    /* renamed from: u6 */
    public static final int f49065u6 = 3;

    /* renamed from: u7 */
    public static final byte f49066u7 = -58;

    /* renamed from: v */
    public static final String f49067v = "ExifInterface";

    /* renamed from: v0 */
    public static final String f49068v0 = "FNumber";

    /* renamed from: v1 */
    public static final String f49069v1 = "LensModel";

    /* renamed from: v2 */
    public static final String f49070v2 = "SubfileType";

    /* renamed from: v3 */
    public static final short f49071v3 = 0;

    /* renamed from: v4 */
    public static final short f49072v4 = 1;

    /* renamed from: v5 */
    public static final int f49073v5 = 1;

    /* renamed from: v6 */
    public static final int f49074v6 = 4;

    /* renamed from: v7 */
    public static final byte f49075v7 = -57;

    /* renamed from: w */
    public static final boolean f49076w = Log.isLoggable(f49067v, 3);

    /* renamed from: w0 */
    public static final String f49077w0 = "ExposureProgram";

    /* renamed from: w1 */
    public static final String f49078w1 = "LensSerialNumber";

    /* renamed from: w2 */
    public static final String f49079w2 = "ExifIFDPointer";

    /* renamed from: w3 */
    public static final short f49080w3 = 1;

    /* renamed from: w4 */
    public static final short f49081w4 = 2;

    /* renamed from: w5 */
    public static final int f49082w5 = 2;

    /* renamed from: w6 */
    public static final int f49083w6 = 5;

    /* renamed from: w7 */
    public static final byte f49084w7 = -55;

    /* renamed from: x */
    public static final String f49085x = "ImageWidth";

    /* renamed from: x0 */
    public static final String f49086x0 = "SpectralSensitivity";

    /* renamed from: x1 */
    public static final String f49087x1 = "GPSVersionID";

    /* renamed from: x2 */
    public static final String f49088x2 = "GPSInfoIFDPointer";

    /* renamed from: x3 */
    public static final short f49089x3 = 2;

    /* renamed from: x4 */
    public static final short f49090x4 = 3;

    /* renamed from: x5 */
    public static final int f49091x5 = 6;

    /* renamed from: x6 */
    public static final int f49092x6 = 6;

    /* renamed from: x7 */
    public static final byte f49093x7 = -54;

    /* renamed from: y */
    public static final String f49094y = "ImageLength";
    @Deprecated

    /* renamed from: y0 */
    public static final String f49095y0 = "ISOSpeedRatings";

    /* renamed from: y1 */
    public static final String f49096y1 = "GPSLatitudeRef";

    /* renamed from: y2 */
    public static final String f49097y2 = "InteroperabilityIFDPointer";

    /* renamed from: y3 */
    public static final short f49098y3 = 3;

    /* renamed from: y4 */
    public static final short f49099y4 = 0;

    /* renamed from: y5 */
    public static final int f49100y5 = 0;

    /* renamed from: y6 */
    public static final int f49101y6 = 7;

    /* renamed from: y7 */
    public static final byte f49102y7 = -53;

    /* renamed from: z */
    public static final String f49103z = "BitsPerSample";

    /* renamed from: z0 */
    public static final String f49104z0 = "PhotographicSensitivity";

    /* renamed from: z1 */
    public static final String f49105z1 = "GPSLatitude";

    /* renamed from: z2 */
    public static final String f49106z2 = "SubIFDPointer";

    /* renamed from: z3 */
    public static final short f49107z3 = 4;

    /* renamed from: z4 */
    public static final short f49108z4 = 1;

    /* renamed from: z5 */
    public static final int f49109z5 = 1;

    /* renamed from: z6 */
    public static final int f49110z6 = 8;

    /* renamed from: z7 */
    public static final byte f49111z7 = -51;

    /* renamed from: a */
    public String f49112a;

    /* renamed from: b */
    public FileDescriptor f49113b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f49114c;

    /* renamed from: d */
    public int f49115d;

    /* renamed from: e */
    public boolean f49116e;

    /* renamed from: f */
    public final HashMap<String, C19139d>[] f49117f;

    /* renamed from: g */
    public Set<Integer> f49118g;

    /* renamed from: h */
    public ByteOrder f49119h;

    /* renamed from: i */
    public boolean f49120i;

    /* renamed from: j */
    public boolean f49121j;

    /* renamed from: k */
    public boolean f49122k;

    /* renamed from: l */
    public int f49123l;

    /* renamed from: m */
    public int f49124m;

    /* renamed from: n */
    public byte[] f49125n;

    /* renamed from: o */
    public int f49126o;

    /* renamed from: p */
    public int f49127p;

    /* renamed from: q */
    public int f49128q;

    /* renamed from: r */
    public int f49129r;

    /* renamed from: s */
    public int f49130s;

    /* renamed from: t */
    public boolean f49131t;

    /* renamed from: u */
    public boolean f49132u;

    /* renamed from: androidx.exifinterface.media.a$a */
    public class C19136a extends MediaDataSource {

        /* renamed from: a */
        public long f49133a;

        /* renamed from: b */
        public final /* synthetic */ C19137b f49134b;

        public C19136a(C19137b bVar) {
            this.f49134b = bVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f49133a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f49134b.available())) {
                        return -1;
                    }
                    this.f49134b.mo56532d(j);
                    this.f49133a = j;
                }
                if (i2 > this.f49134b.available()) {
                    i2 = this.f49134b.available();
                }
                int read = this.f49134b.read(bArr, i, i2);
                if (read >= 0) {
                    this.f49133a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f49133a = -1;
            return -1;
        }
    }

    /* renamed from: androidx.exifinterface.media.a$b */
    public static class C19137b extends InputStream implements DataInput {

        /* renamed from: e */
        public static final ByteOrder f49136e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        public static final ByteOrder f49137f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        public DataInputStream f49138a;

        /* renamed from: b */
        public ByteOrder f49139b;

        /* renamed from: c */
        public final int f49140c;

        /* renamed from: d */
        public int f49141d;

        public C19137b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo56528a() {
            return this.f49140c;
        }

        public int available() throws IOException {
            return this.f49138a.available();
        }

        /* renamed from: b */
        public int mo56530b() {
            return this.f49141d;
        }

        /* renamed from: c */
        public long mo56531c() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: d */
        public void mo56532d(long j) throws IOException {
            int i = this.f49141d;
            if (((long) i) > j) {
                this.f49141d = 0;
                this.f49138a.reset();
                this.f49138a.mark(this.f49140c);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: f */
        public void mo56533f(ByteOrder byteOrder) {
            this.f49139b = byteOrder;
        }

        public synchronized void mark(int i) {
            this.f49138a.mark(i);
        }

        public int read() throws IOException {
            this.f49141d++;
            return this.f49138a.read();
        }

        public boolean readBoolean() throws IOException {
            this.f49141d++;
            return this.f49138a.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f49141d + 1;
            this.f49141d = i;
            if (i <= this.f49140c) {
                int read = this.f49138a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f49141d += 2;
            return this.f49138a.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f49141d + i2;
            this.f49141d = i3;
            if (i3 > this.f49140c) {
                throw new EOFException();
            } else if (this.f49138a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f49141d + 4;
            this.f49141d = i;
            if (i <= this.f49140c) {
                int read = this.f49138a.read();
                int read2 = this.f49138a.read();
                int read3 = this.f49138a.read();
                int read4 = this.f49138a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f49139b;
                    if (byteOrder == f49136e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f49137f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f49139b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f49141d + 8;
            this.f49141d = i;
            if (i <= this.f49140c) {
                int read = this.f49138a.read();
                int read2 = this.f49138a.read();
                int read3 = this.f49138a.read();
                int read4 = this.f49138a.read();
                int read5 = this.f49138a.read();
                int read6 = this.f49138a.read();
                int read7 = this.f49138a.read();
                int read8 = this.f49138a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f49139b;
                    if (byteOrder == f49136e) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f49137f) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f49139b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f49141d + 2;
            this.f49141d = i;
            if (i <= this.f49140c) {
                int read = this.f49138a.read();
                int read2 = this.f49138a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f49139b;
                    if (byteOrder == f49136e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f49137f) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f49139b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f49141d += 2;
            return this.f49138a.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f49141d++;
            return this.f49138a.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f49141d + 2;
            this.f49141d = i;
            if (i <= this.f49140c) {
                int read = this.f49138a.read();
                int read2 = this.f49138a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f49139b;
                    if (byteOrder == f49136e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f49137f) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f49139b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f49140c - this.f49141d);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f49138a.skipBytes(min - i2);
            }
            this.f49141d += i2;
            return i2;
        }

        public C19137b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f49139b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f49138a = dataInputStream;
            int available = dataInputStream.available();
            this.f49140c = available;
            this.f49141d = 0;
            this.f49138a.mark(available);
            this.f49139b = byteOrder;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f49138a.read(bArr, i, i2);
            this.f49141d += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f49141d + bArr.length;
            this.f49141d = length;
            if (length > this.f49140c) {
                throw new EOFException();
            } else if (this.f49138a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C19137b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: androidx.exifinterface.media.a$c */
    public static class C19138c extends FilterOutputStream {

        /* renamed from: a */
        public final OutputStream f49142a;

        /* renamed from: b */
        public ByteOrder f49143b;

        public C19138c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f49142a = outputStream;
            this.f49143b = byteOrder;
        }

        /* renamed from: a */
        public void mo56552a(ByteOrder byteOrder) {
            this.f49143b = byteOrder;
        }

        /* renamed from: b */
        public void mo56553b(int i) throws IOException {
            this.f49142a.write(i);
        }

        /* renamed from: c */
        public void mo56554c(int i) throws IOException {
            ByteOrder byteOrder = this.f49143b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f49142a.write((i >>> 0) & 255);
                this.f49142a.write((i >>> 8) & 255);
                this.f49142a.write((i >>> 16) & 255);
                this.f49142a.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f49142a.write((i >>> 24) & 255);
                this.f49142a.write((i >>> 16) & 255);
                this.f49142a.write((i >>> 8) & 255);
                this.f49142a.write((i >>> 0) & 255);
            }
        }

        /* renamed from: d */
        public void mo56555d(short s) throws IOException {
            ByteOrder byteOrder = this.f49143b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f49142a.write((s >>> 0) & 255);
                this.f49142a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f49142a.write((s >>> 8) & 255);
                this.f49142a.write((s >>> 0) & 255);
            }
        }

        /* renamed from: f */
        public void mo56556f(long j) throws IOException {
            mo56554c((int) j);
        }

        /* renamed from: g */
        public void mo56557g(int i) throws IOException {
            mo56555d((short) i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f49142a.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f49142a.write(bArr, i, i2);
        }
    }

    /* renamed from: androidx.exifinterface.media.a$d */
    public static class C19139d {

        /* renamed from: e */
        public static final long f49144e = -1;

        /* renamed from: a */
        public final int f49145a;

        /* renamed from: b */
        public final int f49146b;

        /* renamed from: c */
        public final long f49147c;

        /* renamed from: d */
        public final byte[] f49148d;

        public C19139d(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C19139d m89639a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(C19135a.f48986k7);
                return new C19139d(1, bytes.length, bytes);
            }
            return new C19139d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        /* renamed from: b */
        public static C19139d m89640b(double d, ByteOrder byteOrder) {
            return m89641c(new double[]{d}, byteOrder);
        }

        /* renamed from: c */
        public static C19139d m89641c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C19135a.f48726G6[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new C19139d(12, dArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C19139d m89642d(int i, ByteOrder byteOrder) {
            return m89643e(new int[]{i}, byteOrder);
        }

        /* renamed from: e */
        public static C19139d m89643e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C19135a.f48726G6[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new C19139d(9, iArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C19139d m89644f(C19143h hVar, ByteOrder byteOrder) {
            return m89645g(new C19143h[]{hVar}, byteOrder);
        }

        /* renamed from: g */
        public static C19139d m89645g(C19143h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C19135a.f48726G6[10] * hVarArr.length)]);
            wrap.order(byteOrder);
            for (C19143h hVar : hVarArr) {
                wrap.putInt((int) hVar.f49153a);
                wrap.putInt((int) hVar.f49154b);
            }
            return new C19139d(10, hVarArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C19139d m89646h(String str) {
            byte[] bytes = (str + 0).getBytes(C19135a.f48986k7);
            return new C19139d(2, bytes.length, bytes);
        }

        /* renamed from: i */
        public static C19139d m89647i(long j, ByteOrder byteOrder) {
            return m89648j(new long[]{j}, byteOrder);
        }

        /* renamed from: j */
        public static C19139d m89648j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C19135a.f48726G6[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C19139d(4, jArr.length, wrap.array());
        }

        /* renamed from: k */
        public static C19139d m89649k(C19143h hVar, ByteOrder byteOrder) {
            return m89650l(new C19143h[]{hVar}, byteOrder);
        }

        /* renamed from: l */
        public static C19139d m89650l(C19143h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C19135a.f48726G6[5] * hVarArr.length)]);
            wrap.order(byteOrder);
            for (C19143h hVar : hVarArr) {
                wrap.putInt((int) hVar.f49153a);
                wrap.putInt((int) hVar.f49154b);
            }
            return new C19139d(5, hVarArr.length, wrap.array());
        }

        /* renamed from: m */
        public static C19139d m89651m(int i, ByteOrder byteOrder) {
            return m89652n(new int[]{i}, byteOrder);
        }

        /* renamed from: n */
        public static C19139d m89652n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C19135a.f48726G6[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C19139d(3, iArr.length, wrap.array());
        }

        /* renamed from: o */
        public double mo56560o(ByteOrder byteOrder) {
            Object r = mo56563r(byteOrder);
            if (r == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (r instanceof String) {
                return Double.parseDouble((String) r);
            } else {
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof double[]) {
                    double[] dArr = (double[]) r;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof C19143h[]) {
                    C19143h[] hVarArr = (C19143h[]) r;
                    if (hVarArr.length == 1) {
                        return hVarArr[0].mo56567a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: p */
        public int mo56561p(ByteOrder byteOrder) {
            Object r = mo56563r(byteOrder);
            if (r == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (r instanceof String) {
                return Integer.parseInt((String) r);
            } else {
                if (r instanceof long[]) {
                    long[] jArr = (long[]) r;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (r instanceof int[]) {
                    int[] iArr = (int[]) r;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: q */
        public String mo56562q(ByteOrder byteOrder) {
            Object r = mo56563r(byteOrder);
            if (r == null) {
                return null;
            }
            if (r instanceof String) {
                return (String) r;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (r instanceof long[]) {
                long[] jArr = (long[]) r;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof int[]) {
                int[] iArr = (int[]) r;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (r instanceof double[]) {
                double[] dArr = (double[]) r;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(r instanceof C19143h[])) {
                return null;
            } else {
                C19143h[] hVarArr = (C19143h[]) r;
                while (i < hVarArr.length) {
                    sb.append(hVarArr[i].f49153a);
                    sb.append('/');
                    sb.append(hVarArr[i].f49154b);
                    i++;
                    if (i != hVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:139:0x0147 A[SYNTHETIC, Splitter:B:139:0x0147] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x014e A[SYNTHETIC, Splitter:B:147:0x014e] */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo56563r(java.nio.ByteOrder r9) {
            /*
                r8 = this;
                r0 = 0
                androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                byte[] r2 = r8.f49148d     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                r1.mo56533f(r9)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r9 = r8.f49145a     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r2 = 0
                r3 = 1
                switch(r9) {
                    case 1: goto L_0x0117;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a7;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0117;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x0074;
                    case 9: goto L_0x005f;
                    case 10: goto L_0x003f;
                    case 11: goto L_0x0029;
                    case 12: goto L_0x0014;
                    default: goto L_0x0012;
                }     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0012:
                goto L_0x013d
            L_0x0014:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0018:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0025
                double r3 = r1.readDouble()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0018
            L_0x0025:
                r1.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r9
            L_0x0029:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x002d:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x003b
                float r3 = r1.readFloat()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double r3 = (double) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x002d
            L_0x003b:
                r1.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                return r9
            L_0x003f:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                androidx.exifinterface.media.a$h[] r9 = new androidx.exifinterface.media.C19135a.C19143h[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0043:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x005b
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r3 = (long) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                androidx.exifinterface.media.a$h r7 = new androidx.exifinterface.media.a$h     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0043
            L_0x005b:
                r1.close()     // Catch:{ IOException -> 0x005e }
            L_0x005e:
                return r9
            L_0x005f:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0063:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0070
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0063
            L_0x0070:
                r1.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                return r9
            L_0x0074:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0078:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0085
                short r3 = r1.readShort()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0078
            L_0x0085:
                r1.close()     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                return r9
            L_0x0089:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                androidx.exifinterface.media.a$h[] r9 = new androidx.exifinterface.media.C19135a.C19143h[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x008d:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00a3
                long r3 = r1.mo56531c()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r5 = r1.mo56531c()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                androidx.exifinterface.media.a$h r7 = new androidx.exifinterface.media.a$h     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x008d
            L_0x00a3:
                r1.close()     // Catch:{ IOException -> 0x00a6 }
            L_0x00a6:
                return r9
            L_0x00a7:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long[] r9 = new long[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00ab:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00b8
                long r3 = r1.mo56531c()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x00ab
            L_0x00b8:
                r1.close()     // Catch:{ IOException -> 0x00bb }
            L_0x00bb:
                return r9
            L_0x00bc:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00c0:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00cd
                int r3 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x00c0
            L_0x00cd:
                r1.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                return r9
            L_0x00d1:
                int r9 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte[] r4 = androidx.exifinterface.media.C19135a.f48735H6     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r9 < r4) goto L_0x00ee
                r9 = r2
            L_0x00d9:
                byte[] r4 = androidx.exifinterface.media.C19135a.f48735H6     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r5 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r9 >= r5) goto L_0x00eb
                byte[] r5 = r8.f49148d     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r5 = r5[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r6 = r4[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r5 == r6) goto L_0x00e8
                r3 = r2
                goto L_0x00eb
            L_0x00e8:
                int r9 = r9 + 1
                goto L_0x00d9
            L_0x00eb:
                if (r3 == 0) goto L_0x00ee
                int r2 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00ee:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.<init>()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00f3:
                int r3 = r8.f49146b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x010f
                byte[] r3 = r8.f49148d     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r3 = r3[r2]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r3 != 0) goto L_0x00fe
                goto L_0x010f
            L_0x00fe:
                r4 = 32
                if (r3 < r4) goto L_0x0107
                char r3 = (char) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.append(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                goto L_0x010c
            L_0x0107:
                r3 = 63
                r9.append(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x010c:
                int r2 = r2 + 1
                goto L_0x00f3
            L_0x010f:
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x0116 }
            L_0x0116:
                return r9
            L_0x0117:
                byte[] r9 = r8.f49148d     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r9.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r4 != r3) goto L_0x0132
                byte r4 = r9[r2]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r4 < 0) goto L_0x0132
                if (r4 > r3) goto L_0x0132
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                char[] r3 = new char[r3]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r4 + 48
                char r4 = (char) r4     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r3[r2] = r4     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.<init>(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x0131 }
            L_0x0131:
                return r9
            L_0x0132:
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                java.nio.charset.Charset r3 = androidx.exifinterface.media.C19135a.f48986k7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r2.<init>(r9, r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x013c }
            L_0x013c:
                return r2
            L_0x013d:
                r1.close()     // Catch:{ IOException -> 0x0140 }
            L_0x0140:
                return r0
            L_0x0141:
                r9 = move-exception
                r0 = r1
                goto L_0x0145
            L_0x0144:
                r9 = move-exception
            L_0x0145:
                if (r0 == 0) goto L_0x014a
                r0.close()     // Catch:{ IOException -> 0x014a }
            L_0x014a:
                throw r9
            L_0x014b:
                r1 = r0
            L_0x014c:
                if (r1 == 0) goto L_0x0151
                r1.close()     // Catch:{ IOException -> 0x0151 }
            L_0x0151:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.C19139d.mo56563r(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: s */
        public int mo56564s() {
            return C19135a.f48726G6[this.f49145a] * this.f49146b;
        }

        public String toString() {
            return "(" + C19135a.f48717F6[this.f49145a] + ", data length:" + this.f49148d.length + ")";
        }

        public C19139d(int i, int i2, long j, byte[] bArr) {
            this.f49145a = i;
            this.f49146b = i2;
            this.f49147c = j;
            this.f49148d = bArr;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.exifinterface.media.a$e */
    public @interface C19140e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.exifinterface.media.a$g */
    public @interface C19142g {
    }

    /* renamed from: androidx.exifinterface.media.a$h */
    public static class C19143h {

        /* renamed from: a */
        public final long f49153a;

        /* renamed from: b */
        public final long f49154b;

        public C19143h(double d) {
            this((long) (d * 10000.0d), 10000);
        }

        /* renamed from: a */
        public double mo56567a() {
            return ((double) this.f49153a) / ((double) this.f49154b);
        }

        public String toString() {
            return this.f49153a + "/" + this.f49154b;
        }

        public C19143h(long j, long j2) {
            if (j2 == 0) {
                this.f49153a = 0;
                this.f49154b = 1;
                return;
            }
            this.f49153a = j;
            this.f49154b = j2;
        }
    }

    static {
        C19141f[] fVarArr = {new C19141f(f49061u2, C22073d.f56678l, 4), new C19141f(f49070v2, 255, 4), new C19141f(f49085x, 256, 3, 4), new C19141f(f49094y, 257, 3, 4), new C19141f(f49103z, 258, 3), new C19141f(f48665A, 259, 3), new C19141f(f48674B, C14092c.f34575Z, 3), new C19141f(f48854V, 270, 2), new C19141f(f48863W, 271, 2), new C19141f(f48872X, 272, 2), new C19141f(f48755K, AudioAttributesCompat.f50016O, 3, 4), new C19141f(f48683C, DefaultImageHeaderParser.f57426n, 3), new C19141f(f48692D, 277, 3), new C19141f(f48764L, 278, 3, 4), new C19141f(f48773M, 279, 3, 4), new C19141f(f48728H, 282, 5), new C19141f(f48737I, 283, 5), new C19141f(f48701E, 284, 3), new C19141f(f48746J, 296, 3), new C19141f(f48800P, 301, 3), new C19141f(f48881Y, 305, 2), new C19141f(f48845U, 306, 2), new C19141f(f48890Z, 315, 2), new C19141f(f48809Q, C16717v.C16718a.f42170s, 5), new C19141f(f48818R, 319, 5), new C19141f("SubIFDPointer", 330, 4), new C19141f(f48782N, C18317n0.f46975j, 4), new C19141f(f48791O, 514, 4), new C19141f(f48827S, 529, 5), new C19141f(f48710F, 530, 3), new C19141f(f48719G, 531, 3), new C19141f(f48836T, C14092c.f34566W, 5), new C19141f(f48899a0, 33432, 2), new C19141f("ExifIFDPointer", 34665, 4), new C19141f("GPSInfoIFDPointer", 34853, 4), new C19141f(f49029q2, 4, 4), new C19141f(f49013o2, 5, 4), new C19141f(f49005n2, 6, 4), new C19141f(f49021p2, 7, 4), new C19141f(f49037r2, 23, 3), new C19141f(f49045s2, 46, 7), new C19141f(f49053t2, 700, 1)};
        f48744I6 = fVarArr;
        C19141f[] fVarArr2 = {new C19141f(f49059u0, 33434, 5), new C19141f(f49068v0, 33437, 5), new C19141f(f49077w0, 34850, 3), new C19141f(f49086x0, 34852, 2), new C19141f(f49104z0, 34855, 3), new C19141f(f48666A0, 34856, 7), new C19141f(f48675B0, 34864, 3), new C19141f(f48684C0, 34865, 4), new C19141f(f48693D0, 34866, 4), new C19141f(f48702E0, 34867, 4), new C19141f(f48711F0, 34868, 4), new C19141f(f48720G0, 34869, 4), new C19141f(f48907b0, 36864, 2), new C19141f(f48995m0, 36867, 2), new C19141f(f49003n0, 36868, 2), new C19141f(f49011o0, 36880, 2), new C19141f(f49019p0, 36881, 2), new C19141f(f49027q0, 36882, 2), new C19141f(f48955h0, 37121, 7), new C19141f(f48963i0, 37122, 5), new C19141f(f48729H0, 37377, 10), new C19141f(f48738I0, 37378, 5), new C19141f(f48747J0, 37379, 10), new C19141f(f48756K0, 37380, 10), new C19141f(f48765L0, 37381, 5), new C19141f(f48774M0, 37382, 5), new C19141f(f48783N0, 37383, 3), new C19141f(f48792O0, 37384, 3), new C19141f(f48801P0, 37385, 3), new C19141f(f48819R0, 37386, 5), new C19141f(f48810Q0, 37396, 3), new C19141f(f48971j0, 37500, 7), new C19141f(f48979k0, 37510, 7), new C19141f(f49035r0, 37520, 2), new C19141f(f49043s0, 37521, 2), new C19141f(f49051t0, 37522, 2), new C19141f(f48915c0, 40960, 7), new C19141f(f48923d0, 40961, 3), new C19141f(f48939f0, 40962, 3, 4), new C19141f(f48947g0, 40963, 3, 4), new C19141f(f48987l0, 40964, 2), new C19141f("InteroperabilityIFDPointer", 40965, 4), new C19141f(f48828S0, 41483, 5), new C19141f(f48837T0, 41484, 7), new C19141f(f48846U0, 41486, 5), new C19141f(f48855V0, 41487, 5), new C19141f(f48864W0, 41488, 3), new C19141f(f48873X0, 41492, 3), new C19141f(f48882Y0, 41493, 5), new C19141f(f48891Z0, 41495, 3), new C19141f(f48900a1, 41728, 7), new C19141f(f48908b1, 41729, 7), new C19141f(f48916c1, 41730, 7), new C19141f(f48924d1, 41985, 3), new C19141f(f48932e1, 41986, 3), new C19141f(f48940f1, 41987, 3), new C19141f(f48948g1, 41988, 5), new C19141f(f48956h1, 41989, 3), new C19141f(f48964i1, 41990, 3), new C19141f(f48972j1, 41991, 3), new C19141f(f48980k1, 41992, 3), new C19141f(f48988l1, 41993, 3), new C19141f(f48996m1, 41994, 3), new C19141f(f49004n1, 41995, 7), new C19141f(f49012o1, 41996, 3), new C19141f(f49020p1, 42016, 2), new C19141f("CameraOwnerName", 42032, 2), new C19141f(f49044s1, 42033, 2), new C19141f(f49052t1, 42034, 5), new C19141f(f49060u1, 42035, 2), new C19141f(f49069v1, 42036, 2), new C19141f(f48931e0, 42240, 5), new C19141f(f48957h2, 50706, 1), new C19141f(f48965i2, 50720, 3, 4)};
        f48753J6 = fVarArr2;
        C19141f[] fVarArr3 = {new C19141f(f49087x1, 0, 1), new C19141f(f49096y1, 1, 2), new C19141f(f49105z1, 2, 5, 10), new C19141f(f48667A1, 3, 2), new C19141f(f48676B1, 4, 5, 10), new C19141f(f48685C1, 5, 1), new C19141f(f48694D1, 6, 5), new C19141f(f48703E1, 7, 5), new C19141f(f48712F1, 8, 2), new C19141f(f48721G1, 9, 2), new C19141f(f48730H1, 10, 2), new C19141f(f48739I1, 11, 5), new C19141f(f48748J1, 12, 2), new C19141f(f48757K1, 13, 5), new C19141f(f48766L1, 14, 2), new C19141f(f48775M1, 15, 5), new C19141f(f48784N1, 16, 2), new C19141f(f48793O1, 17, 5), new C19141f(f48802P1, 18, 2), new C19141f(f48811Q1, 19, 2), new C19141f(f48820R1, 20, 5), new C19141f(f48829S1, 21, 2), new C19141f(f48838T1, 22, 5), new C19141f(f48847U1, 23, 2), new C19141f(f48856V1, 24, 5), new C19141f(f48865W1, 25, 2), new C19141f(f48874X1, 26, 5), new C19141f(f48883Y1, 27, 7), new C19141f(f48892Z1, 28, 7), new C19141f(f48901a2, 29, 2), new C19141f(f48909b2, 30, 3), new C19141f(f48917c2, 31, 5)};
        f48762K6 = fVarArr3;
        C19141f[] fVarArr4 = {new C19141f(f48925d2, 1, 2)};
        f48771L6 = fVarArr4;
        C19141f[] fVarArr5 = {new C19141f(f49061u2, C22073d.f56678l, 4), new C19141f(f49070v2, 255, 4), new C19141f(f48941f2, 256, 3, 4), new C19141f(f48933e2, 257, 3, 4), new C19141f(f49103z, 258, 3), new C19141f(f48665A, 259, 3), new C19141f(f48674B, C14092c.f34575Z, 3), new C19141f(f48854V, 270, 2), new C19141f(f48863W, 271, 2), new C19141f(f48872X, 272, 2), new C19141f(f48755K, AudioAttributesCompat.f50016O, 3, 4), new C19141f(f48949g2, DefaultImageHeaderParser.f57426n, 3), new C19141f(f48692D, 277, 3), new C19141f(f48764L, 278, 3, 4), new C19141f(f48773M, 279, 3, 4), new C19141f(f48728H, 282, 5), new C19141f(f48737I, 283, 5), new C19141f(f48701E, 284, 3), new C19141f(f48746J, 296, 3), new C19141f(f48800P, 301, 3), new C19141f(f48881Y, 305, 2), new C19141f(f48845U, 306, 2), new C19141f(f48890Z, 315, 2), new C19141f(f48809Q, C16717v.C16718a.f42170s, 5), new C19141f(f48818R, 319, 5), new C19141f("SubIFDPointer", 330, 4), new C19141f(f48782N, C18317n0.f46975j, 4), new C19141f(f48791O, 514, 4), new C19141f(f48827S, 529, 5), new C19141f(f48710F, 530, 3), new C19141f(f48719G, 531, 3), new C19141f(f48836T, C14092c.f34566W, 5), new C19141f(f48899a0, 33432, 2), new C19141f("ExifIFDPointer", 34665, 4), new C19141f("GPSInfoIFDPointer", 34853, 4), new C19141f(f48957h2, 50706, 1), new C19141f(f48965i2, 50720, 3, 4)};
        f48780M6 = fVarArr5;
        C19141f[] fVarArr6 = {new C19141f(f48973j2, 256, 7), new C19141f(f48668A2, 8224, 4), new C19141f(f48677B2, 8256, 4)};
        f48798O6 = fVarArr6;
        C19141f[] fVarArr7 = {new C19141f(f48981k2, 257, 4), new C19141f(f48989l2, 258, 4)};
        f48807P6 = fVarArr7;
        C19141f[] fVarArr8 = {new C19141f(f48997m2, 4371, 3)};
        f48816Q6 = fVarArr8;
        C19141f[] fVarArr9 = {new C19141f(f48923d0, 55, 3)};
        f48825R6 = fVarArr9;
        C19141f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f48922c7 = fVarArr10;
        f48954g7 = new HashMap[fVarArr10.length];
        f48962h7 = new HashMap[fVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f48986k7 = forName;
        f48994l7 = DefaultImageHeaderParser.f57420h.getBytes(forName);
        f49002m7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f49001m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f49009n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C19141f[][] fVarArr11 = f48922c7;
            if (i < fVarArr11.length) {
                f48954g7[i] = new HashMap<>();
                f48962h7[i] = new HashMap<>();
                for (C19141f fVar : fVarArr11[i]) {
                    f48954g7[i].put(Integer.valueOf(fVar.f49149a), fVar);
                    f48962h7[i].put(fVar.f49150b, fVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f48978j7;
                C19141f[] fVarArr12 = f48930d7;
                hashMap.put(Integer.valueOf(fVarArr12[0].f49149a), 5);
                hashMap.put(Integer.valueOf(fVarArr12[1].f49149a), 1);
                hashMap.put(Integer.valueOf(fVarArr12[2].f49149a), 2);
                hashMap.put(Integer.valueOf(fVarArr12[3].f49149a), 3);
                hashMap.put(Integer.valueOf(fVarArr12[4].f49149a), 7);
                hashMap.put(Integer.valueOf(fVarArr12[5].f49149a), 8);
                return;
            }
        }
    }

    public C19135a(@C0359n0 File file) throws IOException {
        C19141f[][] fVarArr = f48922c7;
        this.f49117f = new HashMap[fVarArr.length];
        this.f49118g = new HashSet(fVarArr.length);
        this.f49119h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            mo56479U(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    /* renamed from: F0 */
    public static boolean m89540F0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m89541P(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = m89541P(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = m89541P(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r12 < 0) goto L_0x00f5
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r12 > 0) goto L_0x00eb
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r2 = 4
            if (r1 < 0) goto L_0x0130
            long r3 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.m89541P(java.lang.String):android.util.Pair");
    }

    /* renamed from: V */
    public static boolean m89542V(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f48994l7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f48994l7;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: Y */
    public static boolean m89543Y(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f48698D5;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: b */
    public static String m89544b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m89545c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m89546d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d0 */
    public static boolean m89547d0(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static double m89548f(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(f48823R4)) {
                if (!str2.equals(f48841T4)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: g */
    public static long[] m89549g(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: g0 */
    public static boolean m89550g0(@C0359n0 String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1875291391:
                    if (lowerCase.equals("image/x-fuji-raf")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1635437028:
                    if (lowerCase.equals("image/x-samsung-srw")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1594371159:
                    if (lowerCase.equals("image/x-sony-arw")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1487464693:
                    if (lowerCase.equals("image/heic")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1487464690:
                    if (lowerCase.equals("image/heif")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1487394660:
                    if (lowerCase.equals(C28534f.f69188x)) {
                        c = 5;
                        break;
                    }
                    break;
                case -1487018032:
                    if (lowerCase.equals("image/webp")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1423313290:
                    if (lowerCase.equals("image/x-adobe-dng")) {
                        c = 7;
                        break;
                    }
                    break;
                case -985160897:
                    if (lowerCase.equals("image/x-panasonic-rw2")) {
                        c = 8;
                        break;
                    }
                    break;
                case -879258763:
                    if (lowerCase.equals("image/png")) {
                        c = 9;
                        break;
                    }
                    break;
                case -332763809:
                    if (lowerCase.equals("image/x-pentax-pef")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1378106698:
                    if (lowerCase.equals("image/x-olympus-orf")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2099152104:
                    if (lowerCase.equals("image/x-nikon-nef")) {
                        c = 12;
                        break;
                    }
                    break;
                case 2099152524:
                    if (lowerCase.equals("image/x-nikon-nrw")) {
                        c = 13;
                        break;
                    }
                    break;
                case 2111234748:
                    if (lowerCase.equals("image/x-canon-cr2")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    return true;
                default:
                    return false;
            }
        } else {
            throw new NullPointerException("mimeType shouldn't be null");
        }
    }

    /* renamed from: h */
    public static int m89551h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: i */
    public static void m89552i(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|(5:13|14|(2:16|17)|19|(3:23|(1:25)|26))|(5:28|29|(2:32|30)|39|33)|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if ("-".equals(r1) != false) goto L_0x0056;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0089 */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long m89553l0(@androidx.annotation.C0363p0 java.lang.String r10, @androidx.annotation.C0363p0 java.lang.String r11, @androidx.annotation.C0363p0 java.lang.String r12) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x008e
            java.util.regex.Pattern r1 = f48862V7
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0011
            goto L_0x008e
        L_0x0011:
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            java.text.SimpleDateFormat r3 = f49001m6     // Catch:{ IllegalArgumentException -> 0x008e }
            java.util.Date r3 = r3.parse(r10, r1)     // Catch:{ IllegalArgumentException -> 0x008e }
            if (r3 != 0) goto L_0x0028
            java.text.SimpleDateFormat r3 = f49009n6     // Catch:{ IllegalArgumentException -> 0x008e }
            java.util.Date r3 = r3.parse(r10, r1)     // Catch:{ IllegalArgumentException -> 0x008e }
            if (r3 != 0) goto L_0x0028
            return r0
        L_0x0028:
            long r3 = r3.getTime()     // Catch:{ IllegalArgumentException -> 0x008e }
            if (r12 == 0) goto L_0x0078
            r10 = 1
            java.lang.String r1 = r12.substring(r2, r10)     // Catch:{ IllegalArgumentException -> 0x008e }
            r2 = 3
            java.lang.String r5 = r12.substring(r10, r2)     // Catch:{ IllegalArgumentException -> 0x008e }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ IllegalArgumentException -> 0x008e }
            r6 = 6
            r7 = 4
            java.lang.String r6 = r12.substring(r7, r6)     // Catch:{ IllegalArgumentException -> 0x008e }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x008e }
            java.lang.String r8 = "+"
            boolean r8 = r8.equals(r1)     // Catch:{ IllegalArgumentException -> 0x008e }
            java.lang.String r9 = "-"
            if (r8 != 0) goto L_0x0056
            boolean r8 = r9.equals(r1)     // Catch:{ IllegalArgumentException -> 0x008e }
            if (r8 == 0) goto L_0x0078
        L_0x0056:
            java.lang.String r8 = ":"
            java.lang.String r12 = r12.substring(r2, r7)     // Catch:{ IllegalArgumentException -> 0x008e }
            boolean r12 = r8.equals(r12)     // Catch:{ IllegalArgumentException -> 0x008e }
            if (r12 == 0) goto L_0x0078
            r12 = 14
            if (r5 > r12) goto L_0x0078
            int r5 = r5 * 60
            int r5 = r5 + r6
            int r5 = r5 * 60
            int r5 = r5 * 1000
            boolean r12 = r9.equals(r1)     // Catch:{ IllegalArgumentException -> 0x008e }
            if (r12 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r10 = -1
        L_0x0075:
            int r5 = r5 * r10
            long r1 = (long) r5
            long r3 = r3 + r1
        L_0x0078:
            if (r11 == 0) goto L_0x0089
            long r10 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x0089 }
        L_0x007e:
            r1 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x0088
            r1 = 10
            long r10 = r10 / r1
            goto L_0x007e
        L_0x0088:
            long r3 = r3 + r10
        L_0x0089:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x008e }
            return r10
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.m89553l0(java.lang.String, java.lang.String, java.lang.String):java.lang.Long");
    }

    @Deprecated
    /* renamed from: A */
    public boolean mo56451A(float[] fArr) {
        double[] B = mo56453B();
        if (B == null) {
            return false;
        }
        fArr[0] = (float) B[0];
        fArr[1] = (float) B[1];
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028a, code lost:
        r15 = 1;
     */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56452A0(@androidx.annotation.C0359n0 java.lang.String r17, @androidx.annotation.C0363p0 java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            if (r1 == 0) goto L_0x0336
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = " : "
            java.lang.String r5 = "Invalid value for "
            if (r3 != 0) goto L_0x0024
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0024
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0064
        L_0x0024:
            if (r2 == 0) goto L_0x0064
            java.util.regex.Pattern r3 = f48880X7
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r6 = f48889Y7
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r6 = r6.find()
            int r7 = r18.length()
            r8 = 19
            if (r7 != r8) goto L_0x0052
            if (r3 != 0) goto L_0x0047
            if (r6 != 0) goto L_0x0047
            goto L_0x0052
        L_0x0047:
            if (r6 == 0) goto L_0x0064
            java.lang.String r3 = "-"
            java.lang.String r6 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r6)
            goto L_0x0064
        L_0x0052:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            return
        L_0x0064:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x006e
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x006e:
            r3 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00f9
            java.util.HashSet<java.lang.String> r7 = f48970i7
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L_0x00f9
            java.lang.String r7 = "GPSTimeStamp"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x00d9
            java.util.regex.Pattern r7 = f48871W7
            java.util.regex.Matcher r7 = r7.matcher(r2)
            boolean r8 = r7.find()
            if (r8 != 0) goto L_0x00a0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            return
        L_0x00a0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r7.group(r6)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1,"
            r2.append(r4)
            java.lang.String r5 = r7.group(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            r2.append(r4)
            r4 = 3
            java.lang.String r4 = r7.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x00f9
        L_0x00d9:
            double r7 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00e7 }
            androidx.exifinterface.media.a$h r9 = new androidx.exifinterface.media.a$h     // Catch:{ NumberFormatException -> 0x00e7 }
            r9.<init>(r7)     // Catch:{ NumberFormatException -> 0x00e7 }
            java.lang.String r2 = r9.toString()     // Catch:{ NumberFormatException -> 0x00e7 }
            goto L_0x00f9
        L_0x00e7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            return
        L_0x00f9:
            r4 = 0
            r5 = r4
        L_0x00fb:
            androidx.exifinterface.media.a$f[][] r7 = f48922c7
            int r7 = r7.length
            if (r5 >= r7) goto L_0x0335
            r7 = 4
            if (r5 != r7) goto L_0x0109
            boolean r7 = r0.f49120i
            if (r7 != 0) goto L_0x0109
            goto L_0x032d
        L_0x0109:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$f>[] r7 = f48962h7
            r7 = r7[r5]
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.a$f r7 = (androidx.exifinterface.media.C19135a.C19141f) r7
            if (r7 == 0) goto L_0x032d
            if (r2 != 0) goto L_0x0120
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r0.f49117f
            r7 = r7[r5]
            r7.remove(r1)
            goto L_0x032d
        L_0x0120:
            android.util.Pair r8 = m89541P(r2)
            int r9 = r7.f49151c
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            if (r9 == r10) goto L_0x01e9
            int r9 = r7.f49151c
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L_0x013f
            goto L_0x01e9
        L_0x013f:
            int r9 = r7.f49152d
            if (r9 == r11) goto L_0x015d
            java.lang.Object r10 = r8.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 == r10) goto L_0x0159
            int r9 = r7.f49152d
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 != r10) goto L_0x015d
        L_0x0159:
            int r7 = r7.f49152d
            goto L_0x01eb
        L_0x015d:
            int r9 = r7.f49151c
            if (r9 == r6) goto L_0x01e7
            r10 = 7
            if (r9 == r10) goto L_0x01e7
            if (r9 != r3) goto L_0x0168
            goto L_0x01e7
        L_0x0168:
            boolean r9 = f49076w
            if (r9 == 0) goto L_0x032d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Given tag ("
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ") value didn't match with one of expected formats: "
            r9.append(r10)
            java.lang.String[] r10 = f48717F6
            int r12 = r7.f49151c
            r12 = r10[r12]
            r9.append(r12)
            int r12 = r7.f49152d
            java.lang.String r13 = ""
            java.lang.String r14 = ", "
            if (r12 != r11) goto L_0x0191
            r7 = r13
            goto L_0x01a4
        L_0x0191:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            int r7 = r7.f49152d
            r7 = r10[r7]
            r12.append(r7)
            java.lang.String r7 = r12.toString()
        L_0x01a4:
            r9.append(r7)
            java.lang.String r7 = " (guess: "
            r9.append(r7)
            java.lang.Object r7 = r8.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r10[r7]
            r9.append(r7)
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r11) goto L_0x01c4
            goto L_0x01dd
        L_0x01c4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r10[r8]
            r7.append(r8)
            java.lang.String r13 = r7.toString()
        L_0x01dd:
            r9.append(r13)
            java.lang.String r7 = ")"
            r9.append(r7)
            goto L_0x032d
        L_0x01e7:
            r7 = r9
            goto L_0x01eb
        L_0x01e9:
            int r7 = r7.f49151c
        L_0x01eb:
            java.lang.String r8 = "/"
            java.lang.String r9 = ","
            switch(r7) {
                case 1: goto L_0x0320;
                case 2: goto L_0x0313;
                case 3: goto L_0x02ee;
                case 4: goto L_0x02c9;
                case 5: goto L_0x028d;
                case 6: goto L_0x01f2;
                case 7: goto L_0x0313;
                case 8: goto L_0x01f2;
                case 9: goto L_0x0267;
                case 10: goto L_0x022b;
                case 11: goto L_0x01f2;
                case 12: goto L_0x0206;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            r15 = r6
            boolean r3 = f49076w
            if (r3 == 0) goto L_0x032e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Data format isn't one of expected formats: "
            r3.append(r4)
            r3.append(r7)
            goto L_0x032e
        L_0x0206:
            java.lang.String[] r7 = r2.split(r9, r11)
            int r8 = r7.length
            double[] r8 = new double[r8]
            r9 = r4
        L_0x020e:
            int r10 = r7.length
            if (r9 >= r10) goto L_0x021c
            r10 = r7[r9]
            double r10 = java.lang.Double.parseDouble(r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x020e
        L_0x021c:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r0.f49117f
            r7 = r7[r5]
            java.nio.ByteOrder r9 = r0.f49119h
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.C19135a.C19139d.m89641c(r8, r9)
            r7.put(r1, r8)
            goto L_0x032d
        L_0x022b:
            java.lang.String[] r7 = r2.split(r9, r11)
            int r9 = r7.length
            androidx.exifinterface.media.a$h[] r9 = new androidx.exifinterface.media.C19135a.C19143h[r9]
            r10 = r4
        L_0x0233:
            int r12 = r7.length
            if (r10 >= r12) goto L_0x0259
            r12 = r7[r10]
            java.lang.String[] r12 = r12.split(r8, r11)
            androidx.exifinterface.media.a$h r13 = new androidx.exifinterface.media.a$h
            r14 = r12[r4]
            double r14 = java.lang.Double.parseDouble(r14)
            long r14 = (long) r14
            r12 = r12[r6]
            r18 = r7
            double r6 = java.lang.Double.parseDouble(r12)
            long r6 = (long) r6
            r13.<init>(r14, r6)
            r9[r10] = r13
            int r10 = r10 + 1
            r7 = r18
            r6 = 1
            goto L_0x0233
        L_0x0259:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r6 = r0.f49117f
            r6 = r6[r5]
            java.nio.ByteOrder r7 = r0.f49119h
            androidx.exifinterface.media.a$d r7 = androidx.exifinterface.media.C19135a.C19139d.m89645g(r9, r7)
            r6.put(r1, r7)
            goto L_0x028a
        L_0x0267:
            java.lang.String[] r6 = r2.split(r9, r11)
            int r7 = r6.length
            int[] r7 = new int[r7]
            r8 = r4
        L_0x026f:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x027d
            r9 = r6[r8]
            int r9 = java.lang.Integer.parseInt(r9)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x026f
        L_0x027d:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r6 = r0.f49117f
            r6 = r6[r5]
            java.nio.ByteOrder r8 = r0.f49119h
            androidx.exifinterface.media.a$d r7 = androidx.exifinterface.media.C19135a.C19139d.m89643e(r7, r8)
            r6.put(r1, r7)
        L_0x028a:
            r15 = 1
            goto L_0x032e
        L_0x028d:
            java.lang.String[] r6 = r2.split(r9, r11)
            int r7 = r6.length
            androidx.exifinterface.media.a$h[] r7 = new androidx.exifinterface.media.C19135a.C19143h[r7]
            r9 = r4
        L_0x0295:
            int r10 = r6.length
            if (r9 >= r10) goto L_0x02b9
            r10 = r6[r9]
            java.lang.String[] r10 = r10.split(r8, r11)
            androidx.exifinterface.media.a$h r12 = new androidx.exifinterface.media.a$h
            r13 = r10[r4]
            double r13 = java.lang.Double.parseDouble(r13)
            long r13 = (long) r13
            r15 = 1
            r10 = r10[r15]
            double r3 = java.lang.Double.parseDouble(r10)
            long r3 = (long) r3
            r12.<init>(r13, r3)
            r7[r9] = r12
            int r9 = r9 + 1
            r3 = 2
            r4 = 0
            goto L_0x0295
        L_0x02b9:
            r15 = 1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r5]
            java.nio.ByteOrder r4 = r0.f49119h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.C19135a.C19139d.m89650l(r7, r4)
            r3.put(r1, r4)
            goto L_0x032e
        L_0x02c9:
            r15 = r6
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r6 = 0
        L_0x02d2:
            int r7 = r3.length
            if (r6 >= r7) goto L_0x02e0
            r7 = r3[r6]
            long r7 = java.lang.Long.parseLong(r7)
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x02d2
        L_0x02e0:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r5]
            java.nio.ByteOrder r6 = r0.f49119h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.C19135a.C19139d.m89648j(r4, r6)
            r3.put(r1, r4)
            goto L_0x032e
        L_0x02ee:
            r15 = r6
            java.lang.String[] r3 = r2.split(r9, r11)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x02f7:
            int r7 = r3.length
            if (r6 >= r7) goto L_0x0305
            r7 = r3[r6]
            int r7 = java.lang.Integer.parseInt(r7)
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x02f7
        L_0x0305:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r5]
            java.nio.ByteOrder r6 = r0.f49119h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.C19135a.C19139d.m89652n(r4, r6)
            r3.put(r1, r4)
            goto L_0x032e
        L_0x0313:
            r15 = r6
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r5]
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.C19135a.C19139d.m89646h(r2)
            r3.put(r1, r4)
            goto L_0x032e
        L_0x0320:
            r15 = r6
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r5]
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.C19135a.C19139d.m89639a(r2)
            r3.put(r1, r4)
            goto L_0x032e
        L_0x032d:
            r15 = r6
        L_0x032e:
            int r5 = r5 + 1
            r6 = r15
            r3 = 2
            r4 = 0
            goto L_0x00fb
        L_0x0335:
            return
        L_0x0336:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "tag shouldn't be null"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56452A0(java.lang.String, java.lang.String):void");
    }

    @C0363p0
    /* renamed from: B */
    public double[] mo56453B() {
        String o = mo56501o(f49105z1);
        String o2 = mo56501o(f49096y1);
        String o3 = mo56501o(f48676B1);
        String o4 = mo56501o(f48667A1);
        if (o == null || o2 == null || o3 == null || o4 == null) {
            return null;
        }
        try {
            return new double[]{m89548f(o, o2), m89548f(o3, o4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Latitude/longitude values are not parsable. ");
            sb.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{o, o2, o3, o4}));
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: B0 */
    public void mo56454B0(@C0359n0 Long l) {
        mo56452A0(f48845U, f49001m6.format(new Date(l.longValue())));
        mo56452A0(f49035r0, Long.toString(l.longValue() % 1000));
    }

    /* renamed from: C */
    public final int mo56455C(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m89543Y(bArr)) {
            return 4;
        }
        if (mo56485b0(bArr)) {
            return 9;
        }
        if (mo56481X(bArr)) {
            return 12;
        }
        if (mo56482Z(bArr)) {
            return 7;
        }
        if (mo56486c0(bArr)) {
            return 10;
        }
        if (mo56484a0(bArr)) {
            return 13;
        }
        if (mo56493j0(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: C0 */
    public void mo56456C0(Location location) {
        if (location != null) {
            mo56452A0(f48883Y1, location.getProvider());
            mo56458D0(location.getLatitude(), location.getLongitude());
            mo56524z0(location.getAltitude());
            mo56452A0(f48748J1, "K");
            mo56452A0(f48757K1, new C19143h((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = f49001m6.format(new Date(location.getTime())).split("\\s+", -1);
            mo56452A0(f48901a2, split[0]);
            mo56452A0(f48703E1, split[1]);
        }
    }

    /* renamed from: D */
    public final void mo56457D(C19137b bVar) throws IOException {
        int i;
        int i2;
        mo56462G(bVar);
        C19139d dVar = this.f49117f[1].get(f48971j0);
        if (dVar != null) {
            C19137b bVar2 = new C19137b(dVar.f49148d);
            bVar2.mo56533f(this.f49119h);
            byte[] bArr = f48770L5;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.mo56532d(0);
            byte[] bArr3 = f48779M5;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.mo56532d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.mo56532d(12);
            }
            mo56506q0(bVar2, 6);
            C19139d dVar2 = this.f49117f[7].get(f48981k2);
            C19139d dVar3 = this.f49117f[7].get(f48989l2);
            if (!(dVar2 == null || dVar3 == null)) {
                this.f49117f[5].put(f48782N, dVar2);
                this.f49117f[5].put(f48791O, dVar3);
            }
            C19139d dVar4 = this.f49117f[8].get(f48997m2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.mo56563r(this.f49119h);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                    int i5 = (i3 - i4) + 1;
                    int i6 = (i - i2) + 1;
                    if (i5 < i6) {
                        int i7 = i5 + i6;
                        i6 = i7 - i6;
                        i5 = i7 - i6;
                    }
                    C19139d m = C19139d.m89651m(i5, this.f49119h);
                    C19139d m2 = C19139d.m89651m(i6, this.f49119h);
                    this.f49117f[0].put(f49085x, m);
                    this.f49117f[0].put(f49094y, m2);
                }
            }
        }
    }

    /* renamed from: D0 */
    public void mo56458D0(double d, double d2) {
        String str;
        String str2;
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            if (d >= 0.0d) {
                str = "N";
            } else {
                str = f48823R4;
            }
            mo56452A0(f49096y1, str);
            mo56452A0(f49105z1, mo56487e(Math.abs(d)));
            if (d2 >= 0.0d) {
                str2 = "E";
            } else {
                str2 = f48841T4;
            }
            mo56452A0(f48667A1, str2);
            mo56452A0(f48676B1, mo56487e(Math.abs(d2)));
        }
    }

    /* renamed from: E */
    public final void mo56459E(C19137b bVar) throws IOException {
        if (f49076w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mark(0);
        bVar.mo56533f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f48833S5;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f48851U5)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f48860V5)) {
                        if (Arrays.equals(bArr2, f48842T5)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f49127p = i2;
                                    mo56504p0(bArr3, 0);
                                    mo56467I0();
                                    mo56460E0(new C19137b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m89544b(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: E0 */
    public final void mo56460E0(C19137b bVar) throws IOException {
        HashMap<String, C19139d> hashMap = this.f49117f[4];
        C19139d dVar = hashMap.get(f48665A);
        if (dVar != null) {
            int p = dVar.mo56561p(this.f49119h);
            this.f49126o = p;
            if (p != 1) {
                if (p == 6) {
                    mo56475Q(bVar, hashMap);
                    return;
                } else if (p != 7) {
                    return;
                }
            }
            if (mo56488e0(hashMap)) {
                mo56476R(bVar, hashMap);
                return;
            }
            return;
        }
        this.f49126o = 6;
        mo56475Q(bVar, hashMap);
    }

    /* renamed from: F */
    public final void mo56461F(C19137b bVar) throws IOException {
        boolean z = f49076w;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.mo56532d((long) i);
        bVar.read(bArr4);
        mo56523z(new C19137b(bArr4), i, 5);
        bVar.mo56532d((long) i3);
        bVar.mo56533f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f48789N6.f49149a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C19139d m = C19139d.m89651m(readShort, this.f49119h);
                C19139d m2 = C19139d.m89651m(readShort2, this.f49119h);
                this.f49117f[0].put(f49094y, m);
                this.f49117f[0].put(f49085x, m2);
                if (f49076w) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append(readShort);
                    sb3.append(", width: ");
                    sb3.append(readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: G */
    public final void mo56462G(C19137b bVar) throws IOException {
        C19139d dVar;
        mo56498m0(bVar, bVar.available());
        mo56506q0(bVar, 0);
        mo56465H0(bVar, 0);
        mo56465H0(bVar, 5);
        mo56465H0(bVar, 4);
        mo56467I0();
        if (this.f49115d == 8 && (dVar = this.f49117f[1].get(f48971j0)) != null) {
            C19137b bVar2 = new C19137b(dVar.f49148d);
            bVar2.mo56533f(this.f49119h);
            bVar2.mo56532d(6);
            mo56506q0(bVar2, 9);
            C19139d dVar2 = this.f49117f[9].get(f48923d0);
            if (dVar2 != null) {
                this.f49117f[1].put(f48923d0, dVar2);
            }
        }
    }

    /* renamed from: G0 */
    public final void mo56463G0(int i, int i2) throws IOException {
        if (!this.f49117f[i].isEmpty() && !this.f49117f[i2].isEmpty()) {
            C19139d dVar = this.f49117f[i].get(f49094y);
            C19139d dVar2 = this.f49117f[i].get(f49085x);
            C19139d dVar3 = this.f49117f[i2].get(f49094y);
            C19139d dVar4 = this.f49117f[i2].get(f49085x);
            if (dVar != null && dVar2 != null && dVar3 != null && dVar4 != null) {
                int p = dVar.mo56561p(this.f49119h);
                int p2 = dVar2.mo56561p(this.f49119h);
                int p3 = dVar3.mo56561p(this.f49119h);
                int p4 = dVar4.mo56561p(this.f49119h);
                if (p < p3 && p2 < p4) {
                    HashMap<String, C19139d>[] hashMapArr = this.f49117f;
                    HashMap<String, C19139d> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: H */
    public int mo56464H() {
        switch (mo56507r(f48683C, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: H0 */
    public final void mo56465H0(C19137b bVar, int i) throws IOException {
        C19139d dVar;
        C19139d dVar2;
        C19139d dVar3 = this.f49117f[i].get(f48965i2);
        C19139d dVar4 = this.f49117f[i].get(f49029q2);
        C19139d dVar5 = this.f49117f[i].get(f49013o2);
        C19139d dVar6 = this.f49117f[i].get(f49005n2);
        C19139d dVar7 = this.f49117f[i].get(f49021p2);
        if (dVar3 != null) {
            if (dVar3.f49145a == 5) {
                C19143h[] hVarArr = (C19143h[]) dVar3.mo56563r(this.f49119h);
                if (hVarArr == null || hVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    sb.append(Arrays.toString(hVarArr));
                    return;
                }
                dVar2 = C19139d.m89649k(hVarArr[0], this.f49119h);
                dVar = C19139d.m89649k(hVarArr[1], this.f49119h);
            } else {
                int[] iArr = (int[]) dVar3.mo56563r(this.f49119h);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(iArr));
                    return;
                }
                dVar2 = C19139d.m89651m(iArr[0], this.f49119h);
                dVar = C19139d.m89651m(iArr[1], this.f49119h);
            }
            this.f49117f[i].put(f49085x, dVar2);
            this.f49117f[i].put(f49094y, dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            mo56512t0(bVar, i);
        } else {
            int p = dVar4.mo56561p(this.f49119h);
            int p2 = dVar6.mo56561p(this.f49119h);
            int p3 = dVar7.mo56561p(this.f49119h);
            int p4 = dVar5.mo56561p(this.f49119h);
            if (p2 > p && p3 > p4) {
                C19139d m = C19139d.m89651m(p2 - p, this.f49119h);
                C19139d m2 = C19139d.m89651m(p3 - p4, this.f49119h);
                this.f49117f[i].put(f49094y, m);
                this.f49117f[i].put(f49085x, m2);
            }
        }
    }

    /* renamed from: I */
    public final void mo56466I(C19137b bVar) throws IOException {
        if (f49076w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(bVar);
        }
        mo56462G(bVar);
        C19139d dVar = this.f49117f[0].get(f49045s2);
        if (dVar != null) {
            mo56523z(new C19137b(dVar.f49148d), (int) dVar.f49147c, 5);
        }
        C19139d dVar2 = this.f49117f[0].get(f49037r2);
        C19139d dVar3 = this.f49117f[1].get(f49104z0);
        if (dVar2 != null && dVar3 == null) {
            this.f49117f[1].put(f49104z0, dVar2);
        }
    }

    /* renamed from: I0 */
    public final void mo56467I0() throws IOException {
        mo56463G0(0, 5);
        mo56463G0(0, 4);
        mo56463G0(5, 4);
        C19139d dVar = this.f49117f[1].get(f48939f0);
        C19139d dVar2 = this.f49117f[1].get(f48947g0);
        if (!(dVar == null || dVar2 == null)) {
            this.f49117f[0].put(f49085x, dVar);
            this.f49117f[0].put(f49094y, dVar2);
        }
        if (this.f49117f[4].isEmpty() && mo56490h0(this.f49117f[5])) {
            HashMap<String, C19139d>[] hashMapArr = this.f49117f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        mo56490h0(this.f49117f[4]);
    }

    /* renamed from: J */
    public final void mo56468J(C19137b bVar) throws IOException {
        byte[] bArr = f48994l7;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f49127p = bArr.length;
        mo56504p0(bArr2, 0);
    }

    /* renamed from: J0 */
    public final int mo56469J0(C19138c cVar) throws IOException {
        short s;
        C19138c cVar2 = cVar;
        C19141f[][] fVarArr = f48922c7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (C19141f fVar : f48930d7) {
            mo56508r0(fVar.f49150b);
        }
        mo56508r0(f48938e7.f49150b);
        mo56508r0(f48946f7.f49150b);
        for (int i = 0; i < f48922c7.length; i++) {
            for (Object obj : this.f49117f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f49117f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f49117f[1].isEmpty()) {
            this.f49117f[0].put(f48930d7[1].f49150b, C19139d.m89647i(0, this.f49119h));
        }
        if (!this.f49117f[2].isEmpty()) {
            this.f49117f[0].put(f48930d7[2].f49150b, C19139d.m89647i(0, this.f49119h));
        }
        if (!this.f49117f[3].isEmpty()) {
            this.f49117f[1].put(f48930d7[3].f49150b, C19139d.m89647i(0, this.f49119h));
        }
        if (this.f49120i) {
            this.f49117f[4].put(f48938e7.f49150b, C19139d.m89647i(0, this.f49119h));
            this.f49117f[4].put(f48946f7.f49150b, C19139d.m89647i((long) this.f49124m, this.f49119h));
        }
        for (int i2 = 0; i2 < f48922c7.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C19139d> value : this.f49117f[i2].entrySet()) {
                int s2 = ((C19139d) value.getValue()).mo56564s();
                if (s2 > 4) {
                    i3 += s2;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f48922c7.length; i5++) {
            if (!this.f49117f[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f49117f[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f49120i) {
            this.f49117f[4].put(f48938e7.f49150b, C19139d.m89647i((long) i4, this.f49119h));
            this.f49123l = i4;
            i4 += this.f49124m;
        }
        if (this.f49115d == 4) {
            i4 += 8;
        }
        if (f49076w) {
            for (int i6 = 0; i6 < f48922c7.length; i6++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f49117f[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)});
            }
        }
        if (!this.f49117f[1].isEmpty()) {
            this.f49117f[0].put(f48930d7[1].f49150b, C19139d.m89647i((long) iArr[1], this.f49119h));
        }
        if (!this.f49117f[2].isEmpty()) {
            this.f49117f[0].put(f48930d7[2].f49150b, C19139d.m89647i((long) iArr[2], this.f49119h));
        }
        if (!this.f49117f[3].isEmpty()) {
            this.f49117f[1].put(f48930d7[3].f49150b, C19139d.m89647i((long) iArr[3], this.f49119h));
        }
        int i7 = this.f49115d;
        if (i7 == 4) {
            cVar2.mo56557g(i4);
            cVar2.write(f48994l7);
        } else if (i7 == 13) {
            cVar2.mo56554c(i4);
            cVar2.write(f48842T5);
        } else if (i7 == 14) {
            cVar2.write(f48913b6);
            cVar2.mo56554c(i4);
        }
        if (this.f49119h == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        cVar2.mo56555d(s);
        cVar2.mo56552a(this.f49119h);
        cVar2.mo56557g(42);
        cVar2.mo56556f(8);
        for (int i8 = 0; i8 < f48922c7.length; i8++) {
            if (!this.f49117f[i8].isEmpty()) {
                cVar2.mo56557g(this.f49117f[i8].size());
                int size = iArr[i8] + 2 + (this.f49117f[i8].size() * 12) + 4;
                for (Map.Entry next : this.f49117f[i8].entrySet()) {
                    int i9 = f48962h7[i8].get(next.getKey()).f49149a;
                    C19139d dVar = (C19139d) next.getValue();
                    int s3 = dVar.mo56564s();
                    cVar2.mo56557g(i9);
                    cVar2.mo56557g(dVar.f49145a);
                    cVar2.mo56554c(dVar.f49146b);
                    if (s3 > 4) {
                        cVar2.mo56556f((long) size);
                        size += s3;
                    } else {
                        cVar2.write(dVar.f49148d);
                        if (s3 < 4) {
                            while (s3 < 4) {
                                cVar2.mo56553b(0);
                                s3++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f49117f[4].isEmpty()) {
                    cVar2.mo56556f(0);
                } else {
                    cVar2.mo56556f((long) iArr[4]);
                }
                for (Map.Entry<String, C19139d> value2 : this.f49117f[i8].entrySet()) {
                    byte[] bArr = ((C19139d) value2.getValue()).f49148d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f49120i) {
            cVar2.write(mo56472M());
        }
        if (this.f49115d == 14 && i4 % 2 == 1) {
            cVar2.mo56553b(0);
        }
        cVar2.mo56552a(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    @C0363p0
    /* renamed from: K */
    public byte[] mo56470K() {
        int i = this.f49126o;
        if (i == 6 || i == 7) {
            return mo56472M();
        }
        return null;
    }

    @C0363p0
    /* renamed from: L */
    public Bitmap mo56471L() {
        if (!this.f49120i) {
            return null;
        }
        if (this.f49125n == null) {
            this.f49125n = mo56472M();
        }
        int i = this.f49126o;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.f49125n, 0, this.f49124m);
        }
        if (i == 1) {
            int length = this.f49125n.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.f49125n;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << DateTimeFieldType.f30603E0) + 0 + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            C19139d dVar = this.f49117f[4].get(f49094y);
            C19139d dVar2 = this.f49117f[4].get(f49085x);
            if (!(dVar == null || dVar2 == null)) {
                return Bitmap.createBitmap(iArr, dVar2.mo56561p(this.f49119h), dVar.mo56561p(this.f49119h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f A[SYNTHETIC, Splitter:B:32:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c A[Catch:{ Exception -> 0x009c, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a1  */
    @androidx.annotation.C0363p0
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo56472M() {
        /*
            r8 = this;
            boolean r0 = r8.f49120i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r0 = r8.f49125n
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r0 = r8.f49114c     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            if (r0 == 0) goto L_0x0028
            boolean r2 = r0.markSupported()     // Catch:{ Exception -> 0x0025, all -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r0.reset()     // Catch:{ Exception -> 0x0025, all -> 0x001e }
        L_0x0018:
            r2 = r1
            goto L_0x0049
        L_0x001a:
            m89546d(r0)
            return r1
        L_0x001e:
            r2 = move-exception
            r7 = r1
            r1 = r0
            r0 = r2
            r2 = r7
            goto L_0x0091
        L_0x0025:
            r2 = r1
            goto L_0x009c
        L_0x0028:
            java.lang.String r0 = r8.f49112a     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            if (r0 == 0) goto L_0x0034
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            java.lang.String r2 = r8.f49112a     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            goto L_0x0018
        L_0x0034:
            java.io.FileDescriptor r0 = r8.f49113b     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r3 = 0
            android.system.Os.lseek(r0, r3, r2)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0049:
            int r3 = r8.f49123l     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r4 = r8.f49127p     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            long r3 = r0.skip(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r5 = r8.f49123l     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r6 = r8.f49127p     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L_0x007c
            int r3 = r8.f49124m     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r5 = r0.read(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r6 = r8.f49124m     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            if (r5 != r6) goto L_0x0076
            r8.f49125n = r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            m89546d(r0)
            if (r2 == 0) goto L_0x0075
            m89545c(r2)
        L_0x0075:
            return r3
        L_0x0076:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            throw r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
        L_0x007c:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            throw r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            r7 = r1
            r1 = r0
        L_0x0085:
            r0 = r7
            goto L_0x0091
        L_0x0087:
            r2 = move-exception
            r7 = r2
            r2 = r0
            goto L_0x0085
        L_0x008b:
            r2 = r0
            r0 = r1
            goto L_0x009c
        L_0x008e:
            r2 = move-exception
            r0 = r2
            r2 = r1
        L_0x0091:
            m89546d(r1)
            if (r2 == 0) goto L_0x0099
            m89545c(r2)
        L_0x0099:
            throw r0
        L_0x009a:
            r0 = r1
            r2 = r0
        L_0x009c:
            m89546d(r0)
            if (r2 == 0) goto L_0x00a4
            m89545c(r2)
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56472M():byte[]");
    }

    @C0363p0
    /* renamed from: N */
    public long[] mo56473N() {
        if (this.f49131t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        } else if (!this.f49120i) {
            return null;
        } else {
            if (this.f49121j && !this.f49122k) {
                return null;
            }
            return new long[]{(long) (this.f49123l + this.f49127p), (long) this.f49124m};
        }
    }

    /* renamed from: O */
    public final void mo56474O(C19137b bVar) throws IOException {
        if (f49076w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mark(0);
        bVar.mo56533f(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f48887Y5.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f48896Z5.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f48913b6, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f49127p = i;
                            mo56504p0(bArr2, 0);
                            mo56460E0(new C19137b(bArr2));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m89544b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 != readInt) {
                        if (i2 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: Q */
    public final void mo56475Q(C19137b bVar, HashMap hashMap) throws IOException {
        C19139d dVar = (C19139d) hashMap.get(f48782N);
        C19139d dVar2 = (C19139d) hashMap.get(f48791O);
        if (dVar != null && dVar2 != null) {
            int p = dVar.mo56561p(this.f49119h);
            int p2 = dVar2.mo56561p(this.f49119h);
            if (this.f49115d == 7) {
                p += this.f49128q;
            }
            int min = Math.min(p2, bVar.mo56528a() - p);
            if (p > 0 && min > 0) {
                this.f49120i = true;
                if (this.f49112a == null && this.f49114c == null && this.f49113b == null) {
                    byte[] bArr = new byte[min];
                    bVar.skip((long) p);
                    bVar.read(bArr);
                    this.f49125n = bArr;
                }
                this.f49123l = p;
                this.f49124m = min;
            }
            if (f49076w) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(p);
                sb.append(", length: ");
                sb.append(min);
            }
        }
    }

    /* renamed from: R */
    public final void mo56476R(C19137b bVar, HashMap hashMap) throws IOException {
        C19137b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C19139d dVar = (C19139d) hashMap2.get(f48755K);
        C19139d dVar2 = (C19139d) hashMap2.get(f48773M);
        if (dVar != null && dVar2 != null) {
            long[] g = m89549g(dVar.mo56563r(this.f49119h));
            long[] g2 = m89549g(dVar2.mo56563r(this.f49119h));
            if (g != null && g.length != 0 && g2 != null && g2.length != 0 && g.length == g2.length) {
                long j = 0;
                for (long j2 : g2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f49122k = true;
                this.f49121j = true;
                this.f49120i = true;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < g.length) {
                    int i5 = (int) g[i2];
                    int i6 = (int) g2[i2];
                    if (i2 < g.length - 1 && ((long) (i5 + i6)) != g[i2 + 1]) {
                        this.f49122k = false;
                    }
                    int i7 = i5 - i3;
                    if (i7 >= 0) {
                        long j3 = (long) i7;
                        if (bVar2.skip(j3) != j3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to skip ");
                            sb.append(i7);
                            sb.append(" bytes.");
                            return;
                        }
                        int i8 = i3 + i7;
                        byte[] bArr2 = new byte[i6];
                        if (bVar2.read(bArr2) != i6) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to read ");
                            sb2.append(i6);
                            sb2.append(" bytes.");
                            return;
                        }
                        i3 = i8 + i6;
                        System.arraycopy(bArr2, 0, bArr, i4, i6);
                        i4 += i6;
                        i2++;
                    } else {
                        return;
                    }
                }
                this.f49125n = bArr;
                if (this.f49122k) {
                    this.f49123l = (int) g[0];
                    this.f49124m = i;
                }
            }
        }
    }

    /* renamed from: S */
    public boolean mo56477S(@C0359n0 String str) {
        return mo56517w(str) != null;
    }

    /* renamed from: T */
    public boolean mo56478T() {
        return this.f49120i;
    }

    /* renamed from: U */
    public final void mo56479U(String str) throws IOException {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f49114c = null;
            this.f49112a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m89547d0(fileInputStream2.getFD())) {
                        this.f49113b = fileInputStream2.getFD();
                    } else {
                        this.f49113b = null;
                    }
                    mo56495k0(fileInputStream2);
                    m89546d(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m89546d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m89546d(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: W */
    public boolean mo56480W() {
        int r = mo56507r(f48683C, 1);
        if (r == 2 || r == 7 || r == 4 || r == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0090, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x008c */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0096  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56481X(byte[] r15) throws java.io.IOException {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x008c }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008c }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f48725G5     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r10 = r8
        L_0x0035:
            int r7 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r7 = 0
            r9 = r0
            r10 = r9
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f48734H5     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r9 = r12
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f48743I5     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r10 = r12
        L_0x0077:
            if (r9 == 0) goto L_0x007f
            if (r10 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r7 = r7 + r5
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x0093
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x0094
        L_0x0088:
            r1 = r2
            goto L_0x008c
        L_0x008a:
            r15 = move-exception
            goto L_0x0094
        L_0x008c:
            boolean r15 = f49076w     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0093
            r1.close()
        L_0x0093:
            return r0
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.close()
        L_0x0099:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56481X(byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56482Z(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.mo56502o0(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f49119h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo56533f(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56482Z(byte[]):boolean");
    }

    /* renamed from: a */
    public final void mo56483a() {
        String o = mo56501o(f48995m0);
        if (o != null && mo56501o(f48845U) == null) {
            this.f49117f[0].put(f48845U, C19139d.m89646h(o));
        }
        if (mo56501o(f49085x) == null) {
            this.f49117f[0].put(f49085x, C19139d.m89647i(0, this.f49119h));
        }
        if (mo56501o(f49094y) == null) {
            this.f49117f[0].put(f49094y, C19139d.m89647i(0, this.f49119h));
        }
        if (mo56501o(f48683C) == null) {
            this.f49117f[0].put(f48683C, C19139d.m89647i(0, this.f49119h));
        }
        if (mo56501o(f48792O0) == null) {
            this.f49117f[1].put(f48792O0, C19139d.m89647i(0, this.f49119h));
        }
    }

    /* renamed from: a0 */
    public final boolean mo56484a0(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f48833S5;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: b0 */
    public final boolean mo56485b0(byte[] bArr) throws IOException {
        byte[] bytes = f48707E5.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56486c0(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.mo56502o0(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f49119h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo56533f(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56486c0(byte[]):boolean");
    }

    /* renamed from: e */
    public final String mo56487e(double d) {
        long j = (long) d;
        double d2 = d - ((double) j);
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (((double) j2) / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    /* renamed from: e0 */
    public final boolean mo56488e0(HashMap hashMap) throws IOException {
        C19139d dVar;
        C19139d dVar2 = (C19139d) hashMap.get(f49103z);
        if (dVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) dVar2.mo56563r(this.f49119h);
        int[] iArr2 = f49040r5;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f49115d != 3 || (dVar = (C19139d) hashMap.get(f48674B)) == null) {
            return false;
        }
        int p = dVar.mo56561p(this.f49119h);
        if ((p != 1 || !Arrays.equals(iArr, f49056t5)) && (p != 6 || !Arrays.equals(iArr, iArr2))) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final boolean mo56489f0() {
        int i = this.f49115d;
        return i == 4 || i == 13 || i == 14;
    }

    /* renamed from: h0 */
    public final boolean mo56490h0(HashMap hashMap) throws IOException {
        C19139d dVar = (C19139d) hashMap.get(f49094y);
        C19139d dVar2 = (C19139d) hashMap.get(f49085x);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        int p = dVar.mo56561p(this.f49119h);
        int p2 = dVar2.mo56561p(this.f49119h);
        if (p > 512 || p2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: i0 */
    public boolean mo56491i0() {
        if (!this.f49120i) {
            return false;
        }
        int i = this.f49126o;
        if (i == 6 || i == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo56492j(C19137b bVar, C19138c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f48986k7;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            mo56494k(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: j0 */
    public final boolean mo56493j0(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f48887Y5;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f48896Z5;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f48887Y5.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: k */
    public final void mo56494k(C19137b bVar, C19138c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.mo56554c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        m89552i(bVar, cVar, readInt);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:47|48|49|(1:71)) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5 = f49076w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        mo56483a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        mo56483a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        if (f49076w != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b0, code lost:
        mo56500n0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x009e */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56495k0(@androidx.annotation.C0359n0 java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00b4
            r0 = 0
            r1 = r0
        L_0x0004:
            androidx.exifinterface.media.a$f[][] r2 = f48922c7     // Catch:{ IOException -> 0x009e }
            int r2 = r2.length     // Catch:{ IOException -> 0x009e }
            if (r1 >= r2) goto L_0x0015
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r4.f49117f     // Catch:{ IOException -> 0x009e }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x009e }
            r3.<init>()     // Catch:{ IOException -> 0x009e }
            r2[r1] = r3     // Catch:{ IOException -> 0x009e }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            boolean r1 = r4.f49116e     // Catch:{ IOException -> 0x009e }
            if (r1 != 0) goto L_0x0027
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x009e }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x009e }
            int r5 = r4.mo56455C(r1)     // Catch:{ IOException -> 0x009e }
            r4.f49115d = r5     // Catch:{ IOException -> 0x009e }
            r5 = r1
        L_0x0027:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x009e }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x009e }
            boolean r5 = r4.f49116e     // Catch:{ IOException -> 0x009e }
            if (r5 != 0) goto L_0x0088
            int r5 = r4.f49115d     // Catch:{ IOException -> 0x009e }
            switch(r5) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0084;
                case 2: goto L_0x0084;
                case 3: goto L_0x0084;
                case 4: goto L_0x0076;
                case 5: goto L_0x0084;
                case 6: goto L_0x0084;
                case 7: goto L_0x0072;
                case 8: goto L_0x0084;
                case 9: goto L_0x0064;
                case 10: goto L_0x0056;
                case 11: goto L_0x0084;
                case 12: goto L_0x0052;
                case 13: goto L_0x0044;
                case 14: goto L_0x0036;
                default: goto L_0x0035;
            }     // Catch:{ IOException -> 0x009e }
        L_0x0035:
            goto L_0x008b
        L_0x0036:
            r4.mo56474O(r1)     // Catch:{ IOException -> 0x009e }
            r4.mo56483a()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x0043
            r4.mo56500n0()
        L_0x0043:
            return
        L_0x0044:
            r4.mo56459E(r1)     // Catch:{ IOException -> 0x009e }
            r4.mo56483a()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x0051
            r4.mo56500n0()
        L_0x0051:
            return
        L_0x0052:
            r4.mo56521y(r1)     // Catch:{ IOException -> 0x009e }
            goto L_0x008b
        L_0x0056:
            r4.mo56466I(r1)     // Catch:{ IOException -> 0x009e }
            r4.mo56483a()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x0063
            r4.mo56500n0()
        L_0x0063:
            return
        L_0x0064:
            r4.mo56461F(r1)     // Catch:{ IOException -> 0x009e }
            r4.mo56483a()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x0071
            r4.mo56500n0()
        L_0x0071:
            return
        L_0x0072:
            r4.mo56457D(r1)     // Catch:{ IOException -> 0x009e }
            goto L_0x008b
        L_0x0076:
            r4.mo56523z(r1, r0, r0)     // Catch:{ IOException -> 0x009e }
            r4.mo56483a()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x0083
            r4.mo56500n0()
        L_0x0083:
            return
        L_0x0084:
            r4.mo56462G(r1)     // Catch:{ IOException -> 0x009e }
            goto L_0x008b
        L_0x0088:
            r4.mo56468J(r1)     // Catch:{ IOException -> 0x009e }
        L_0x008b:
            int r5 = r4.f49127p     // Catch:{ IOException -> 0x009e }
            long r2 = (long) r5     // Catch:{ IOException -> 0x009e }
            r1.mo56532d(r2)     // Catch:{ IOException -> 0x009e }
            r4.mo56460E0(r1)     // Catch:{ IOException -> 0x009e }
            r4.mo56483a()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x00a8
            goto L_0x00a5
        L_0x009c:
            r5 = move-exception
            goto L_0x00a9
        L_0x009e:
            boolean r5 = f49076w     // Catch:{ all -> 0x009c }
            r4.mo56483a()
            if (r5 == 0) goto L_0x00a8
        L_0x00a5:
            r4.mo56500n0()
        L_0x00a8:
            return
        L_0x00a9:
            r4.mo56483a()
            boolean r0 = f49076w
            if (r0 == 0) goto L_0x00b3
            r4.mo56500n0()
        L_0x00b3:
            throw r5
        L_0x00b4:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56495k0(java.io.InputStream):void");
    }

    /* renamed from: l */
    public void mo56496l() {
        int i = 1;
        switch (mo56507r(f48683C, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        mo56452A0(f48683C, Integer.toString(i));
    }

    /* renamed from: m */
    public void mo56497m() {
        int i = 1;
        switch (mo56507r(f48683C, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        mo56452A0(f48683C, Integer.toString(i));
    }

    /* renamed from: m0 */
    public final void mo56498m0(C19137b bVar, int i) throws IOException {
        ByteOrder o0 = mo56502o0(bVar);
        this.f49119h = o0;
        bVar.mo56533f(o0);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f49115d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && bVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: n */
    public double mo56499n(double d) {
        double q = mo56505q(f48694D1, -1.0d);
        int i = -1;
        int r = mo56507r(f48685C1, -1);
        if (q < 0.0d || r < 0) {
            return d;
        }
        if (r != 1) {
            i = 1;
        }
        return q * ((double) i);
    }

    /* renamed from: n0 */
    public final void mo56500n0() {
        for (int i = 0; i < this.f49117f.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f49117f[i].size());
            for (Map.Entry next : this.f49117f[i].entrySet()) {
                C19139d dVar = (C19139d) next.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) next.getKey());
                sb2.append(", tagType: ");
                sb2.append(dVar.toString());
                sb2.append(", tagValue: '");
                sb2.append(dVar.mo56562q(this.f49119h));
                sb2.append("'");
            }
        }
    }

    @C0363p0
    /* renamed from: o */
    public String mo56501o(@C0359n0 String str) {
        if (str != null) {
            C19139d w = mo56517w(str);
            if (w != null) {
                if (!f48970i7.contains(str)) {
                    return w.mo56562q(this.f49119h);
                }
                if (str.equals(f48703E1)) {
                    int i = w.f49145a;
                    if (i == 5 || i == 10) {
                        C19143h[] hVarArr = (C19143h[]) w.mo56563r(this.f49119h);
                        if (hVarArr == null || hVarArr.length != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid GPS Timestamp array. array=");
                            sb.append(Arrays.toString(hVarArr));
                            return null;
                        }
                        C19143h hVar = hVarArr[0];
                        C19143h hVar2 = hVarArr[1];
                        C19143h hVar3 = hVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) hVar.f49153a) / ((float) hVar.f49154b))), Integer.valueOf((int) (((float) hVar2.f49153a) / ((float) hVar2.f49154b))), Integer.valueOf((int) (((float) hVar3.f49153a) / ((float) hVar3.f49154b)))});
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GPS Timestamp format is not rational. format=");
                    sb2.append(w.f49145a);
                    return null;
                }
                try {
                    return Double.toString(w.mo56560o(this.f49119h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: o0 */
    public final ByteOrder mo56502o0(C19137b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    @C0363p0
    /* renamed from: p */
    public byte[] mo56503p(@C0359n0 String str) {
        if (str != null) {
            C19139d w = mo56517w(str);
            if (w != null) {
                return w.f49148d;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: p0 */
    public final void mo56504p0(byte[] bArr, int i) throws IOException {
        C19137b bVar = new C19137b(bArr);
        mo56498m0(bVar, bArr.length);
        mo56506q0(bVar, i);
    }

    /* renamed from: q */
    public double mo56505q(@C0359n0 String str, double d) {
        if (str != null) {
            C19139d w = mo56517w(str);
            if (w == null) {
                return d;
            }
            try {
                return w.mo56560o(this.f49119h);
            } catch (NumberFormatException unused) {
                return d;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024b  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56506q0(androidx.exifinterface.media.C19135a.C19137b r30, int r31) throws java.io.IOException {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.f49118g
            int r4 = r1.f49141d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f49141d
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.f49140c
            if (r3 <= r5) goto L_0x001a
            return
        L_0x001a:
            short r3 = r30.readShort()
            boolean r5 = f49076w
            if (r5 == 0) goto L_0x002f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r5.append(r6)
            r5.append(r3)
        L_0x002f:
            int r5 = r1.f49141d
            int r6 = r3 * 12
            int r5 = r5 + r6
            int r6 = r1.f49140c
            if (r5 > r6) goto L_0x038d
            if (r3 > 0) goto L_0x003c
            goto L_0x038d
        L_0x003c:
            r5 = 0
            r6 = r5
        L_0x003e:
            r7 = 5
            r10 = 1
            if (r6 >= r3) goto L_0x0316
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.mo56530b()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.a$f>[] r14 = f48954g7
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            androidx.exifinterface.media.a$f r11 = (androidx.exifinterface.media.C19135a.C19141f) r11
            boolean r14 = f49076w
            r4 = 3
            if (r14 == 0) goto L_0x0095
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r22 = java.lang.Integer.valueOf(r31)
            r7[r5] = r22
            java.lang.Integer r22 = java.lang.Integer.valueOf(r12)
            r7[r10] = r22
            if (r11 == 0) goto L_0x007d
            java.lang.String r10 = r11.f49150b
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r21 = 2
            r7[r21] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r7[r4] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r10
            java.lang.String r10 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r10, r7)
        L_0x0095:
            r7 = 7
            if (r11 != 0) goto L_0x00ab
            if (r14 == 0) goto L_0x00a7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r5 = "Skip the tag entry since tag number is not defined: "
            r10.append(r5)
            r10.append(r12)
        L_0x00a7:
            r23 = r8
            goto L_0x0114
        L_0x00ab:
            if (r13 <= 0) goto L_0x0103
            int[] r5 = f48726G6
            int r10 = r5.length
            if (r13 < r10) goto L_0x00b3
            goto L_0x0103
        L_0x00b3:
            boolean r10 = r11.mo56566a(r13)
            if (r10 != 0) goto L_0x00d7
            if (r14 == 0) goto L_0x00a7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r5.append(r10)
            java.lang.String[] r10 = f48717F6
            r10 = r10[r13]
            r5.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r5.append(r10)
            java.lang.String r10 = r11.f49150b
            r5.append(r10)
            goto L_0x00a7
        L_0x00d7:
            if (r13 != r7) goto L_0x00db
            int r13 = r11.f49151c
        L_0x00db:
            r23 = r8
            long r7 = (long) r15
            r5 = r5[r13]
            long r9 = (long) r5
            long r7 = r7 * r9
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x00f2
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r5 = 1
            goto L_0x0117
        L_0x00f2:
            if (r14 == 0) goto L_0x0101
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r5.append(r9)
            r5.append(r15)
        L_0x0101:
            r5 = 0
            goto L_0x0117
        L_0x0103:
            r23 = r8
            if (r14 == 0) goto L_0x0114
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r5.append(r7)
            r5.append(r13)
        L_0x0114:
            r5 = 0
            r7 = 0
        L_0x0117:
            if (r5 != 0) goto L_0x0125
            r9 = r23
            r1.mo56532d(r9)
            r24 = r3
            r26 = r6
        L_0x0122:
            r11 = 2
            goto L_0x030d
        L_0x0125:
            r9 = r23
            int r5 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            java.lang.String r4 = "Compression"
            if (r5 <= 0) goto L_0x01cd
            int r5 = r30.readInt()
            r24 = r3
            if (r14 == 0) goto L_0x0145
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r26 = r6
            java.lang.String r6 = "seek to data offset: "
            r3.append(r6)
            r3.append(r5)
            goto L_0x0147
        L_0x0145:
            r26 = r6
        L_0x0147:
            int r3 = r0.f49115d
            r6 = 7
            if (r3 != r6) goto L_0x01a4
            java.lang.String r3 = r11.f49150b
            java.lang.String r6 = "MakerNote"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0159
            r0.f49128q = r5
            goto L_0x01a4
        L_0x0159:
            r3 = 6
            if (r2 != r3) goto L_0x01a4
            java.lang.String r6 = "ThumbnailImage"
            java.lang.String r3 = r11.f49150b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x01a4
            r0.f49129r = r5
            r0.f49130s = r15
            java.nio.ByteOrder r3 = r0.f49119h
            r6 = 6
            androidx.exifinterface.media.a$d r3 = androidx.exifinterface.media.C19135a.C19139d.m89651m(r6, r3)
            int r6 = r0.f49129r
            r25 = r11
            r18 = r12
            long r11 = (long) r6
            java.nio.ByteOrder r6 = r0.f49119h
            androidx.exifinterface.media.a$d r6 = androidx.exifinterface.media.C19135a.C19139d.m89647i(r11, r6)
            int r11 = r0.f49130s
            long r11 = (long) r11
            r19 = r15
            java.nio.ByteOrder r15 = r0.f49119h
            androidx.exifinterface.media.a$d r11 = androidx.exifinterface.media.C19135a.C19139d.m89647i(r11, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r12 = r0.f49117f
            r15 = 4
            r12 = r12[r15]
            r12.put(r4, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r15]
            java.lang.String r12 = "JPEGInterchangeFormat"
            r3.put(r12, r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r15]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r3.put(r6, r11)
            goto L_0x01aa
        L_0x01a4:
            r25 = r11
            r18 = r12
            r19 = r15
        L_0x01aa:
            long r11 = (long) r5
            long r27 = r11 + r7
            int r3 = r1.f49140c
            r6 = r4
            long r3 = (long) r3
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01b9
            r1.mo56532d(r11)
            goto L_0x01d8
        L_0x01b9:
            if (r14 == 0) goto L_0x01c8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r5)
        L_0x01c8:
            r1.mo56532d(r9)
            goto L_0x0122
        L_0x01cd:
            r24 = r3
            r26 = r6
            r25 = r11
            r18 = r12
            r19 = r15
            r6 = r4
        L_0x01d8:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = f48978j7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x01fb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "nextIfdType: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = " byteCount: "
            r4.append(r5)
            r4.append(r7)
        L_0x01fb:
            r4 = 8
            if (r3 == 0) goto L_0x0294
            r5 = 3
            if (r13 == r5) goto L_0x0221
            r5 = 4
            if (r13 == r5) goto L_0x021c
            if (r13 == r4) goto L_0x0217
            r4 = 9
            if (r13 == r4) goto L_0x0212
            r4 = 13
            if (r13 == r4) goto L_0x0212
            r4 = -1
            goto L_0x0226
        L_0x0212:
            int r4 = r30.readInt()
            goto L_0x0225
        L_0x0217:
            short r4 = r30.readShort()
            goto L_0x0225
        L_0x021c:
            long r4 = r30.mo56531c()
            goto L_0x0226
        L_0x0221:
            int r4 = r30.readUnsignedShort()
        L_0x0225:
            long r4 = (long) r4
        L_0x0226:
            r11 = 2
            if (r14 == 0) goto L_0x023e
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r8 = 0
            r6[r8] = r7
            r12 = r25
            java.lang.String r7 = r12.f49150b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String.format(r7, r6)
        L_0x023e:
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0280
            int r6 = r1.f49140c
            long r6 = (long) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0280
            java.util.Set<java.lang.Integer> r6 = r0.f49118g
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0263
            r1.mo56532d(r4)
            int r3 = r3.intValue()
            r0.mo56506q0(r1, r3)
            goto L_0x028f
        L_0x0263:
            if (r14 == 0) goto L_0x028f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " (at "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ")"
            r6.append(r3)
            goto L_0x028f
        L_0x0280:
            if (r14 == 0) goto L_0x028f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
        L_0x028f:
            r1.mo56532d(r9)
            goto L_0x030d
        L_0x0294:
            r12 = r25
            r11 = 2
            int r3 = r30.mo56530b()
            int r5 = r0.f49127p
            int r3 = r3 + r5
            int r5 = (int) r7
            byte[] r5 = new byte[r5]
            r1.readFully(r5)
            androidx.exifinterface.media.a$d r7 = new androidx.exifinterface.media.a$d
            long r14 = (long) r3
            r17 = r14
            r14 = r7
            r3 = r19
            r15 = r13
            r16 = r3
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f49117f
            r3 = r3[r2]
            java.lang.String r5 = r12.f49150b
            r3.put(r5, r7)
            java.lang.String r3 = "DNGVersion"
            java.lang.String r5 = r12.f49150b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02ca
            r3 = 3
            r0.f49115d = r3
        L_0x02ca:
            java.lang.String r3 = "Make"
            java.lang.String r5 = r12.f49150b
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02de
            java.lang.String r3 = "Model"
            java.lang.String r5 = r12.f49150b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02ec
        L_0x02de:
            java.nio.ByteOrder r3 = r0.f49119h
            java.lang.String r3 = r7.mo56562q(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x02ff
        L_0x02ec:
            java.lang.String r3 = r12.f49150b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0301
            java.nio.ByteOrder r3 = r0.f49119h
            int r3 = r7.mo56561p(r3)
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r5) goto L_0x0301
        L_0x02ff:
            r0.f49115d = r4
        L_0x0301:
            int r3 = r30.mo56530b()
            long r3 = (long) r3
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x030d
            r1.mo56532d(r9)
        L_0x030d:
            int r6 = r26 + 1
            short r6 = (short) r6
            r4 = r11
            r3 = r24
            r5 = 0
            goto L_0x003e
        L_0x0316:
            int r2 = r30.mo56530b()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f49140c
            if (r2 > r3) goto L_0x038d
            int r2 = r30.readInt()
            boolean r3 = f49076w
            if (r3 == 0) goto L_0x0337
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String.format(r5, r4)
        L_0x0337:
            long r4 = (long) r2
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x037e
            int r6 = r1.f49140c
            if (r2 >= r6) goto L_0x037e
            java.util.Set<java.lang.Integer> r6 = r0.f49118g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x036e
            r1.mo56532d(r4)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f49117f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0360
            r0.mo56506q0(r1, r3)
            goto L_0x038d
        L_0x0360:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f49117f
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x038d
            r0.mo56506q0(r1, r7)
            goto L_0x038d
        L_0x036e:
            if (r3 == 0) goto L_0x038d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            goto L_0x038d
        L_0x037e:
            if (r3 == 0) goto L_0x038d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
        L_0x038d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56506q0(androidx.exifinterface.media.a$b, int):void");
    }

    /* renamed from: r */
    public int mo56507r(@C0359n0 String str, int i) {
        if (str != null) {
            C19139d w = mo56517w(str);
            if (w == null) {
                return i;
            }
            try {
                return w.mo56561p(this.f49119h);
            } catch (NumberFormatException unused) {
                return i;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    /* renamed from: r0 */
    public final void mo56508r0(String str) {
        for (int i = 0; i < f48922c7.length; i++) {
            this.f49117f[i].remove(str);
        }
    }

    @C0363p0
    /* renamed from: s */
    public long[] mo56509s(@C0359n0 String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        } else if (!this.f49131t) {
            C19139d w = mo56517w(str);
            if (w == null) {
                return null;
            }
            return new long[]{w.f49147c, (long) w.f49148d.length};
        } else {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
    }

    /* renamed from: s0 */
    public void mo56510s0() {
        mo56452A0(f48683C, Integer.toString(1));
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: t */
    public Long mo56511t() {
        return m89553l0(mo56501o(f48845U), mo56501o(f49035r0), mo56501o(f49011o0));
    }

    /* renamed from: t0 */
    public final void mo56512t0(C19137b bVar, int i) throws IOException {
        C19139d dVar = this.f49117f[i].get(f49094y);
        C19139d dVar2 = this.f49117f[i].get(f49085x);
        if (dVar == null || dVar2 == null) {
            C19139d dVar3 = this.f49117f[i].get(f48782N);
            C19139d dVar4 = this.f49117f[i].get(f48791O);
            if (dVar3 != null && dVar4 != null) {
                int p = dVar3.mo56561p(this.f49119h);
                int p2 = dVar3.mo56561p(this.f49119h);
                bVar.mo56532d((long) p);
                byte[] bArr = new byte[p2];
                bVar.read(bArr);
                mo56523z(new C19137b(bArr), p, i);
            }
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: u */
    public Long mo56513u() {
        return m89553l0(mo56501o(f49003n0), mo56501o(f49051t0), mo56501o(f49027q0));
    }

    /* renamed from: u0 */
    public void mo56514u0(int i) {
        if (i % 90 == 0) {
            int r = mo56507r(f48683C, 1);
            List<Integer> list = f48776M2;
            int i2 = 0;
            if (list.contains(Integer.valueOf(r))) {
                int indexOf = (list.indexOf(Integer.valueOf(r)) + (i / 90)) % 4;
                if (indexOf < 0) {
                    i2 = 4;
                }
                i2 = list.get(indexOf + i2).intValue();
            } else {
                List<Integer> list2 = f48785N2;
                if (list2.contains(Integer.valueOf(r))) {
                    int indexOf2 = (list2.indexOf(Integer.valueOf(r)) + (i / 90)) % 4;
                    if (indexOf2 < 0) {
                        i2 = 4;
                    }
                    i2 = list2.get(indexOf2 + i2).intValue();
                }
            }
            mo56452A0(f48683C, Integer.toString(i2));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: v */
    public Long mo56515v() {
        return m89553l0(mo56501o(f48995m0), mo56501o(f49043s0), mo56501o(f49019p0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        r9 = null;
        r1 = r6;
        r6 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        r8 = null;
        r9 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cd, code lost:
        android.system.Os.lseek(r13.f49113b, 0, android.system.OsConstants.SEEK_SET);
        r1 = new java.io.FileOutputStream(r13.f49113b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00dc, code lost:
        r1 = new java.io.FileOutputStream(r13.f49112a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x012e, code lost:
        r2.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cd A[Catch:{ Exception -> 0x00f7, all -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dc A[Catch:{ Exception -> 0x00f7, all -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012e  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56516v0() throws java.io.IOException {
        /*
            r13 = this;
            boolean r0 = r13.mo56489f0()
            if (r0 == 0) goto L_0x0153
            java.io.FileDescriptor r0 = r13.f49113b
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r13.f49112a
            if (r0 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0017:
            r0 = 1
            r13.f49131t = r0
            byte[] r1 = r13.mo56470K()
            r13.f49125n = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            java.lang.String r3 = r13.f49112a     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            r4 = 0
            if (r3 == 0) goto L_0x0037
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            java.lang.String r6 = r13.f49112a     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            goto L_0x0045
        L_0x0037:
            java.io.FileDescriptor r3 = r13.f49113b     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            android.system.Os.lseek(r3, r4, r6)     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            java.io.FileDescriptor r6 = r13.f49113b     // Catch:{ Exception -> 0x0141, all -> 0x013e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0141, all -> 0x013e }
        L_0x0045:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x013a, all -> 0x0136 }
            m89551h(r3, r6)     // Catch:{ Exception -> 0x0134, all -> 0x0132 }
            m89546d(r3)
            m89546d(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            r6.<init>(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00bb }
            java.lang.String r7 = r13.f49112a     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            if (r7 == 0) goto L_0x0065
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            java.lang.String r8 = r13.f49112a     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            goto L_0x0073
        L_0x0065:
            java.io.FileDescriptor r7 = r13.f49113b     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            int r8 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            android.system.Os.lseek(r7, r4, r8)     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            java.io.FileDescriptor r8 = r13.f49113b     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00b6, all -> 0x00bb }
        L_0x0073:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00b0, all -> 0x00bb }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00b0, all -> 0x00bb }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00aa, all -> 0x00a6 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00aa, all -> 0x00a6 }
            int r10 = r13.f49115d     // Catch:{ Exception -> 0x00a1 }
            r11 = 4
            if (r10 != r11) goto L_0x0086
            r13.mo56518w0(r8, r9)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0095
        L_0x0086:
            r11 = 13
            if (r10 != r11) goto L_0x008e
            r13.mo56520x0(r8, r9)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x0095
        L_0x008e:
            r11 = 14
            if (r10 != r11) goto L_0x0095
            r13.mo56522y0(r8, r9)     // Catch:{ Exception -> 0x00a1 }
        L_0x0095:
            m89546d(r8)
            m89546d(r9)
            r2.delete()
            r13.f49125n = r1
            return
        L_0x00a1:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto L_0x00c4
        L_0x00a6:
            r0 = move-exception
            r9 = r1
            goto L_0x0125
        L_0x00aa:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto L_0x00c4
        L_0x00b0:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto L_0x00c4
        L_0x00b6:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
            goto L_0x00c2
        L_0x00bb:
            r0 = move-exception
            r9 = r1
            goto L_0x0126
        L_0x00bf:
            r7 = move-exception
            r8 = r1
            r9 = r8
        L_0x00c2:
            r6 = r7
            r7 = r9
        L_0x00c4:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00fb, all -> 0x00f9 }
            r10.<init>(r2)     // Catch:{ Exception -> 0x00fb, all -> 0x00f9 }
            java.lang.String r1 = r13.f49112a     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            if (r1 != 0) goto L_0x00dc
            java.io.FileDescriptor r1 = r13.f49113b     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            android.system.Os.lseek(r1, r4, r11)     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            java.io.FileDescriptor r4 = r13.f49113b     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            goto L_0x00e3
        L_0x00dc:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            java.lang.String r4 = r13.f49112a     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
        L_0x00e3:
            r7 = r1
            m89551h(r10, r7)     // Catch:{ Exception -> 0x00f7, all -> 0x00f5 }
            m89546d(r10)     // Catch:{ all -> 0x0124 }
            m89546d(r7)     // Catch:{ all -> 0x0124 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x00f5:
            r0 = move-exception
            goto L_0x011c
        L_0x00f7:
            r1 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            goto L_0x011d
        L_0x00fb:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L_0x00fe:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r4.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ all -> 0x0119 }
            r4.append(r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0119 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0119 }
            throw r3     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x011c:
            r1 = r10
        L_0x011d:
            m89546d(r1)     // Catch:{ all -> 0x0124 }
            m89546d(r7)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
        L_0x0125:
            r1 = r8
        L_0x0126:
            m89546d(r1)
            m89546d(r9)
            if (r3 != 0) goto L_0x0131
            r2.delete()
        L_0x0131:
            throw r0
        L_0x0132:
            r0 = move-exception
            goto L_0x0138
        L_0x0134:
            r0 = move-exception
            goto L_0x013c
        L_0x0136:
            r0 = move-exception
            r6 = r1
        L_0x0138:
            r1 = r3
            goto L_0x014c
        L_0x013a:
            r0 = move-exception
            r6 = r1
        L_0x013c:
            r1 = r3
            goto L_0x0143
        L_0x013e:
            r0 = move-exception
            r6 = r1
            goto L_0x014c
        L_0x0141:
            r0 = move-exception
            r6 = r1
        L_0x0143:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x014b }
            throw r2     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
        L_0x014c:
            m89546d(r1)
            m89546d(r6)
            throw r0
        L_0x0153:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56516v0():void");
    }

    @C0363p0
    /* renamed from: w */
    public final C19139d mo56517w(@C0359n0 String str) {
        if (str != null) {
            if (f49095y0.equals(str)) {
                str = f49104z0;
            }
            for (int i = 0; i < f48922c7.length; i++) {
                C19139d dVar = this.f49117f[i].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: w0 */
    public final void mo56518w0(InputStream inputStream, OutputStream outputStream) throws IOException {
        C19139d dVar;
        if (f49076w) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJpegAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C19138c cVar = new C19138c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.mo56553b(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.mo56553b(-40);
                if (mo56501o(f49053t2) == null || !this.f49132u) {
                    dVar = null;
                } else {
                    dVar = this.f49117f[0].remove(f49053t2);
                }
                cVar.mo56553b(-1);
                cVar.mo56553b(-31);
                mo56469J0(cVar);
                if (dVar != null) {
                    this.f49117f[0].put(f49053t2, dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.mo56553b(-1);
                        cVar.mo56553b(readByte);
                        m89551h(dataInputStream, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.mo56553b(-1);
                        cVar.mo56553b(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        cVar.mo56557g(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f48994l7)) {
                                    int i2 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i2) != i2) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            cVar.mo56553b(-1);
                            cVar.mo56553b(readByte);
                            cVar.mo56557g(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    @C0363p0
    @SuppressLint({"AutoBoxing"})
    /* renamed from: x */
    public Long mo56519x() {
        String o = mo56501o(f48901a2);
        String o2 = mo56501o(f48703E1);
        if (!(o == null || o2 == null)) {
            Pattern pattern = f48862V7;
            if (pattern.matcher(o).matches() || pattern.matcher(o2).matches()) {
                String str = o + ' ' + o2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date parse = f49001m6.parse(str, parsePosition);
                    if (parse == null && (parse = f49009n6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(parse.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: x0 */
    public final void mo56520x0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f49076w) {
            StringBuilder sb = new StringBuilder();
            sb.append("savePngAttributes starting with (inputStream: ");
            sb.append(inputStream);
            sb.append(", outputStream: ");
            sb.append(outputStream);
            sb.append(")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C19138c cVar = new C19138c(outputStream, byteOrder);
        byte[] bArr = f48833S5;
        m89552i(dataInputStream, cVar, bArr.length);
        int i = this.f49127p;
        if (i == 0) {
            int readInt = dataInputStream.readInt();
            cVar.mo56554c(readInt);
            m89552i(dataInputStream, cVar, readInt + 4 + 4);
        } else {
            m89552i(dataInputStream, cVar, ((i - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C19138c cVar2 = new C19138c(byteArrayOutputStream2, byteOrder);
                mo56469J0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f49142a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.mo56554c((int) crc32.getValue());
                m89546d(byteArrayOutputStream2);
                m89551h(dataInputStream, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                m89546d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m89546d(byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: y */
    public final void mo56521y(C19137b bVar) throws IOException {
        String str;
        String str2;
        String str3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C19136a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f49117f[0].put(f49085x, C19139d.m89651m(Integer.parseInt(str3), this.f49119h));
            }
            if (str2 != null) {
                this.f49117f[0].put(f49094y, C19139d.m89651m(Integer.parseInt(str2), this.f49119h));
            }
            if (str != null) {
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt != 270) {
                    i = 1;
                } else {
                    i = 8;
                }
                this.f49117f[0].put(f48683C, C19139d.m89651m(i, this.f49119h));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.mo56532d((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f48994l7)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                this.f49127p = i2;
                                mo56504p0(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f49076w) {
                StringBuilder sb = new StringBuilder();
                sb.append("Heif meta: ");
                sb.append(str3);
                sb.append("x");
                sb.append(str2);
                sb.append(", rotation ");
                sb.append(str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* renamed from: y0 */
    public final void mo56522y0(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (f49076w) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveWebpAttributes starting with (inputStream: ");
            sb.append(inputStream2);
            sb.append(", outputStream: ");
            sb.append(outputStream2);
            sb.append(")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C19137b bVar = new C19137b(inputStream2, byteOrder);
        C19138c cVar = new C19138c(outputStream2, byteOrder);
        byte[] bArr = f48887Y5;
        m89552i(bVar, cVar, bArr.length);
        byte[] bArr2 = f48896Z5;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C19138c cVar2 = new C19138c(byteArrayOutputStream2, byteOrder);
                int i7 = this.f49127p;
                if (i7 != 0) {
                    m89552i(bVar, cVar2, ((i7 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                    bVar.skipBytes(4);
                    bVar.skipBytes(bVar.readInt());
                    mo56469J0(cVar2);
                } else {
                    byte[] bArr3 = new byte[4];
                    if (bVar.read(bArr3) == 4) {
                        byte[] bArr4 = f48937e6;
                        boolean z = false;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int readInt = bVar.readInt();
                            if (readInt % 2 == 1) {
                                i6 = readInt + 1;
                            } else {
                                i6 = readInt;
                            }
                            byte[] bArr5 = new byte[i6];
                            bVar.read(bArr5);
                            byte b = (byte) (8 | bArr5[0]);
                            bArr5[0] = b;
                            if (((b >> 1) & 1) == 1) {
                                z = true;
                            }
                            cVar2.write(bArr4);
                            cVar2.mo56554c(readInt);
                            cVar2.write(bArr5);
                            if (z) {
                                mo56492j(bVar, cVar2, f48961h6, (byte[]) null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream2.read(bArr6);
                                    if (!Arrays.equals(bArr6, f48969i6)) {
                                        break;
                                    }
                                    mo56494k(bVar, cVar2, bArr6);
                                }
                                mo56469J0(cVar2);
                            } else {
                                mo56492j(bVar, cVar2, f48953g6, f48945f6);
                                mo56469J0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = f48953g6;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f48945f6)) {
                                int readInt2 = bVar.readInt();
                                if (readInt2 % 2 == 1) {
                                    i = readInt2 + 1;
                                } else {
                                    i = readInt2;
                                }
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(f48921c6, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i5 = bVar.readInt();
                                    i4 = (i5 << 18) >> 18;
                                    i3 = (i5 << 2) >> 18;
                                    i -= 10;
                                    i2 = 0;
                                } else if (!Arrays.equals(bArr3, f48945f6)) {
                                    i5 = 0;
                                    i4 = 0;
                                    i3 = 0;
                                    i2 = 0;
                                } else if (bVar.readByte() == 47) {
                                    i5 = bVar.readInt();
                                    i2 = i5 & 8;
                                    i -= 5;
                                    i3 = ((i5 << 4) >> 18) + 1;
                                    i4 = ((i5 << 18) >> 18) + 1;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                                cVar2.write(bArr4);
                                cVar2.mo56554c(10);
                                byte[] bArr10 = new byte[10];
                                byte b2 = (byte) (bArr10[0] | 8);
                                bArr10[0] = b2;
                                bArr10[0] = (byte) (b2 | (i2 << 4));
                                int i8 = i4 - 1;
                                int i9 = i3 - 1;
                                bArr10[4] = (byte) i8;
                                bArr10[5] = (byte) (i8 >> 8);
                                bArr10[6] = (byte) (i8 >> 16);
                                bArr10[7] = (byte) i9;
                                bArr10[8] = (byte) (i9 >> 8);
                                bArr10[9] = (byte) (i9 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.mo56554c(readInt2);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(f48921c6);
                                    cVar2.mo56554c(i5);
                                } else if (Arrays.equals(bArr3, f48945f6)) {
                                    cVar2.write(47);
                                    cVar2.mo56554c(i5);
                                }
                                m89552i(bVar, cVar2, i);
                                mo56469J0(cVar2);
                            }
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                m89551h(bVar, cVar2);
                int size = byteArrayOutputStream2.size();
                byte[] bArr11 = f48896Z5;
                cVar.mo56554c(size + bArr11.length);
                cVar.write(bArr11);
                byteArrayOutputStream2.writeTo(cVar);
                m89546d(byteArrayOutputStream2);
            } catch (Exception e) {
                e = e;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    m89546d(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                m89546d(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d6 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56523z(androidx.exifinterface.media.C19135a.C19137b r20, int r21, int r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = f49076w
            if (r3 == 0) goto L_0x0017
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getJpegAttributes starting with: "
            r3.append(r4)
            r3.append(r1)
        L_0x0017:
            r3 = 0
            r1.mark(r3)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo56533f(r4)
            byte r4 = r20.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L_0x01c2
            byte r7 = r20.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01a7
            r4 = 2
            r5 = r4
        L_0x0033:
            byte r7 = r20.readByte()
            if (r7 != r6) goto L_0x018a
            r7 = 1
            int r5 = r5 + r7
            byte r8 = r20.readByte()
            boolean r9 = f49076w
            if (r9 == 0) goto L_0x0056
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
        L_0x0056:
            int r5 = r5 + r7
            r10 = -39
            if (r8 == r10) goto L_0x0184
            r10 = -38
            if (r8 != r10) goto L_0x0061
            goto L_0x0184
        L_0x0061:
            int r10 = r20.readUnsignedShort()
            int r10 = r10 - r4
            int r5 = r5 + r4
            if (r9 == 0) goto L_0x008b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "JPEG segment: "
            r9.append(r11)
            r11 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r9.append(r11)
            java.lang.String r11 = " (length: "
            r9.append(r11)
            int r11 = r10 + 2
            r9.append(r11)
            java.lang.String r11 = ")"
            r9.append(r11)
        L_0x008b:
            java.lang.String r9 = "Invalid length"
            if (r10 < 0) goto L_0x017e
            r11 = -31
            if (r8 == r11) goto L_0x010a
            r11 = -2
            if (r8 == r11) goto L_0x00de
            switch(r8) {
                case -64: goto L_0x00a4;
                case -63: goto L_0x00a4;
                case -62: goto L_0x00a4;
                case -61: goto L_0x00a4;
                default: goto L_0x0099;
            }
        L_0x0099:
            switch(r8) {
                case -59: goto L_0x00a4;
                case -58: goto L_0x00a4;
                case -57: goto L_0x00a4;
                default: goto L_0x009c;
            }
        L_0x009c:
            switch(r8) {
                case -55: goto L_0x00a4;
                case -54: goto L_0x00a4;
                case -53: goto L_0x00a4;
                default: goto L_0x009f;
            }
        L_0x009f:
            switch(r8) {
                case -51: goto L_0x00a4;
                case -50: goto L_0x00a4;
                case -49: goto L_0x00a4;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x0162
        L_0x00a4:
            int r8 = r1.skipBytes(r7)
            if (r8 != r7) goto L_0x00d6
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r0.f49117f
            r7 = r7[r2]
            int r8 = r20.readUnsignedShort()
            long r11 = (long) r8
            java.nio.ByteOrder r8 = r0.f49119h
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.C19135a.C19139d.m89647i(r11, r8)
            java.lang.String r11 = "ImageLength"
            r7.put(r11, r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r0.f49117f
            r7 = r7[r2]
            int r8 = r20.readUnsignedShort()
            long r11 = (long) r8
            java.nio.ByteOrder r8 = r0.f49119h
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.C19135a.C19139d.m89647i(r11, r8)
            java.lang.String r11 = "ImageWidth"
            r7.put(r11, r8)
            int r10 = r10 + -5
            goto L_0x0162
        L_0x00d6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00de:
            byte[] r8 = new byte[r10]
            int r11 = r1.read(r8)
            if (r11 != r10) goto L_0x0102
            java.lang.String r10 = "UserComment"
            java.lang.String r11 = r0.mo56501o(r10)
            if (r11 != 0) goto L_0x0100
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r11 = r0.f49117f
            r7 = r11[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = f48986k7
            r11.<init>(r8, r12)
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.C19135a.C19139d.m89646h(r11)
            r7.put(r10, r8)
        L_0x0100:
            r10 = r3
            goto L_0x0162
        L_0x0102:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x010a:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            int r11 = r5 + r10
            byte[] r12 = f48994l7
            boolean r13 = m89540F0(r8, r12)
            if (r13 == 0) goto L_0x0130
            int r7 = r12.length
            byte[] r7 = java.util.Arrays.copyOfRange(r8, r7, r10)
            int r5 = r21 + r5
            int r8 = r12.length
            int r5 = r5 + r8
            r0.f49127p = r5
            r0.mo56504p0(r7, r2)
            androidx.exifinterface.media.a$b r5 = new androidx.exifinterface.media.a$b
            r5.<init>((byte[]) r7)
            r0.mo56460E0(r5)
            goto L_0x0160
        L_0x0130:
            byte[] r12 = f49002m7
            boolean r13 = m89540F0(r8, r12)
            if (r13 == 0) goto L_0x0160
            int r13 = r12.length
            int r5 = r5 + r13
            int r12 = r12.length
            byte[] r8 = java.util.Arrays.copyOfRange(r8, r12, r10)
            java.lang.String r10 = "Xmp"
            java.lang.String r12 = r0.mo56501o(r10)
            if (r12 != 0) goto L_0x0160
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r12 = r0.f49117f
            r12 = r12[r3]
            androidx.exifinterface.media.a$d r15 = new androidx.exifinterface.media.a$d
            r14 = 1
            int r13 = r8.length
            long r3 = (long) r5
            r5 = r13
            r13 = r15
            r6 = r15
            r15 = r5
            r16 = r3
            r18 = r8
            r13.<init>(r14, r15, r16, r18)
            r12.put(r10, r6)
            r0.f49132u = r7
        L_0x0160:
            r5 = r11
            r10 = 0
        L_0x0162:
            if (r10 < 0) goto L_0x0178
            int r3 = r1.skipBytes(r10)
            if (r3 != r10) goto L_0x0170
            int r5 = r5 + r10
            r3 = 0
            r4 = 2
            r6 = -1
            goto L_0x0033
        L_0x0170:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0178:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x017e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r9)
            throw r1
        L_0x0184:
            java.nio.ByteOrder r2 = r0.f49119h
            r1.mo56533f(r2)
            return
        L_0x018a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r7 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.mo56523z(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* renamed from: z0 */
    public void mo56524z0(double d) {
        String str;
        if (d >= 0.0d) {
            str = "0";
        } else {
            str = "1";
        }
        mo56452A0(f48694D1, new C19143h(Math.abs(d)).toString());
        mo56452A0(f48685C1, str);
    }

    /* renamed from: androidx.exifinterface.media.a$f */
    public static class C19141f {

        /* renamed from: a */
        public final int f49149a;

        /* renamed from: b */
        public final String f49150b;

        /* renamed from: c */
        public final int f49151c;

        /* renamed from: d */
        public final int f49152d;

        public C19141f(String str, int i, int i2) {
            this.f49150b = str;
            this.f49149a = i;
            this.f49151c = i2;
            this.f49152d = -1;
        }

        /* renamed from: a */
        public boolean mo56566a(int i) {
            int i2;
            int i3 = this.f49151c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f49152d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public C19141f(String str, int i, int i2, int i3) {
            this.f49150b = str;
            this.f49149a = i;
            this.f49151c = i2;
            this.f49152d = i3;
        }
    }

    public C19135a(@C0359n0 String str) throws IOException {
        C19141f[][] fVarArr = f48922c7;
        this.f49117f = new HashMap[fVarArr.length];
        this.f49118g = new HashSet(fVarArr.length);
        this.f49119h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            mo56479U(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19135a(@androidx.annotation.C0359n0 java.io.FileDescriptor r5) throws java.io.IOException {
        /*
            r4 = this;
            r4.<init>()
            androidx.exifinterface.media.a$f[][] r0 = f48922c7
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.f49117f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.f49118g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.f49119h = r0
            if (r5 == 0) goto L_0x0057
            r0 = 0
            r4.f49114c = r0
            r4.f49112a = r0
            boolean r1 = m89547d0(r5)
            if (r1 == 0) goto L_0x0034
            r4.f49113b = r5
            java.io.FileDescriptor r5 = android.system.Os.dup(r5)     // Catch:{ Exception -> 0x002b }
            r1 = 1
            goto L_0x0037
        L_0x002b:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r5)
            throw r0
        L_0x0034:
            r4.f49113b = r0
            r1 = 0
        L_0x0037:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004a }
            r2.<init>(r5)     // Catch:{ all -> 0x004a }
            r4.mo56495k0(r2)     // Catch:{ all -> 0x0048 }
            m89546d(r2)
            if (r1 == 0) goto L_0x0047
            m89545c(r5)
        L_0x0047:
            return
        L_0x0048:
            r0 = move-exception
            goto L_0x004e
        L_0x004a:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L_0x004e:
            m89546d(r2)
            if (r1 == 0) goto L_0x0056
            m89545c(r5)
        L_0x0056:
            throw r0
        L_0x0057:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "fileDescriptor cannot be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C19135a.<init>(java.io.FileDescriptor):void");
    }

    public C19135a(@C0359n0 InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public C19135a(@C0359n0 InputStream inputStream, int i) throws IOException {
        C19141f[][] fVarArr = f48922c7;
        this.f49117f = new HashMap[fVarArr.length];
        this.f49118g = new HashSet(fVarArr.length);
        this.f49119h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f49112a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                if (m89542V(bufferedInputStream)) {
                    this.f49116e = true;
                    this.f49114c = null;
                    this.f49113b = null;
                    inputStream = bufferedInputStream;
                } else {
                    return;
                }
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f49114c = (AssetManager.AssetInputStream) inputStream;
                this.f49113b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m89547d0(fileInputStream.getFD())) {
                        this.f49114c = null;
                        this.f49113b = fileInputStream.getFD();
                    }
                }
                this.f49114c = null;
                this.f49113b = null;
            }
            mo56495k0(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
