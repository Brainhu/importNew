// ORM class for table 'FYT_JZQKJL'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 07 16:37:31 CST 2015
// For connector: org.apache.sqoop.manager.oracle.OraOopConnManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FYT_JZQKJL extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String CARDNO;
  public String get_CARDNO() {
    return CARDNO;
  }
  public void set_CARDNO(String CARDNO) {
    this.CARDNO = CARDNO;
  }
  public FYT_JZQKJL with_CARDNO(String CARDNO) {
    this.CARDNO = CARDNO;
    return this;
  }
  private java.math.BigDecimal JZCS00;
  public java.math.BigDecimal get_JZCS00() {
    return JZCS00;
  }
  public void set_JZCS00(java.math.BigDecimal JZCS00) {
    this.JZCS00 = JZCS00;
  }
  public FYT_JZQKJL with_JZCS00(java.math.BigDecimal JZCS00) {
    this.JZCS00 = JZCS00;
    return this;
  }
  private String JZYMBH;
  public String get_JZYMBH() {
    return JZYMBH;
  }
  public void set_JZYMBH(String JZYMBH) {
    this.JZYMBH = JZYMBH;
  }
  public FYT_JZQKJL with_JZYMBH(String JZYMBH) {
    this.JZYMBH = JZYMBH;
    return this;
  }
  private String NEDSORT;
  public String get_NEDSORT() {
    return NEDSORT;
  }
  public void set_NEDSORT(String NEDSORT) {
    this.NEDSORT = NEDSORT;
  }
  public FYT_JZQKJL with_NEDSORT(String NEDSORT) {
    this.NEDSORT = NEDSORT;
    return this;
  }
  private String BEGINDATE;
  public String get_BEGINDATE() {
    return BEGINDATE;
  }
  public void set_BEGINDATE(String BEGINDATE) {
    this.BEGINDATE = BEGINDATE;
  }
  public FYT_JZQKJL with_BEGINDATE(String BEGINDATE) {
    this.BEGINDATE = BEGINDATE;
    return this;
  }
  private String BH0000;
  public String get_BH0000() {
    return BH0000;
  }
  public void set_BH0000(String BH0000) {
    this.BH0000 = BH0000;
  }
  public FYT_JZQKJL with_BH0000(String BH0000) {
    this.BH0000 = BH0000;
    return this;
  }
  private String BZ000;
  public String get_BZ000() {
    return BZ000;
  }
  public void set_BZ000(String BZ000) {
    this.BZ000 = BZ000;
  }
  public FYT_JZQKJL with_BZ000(String BZ000) {
    this.BZ000 = BZ000;
    return this;
  }
  private String DJRQI0;
  public String get_DJRQI0() {
    return DJRQI0;
  }
  public void set_DJRQI0(String DJRQI0) {
    this.DJRQI0 = DJRQI0;
  }
  public FYT_JZQKJL with_DJRQI0(String DJRQI0) {
    this.DJRQI0 = DJRQI0;
    return this;
  }
  private String DJYSXM;
  public String get_DJYSXM() {
    return DJYSXM;
  }
  public void set_DJYSXM(String DJYSXM) {
    this.DJYSXM = DJYSXM;
  }
  public FYT_JZQKJL with_DJYSXM(String DJYSXM) {
    this.DJYSXM = DJYSXM;
    return this;
  }
  private String FWDZHI;
  public String get_FWDZHI() {
    return FWDZHI;
  }
  public void set_FWDZHI(String FWDZHI) {
    this.FWDZHI = FWDZHI;
  }
  public FYT_JZQKJL with_FWDZHI(String FWDZHI) {
    this.FWDZHI = FWDZHI;
    return this;
  }
  private String JZFS00;
  public String get_JZFS00() {
    return JZFS00;
  }
  public void set_JZFS00(String JZFS00) {
    this.JZFS00 = JZFS00;
  }
  public FYT_JZQKJL with_JZFS00(String JZFS00) {
    this.JZFS00 = JZFS00;
    return this;
  }
  private String JZSJ00;
  public String get_JZSJ00() {
    return JZSJ00;
  }
  public void set_JZSJ00(String JZSJ00) {
    this.JZSJ00 = JZSJ00;
  }
  public FYT_JZQKJL with_JZSJ00(String JZSJ00) {
    this.JZSJ00 = JZSJ00;
    return this;
  }
  private String PRINT1;
  public String get_PRINT1() {
    return PRINT1;
  }
  public void set_PRINT1(String PRINT1) {
    this.PRINT1 = PRINT1;
  }
  public FYT_JZQKJL with_PRINT1(String PRINT1) {
    this.PRINT1 = PRINT1;
    return this;
  }
  private String SFLAG;
  public String get_SFLAG() {
    return SFLAG;
  }
  public void set_SFLAG(String SFLAG) {
    this.SFLAG = SFLAG;
  }
  public FYT_JZQKJL with_SFLAG(String SFLAG) {
    this.SFLAG = SFLAG;
    return this;
  }
  private String SFLAG1;
  public String get_SFLAG1() {
    return SFLAG1;
  }
  public void set_SFLAG1(String SFLAG1) {
    this.SFLAG1 = SFLAG1;
  }
  public FYT_JZQKJL with_SFLAG1(String SFLAG1) {
    this.SFLAG1 = SFLAG1;
    return this;
  }
  private String SFLAG2;
  public String get_SFLAG2() {
    return SFLAG2;
  }
  public void set_SFLAG2(String SFLAG2) {
    this.SFLAG2 = SFLAG2;
  }
  public FYT_JZQKJL with_SFLAG2(String SFLAG2) {
    this.SFLAG2 = SFLAG2;
    return this;
  }
  private String SFLG2;
  public String get_SFLG2() {
    return SFLG2;
  }
  public void set_SFLG2(String SFLG2) {
    this.SFLG2 = SFLG2;
  }
  public FYT_JZQKJL with_SFLG2(String SFLG2) {
    this.SFLG2 = SFLG2;
    return this;
  }
  private String YMGG00;
  public String get_YMGG00() {
    return YMGG00;
  }
  public void set_YMGG00(String YMGG00) {
    this.YMGG00 = YMGG00;
  }
  public FYT_JZQKJL with_YMGG00(String YMGG00) {
    this.YMGG00 = YMGG00;
    return this;
  }
  private String YMGYDW;
  public String get_YMGYDW() {
    return YMGYDW;
  }
  public void set_YMGYDW(String YMGYDW) {
    this.YMGYDW = YMGYDW;
  }
  public FYT_JZQKJL with_YMGYDW(String YMGYDW) {
    this.YMGYDW = YMGYDW;
    return this;
  }
  private String YMPH00;
  public String get_YMPH00() {
    return YMPH00;
  }
  public void set_YMPH00(String YMPH00) {
    this.YMPH00 = YMPH00;
  }
  public FYT_JZQKJL with_YMPH00(String YMPH00) {
    this.YMPH00 = YMPH00;
    return this;
  }
  private String YMSCDW;
  public String get_YMSCDW() {
    return YMSCDW;
  }
  public void set_YMSCDW(String YMSCDW) {
    this.YMSCDW = YMSCDW;
  }
  public FYT_JZQKJL with_YMSCDW(String YMSCDW) {
    this.YMSCDW = YMSCDW;
    return this;
  }
  private String YSXM00;
  public String get_YSXM00() {
    return YSXM00;
  }
  public void set_YSXM00(String YSXM00) {
    this.YSXM00 = YSXM00;
  }
  public FYT_JZQKJL with_YSXM00(String YSXM00) {
    this.YSXM00 = YSXM00;
    return this;
  }
  private String FYT_JZQKJL_CARDNO;
  public String get_FYT_JZQKJL_CARDNO() {
    return FYT_JZQKJL_CARDNO;
  }
  public void set_FYT_JZQKJL_CARDNO(String FYT_JZQKJL_CARDNO) {
    this.FYT_JZQKJL_CARDNO = FYT_JZQKJL_CARDNO;
  }
  public FYT_JZQKJL with_FYT_JZQKJL_CARDNO(String FYT_JZQKJL_CARDNO) {
    this.FYT_JZQKJL_CARDNO = FYT_JZQKJL_CARDNO;
    return this;
  }
  private String LASTTIME;
  public String get_LASTTIME() {
    return LASTTIME;
  }
  public void set_LASTTIME(String LASTTIME) {
    this.LASTTIME = LASTTIME;
  }
  public FYT_JZQKJL with_LASTTIME(String LASTTIME) {
    this.LASTTIME = LASTTIME;
    return this;
  }
  private String KYHL;
  public String get_KYHL() {
    return KYHL;
  }
  public void set_KYHL(String KYHL) {
    this.KYHL = KYHL;
  }
  public FYT_JZQKJL with_KYHL(String KYHL) {
    this.KYHL = KYHL;
    return this;
  }
  private java.math.BigDecimal INOCULATION_OPINION;
  public java.math.BigDecimal get_INOCULATION_OPINION() {
    return INOCULATION_OPINION;
  }
  public void set_INOCULATION_OPINION(java.math.BigDecimal INOCULATION_OPINION) {
    this.INOCULATION_OPINION = INOCULATION_OPINION;
  }
  public FYT_JZQKJL with_INOCULATION_OPINION(java.math.BigDecimal INOCULATION_OPINION) {
    this.INOCULATION_OPINION = INOCULATION_OPINION;
    return this;
  }
  private String MANAGEDEPART;
  public String get_MANAGEDEPART() {
    return MANAGEDEPART;
  }
  public void set_MANAGEDEPART(String MANAGEDEPART) {
    this.MANAGEDEPART = MANAGEDEPART;
  }
  public FYT_JZQKJL with_MANAGEDEPART(String MANAGEDEPART) {
    this.MANAGEDEPART = MANAGEDEPART;
    return this;
  }
  private String VACCINETYPE;
  public String get_VACCINETYPE() {
    return VACCINETYPE;
  }
  public void set_VACCINETYPE(String VACCINETYPE) {
    this.VACCINETYPE = VACCINETYPE;
  }
  public FYT_JZQKJL with_VACCINETYPE(String VACCINETYPE) {
    this.VACCINETYPE = VACCINETYPE;
    return this;
  }
  private String HOUSEHOLDTYPE;
  public String get_HOUSEHOLDTYPE() {
    return HOUSEHOLDTYPE;
  }
  public void set_HOUSEHOLDTYPE(String HOUSEHOLDTYPE) {
    this.HOUSEHOLDTYPE = HOUSEHOLDTYPE;
  }
  public FYT_JZQKJL with_HOUSEHOLDTYPE(String HOUSEHOLDTYPE) {
    this.HOUSEHOLDTYPE = HOUSEHOLDTYPE;
    return this;
  }
  private String DOSE;
  public String get_DOSE() {
    return DOSE;
  }
  public void set_DOSE(String DOSE) {
    this.DOSE = DOSE;
  }
  public FYT_JZQKJL with_DOSE(String DOSE) {
    this.DOSE = DOSE;
    return this;
  }
  private String REGULATORYCODE;
  public String get_REGULATORYCODE() {
    return REGULATORYCODE;
  }
  public void set_REGULATORYCODE(String REGULATORYCODE) {
    this.REGULATORYCODE = REGULATORYCODE;
  }
  public FYT_JZQKJL with_REGULATORYCODE(String REGULATORYCODE) {
    this.REGULATORYCODE = REGULATORYCODE;
    return this;
  }
  private String VALIDDATE;
  public String get_VALIDDATE() {
    return VALIDDATE;
  }
  public void set_VALIDDATE(String VALIDDATE) {
    this.VALIDDATE = VALIDDATE;
  }
  public FYT_JZQKJL with_VALIDDATE(String VALIDDATE) {
    this.VALIDDATE = VALIDDATE;
    return this;
  }
  private String INOCCOUNTYGB;
  public String get_INOCCOUNTYGB() {
    return INOCCOUNTYGB;
  }
  public void set_INOCCOUNTYGB(String INOCCOUNTYGB) {
    this.INOCCOUNTYGB = INOCCOUNTYGB;
  }
  public FYT_JZQKJL with_INOCCOUNTYGB(String INOCCOUNTYGB) {
    this.INOCCOUNTYGB = INOCCOUNTYGB;
    return this;
  }
  private String INOCSITEGB;
  public String get_INOCSITEGB() {
    return INOCSITEGB;
  }
  public void set_INOCSITEGB(String INOCSITEGB) {
    this.INOCSITEGB = INOCSITEGB;
  }
  public FYT_JZQKJL with_INOCSITEGB(String INOCSITEGB) {
    this.INOCSITEGB = INOCSITEGB;
    return this;
  }
  private String INOCPARTID;
  public String get_INOCPARTID() {
    return INOCPARTID;
  }
  public void set_INOCPARTID(String INOCPARTID) {
    this.INOCPARTID = INOCPARTID;
  }
  public FYT_JZQKJL with_INOCPARTID(String INOCPARTID) {
    this.INOCPARTID = INOCPARTID;
    return this;
  }
  private String INOCMODEID;
  public String get_INOCMODEID() {
    return INOCMODEID;
  }
  public void set_INOCMODEID(String INOCMODEID) {
    this.INOCMODEID = INOCMODEID;
  }
  public FYT_JZQKJL with_INOCMODEID(String INOCMODEID) {
    this.INOCMODEID = INOCMODEID;
    return this;
  }
  private String EQUIINJECTION;
  public String get_EQUIINJECTION() {
    return EQUIINJECTION;
  }
  public void set_EQUIINJECTION(String EQUIINJECTION) {
    this.EQUIINJECTION = EQUIINJECTION;
  }
  public FYT_JZQKJL with_EQUIINJECTION(String EQUIINJECTION) {
    this.EQUIINJECTION = EQUIINJECTION;
    return this;
  }
  private String CREATEDATE;
  public String get_CREATEDATE() {
    return CREATEDATE;
  }
  public void set_CREATEDATE(String CREATEDATE) {
    this.CREATEDATE = CREATEDATE;
  }
  public FYT_JZQKJL with_CREATEDATE(String CREATEDATE) {
    this.CREATEDATE = CREATEDATE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FYT_JZQKJL)) {
      return false;
    }
    FYT_JZQKJL that = (FYT_JZQKJL) o;
    boolean equal = true;
    equal = equal && (this.CARDNO == null ? that.CARDNO == null : this.CARDNO.equals(that.CARDNO));
    equal = equal && (this.JZCS00 == null ? that.JZCS00 == null : this.JZCS00.equals(that.JZCS00));
    equal = equal && (this.JZYMBH == null ? that.JZYMBH == null : this.JZYMBH.equals(that.JZYMBH));
    equal = equal && (this.NEDSORT == null ? that.NEDSORT == null : this.NEDSORT.equals(that.NEDSORT));
    equal = equal && (this.BEGINDATE == null ? that.BEGINDATE == null : this.BEGINDATE.equals(that.BEGINDATE));
    equal = equal && (this.BH0000 == null ? that.BH0000 == null : this.BH0000.equals(that.BH0000));
    equal = equal && (this.BZ000 == null ? that.BZ000 == null : this.BZ000.equals(that.BZ000));
    equal = equal && (this.DJRQI0 == null ? that.DJRQI0 == null : this.DJRQI0.equals(that.DJRQI0));
    equal = equal && (this.DJYSXM == null ? that.DJYSXM == null : this.DJYSXM.equals(that.DJYSXM));
    equal = equal && (this.FWDZHI == null ? that.FWDZHI == null : this.FWDZHI.equals(that.FWDZHI));
    equal = equal && (this.JZFS00 == null ? that.JZFS00 == null : this.JZFS00.equals(that.JZFS00));
    equal = equal && (this.JZSJ00 == null ? that.JZSJ00 == null : this.JZSJ00.equals(that.JZSJ00));
    equal = equal && (this.PRINT1 == null ? that.PRINT1 == null : this.PRINT1.equals(that.PRINT1));
    equal = equal && (this.SFLAG == null ? that.SFLAG == null : this.SFLAG.equals(that.SFLAG));
    equal = equal && (this.SFLAG1 == null ? that.SFLAG1 == null : this.SFLAG1.equals(that.SFLAG1));
    equal = equal && (this.SFLAG2 == null ? that.SFLAG2 == null : this.SFLAG2.equals(that.SFLAG2));
    equal = equal && (this.SFLG2 == null ? that.SFLG2 == null : this.SFLG2.equals(that.SFLG2));
    equal = equal && (this.YMGG00 == null ? that.YMGG00 == null : this.YMGG00.equals(that.YMGG00));
    equal = equal && (this.YMGYDW == null ? that.YMGYDW == null : this.YMGYDW.equals(that.YMGYDW));
    equal = equal && (this.YMPH00 == null ? that.YMPH00 == null : this.YMPH00.equals(that.YMPH00));
    equal = equal && (this.YMSCDW == null ? that.YMSCDW == null : this.YMSCDW.equals(that.YMSCDW));
    equal = equal && (this.YSXM00 == null ? that.YSXM00 == null : this.YSXM00.equals(that.YSXM00));
    equal = equal && (this.FYT_JZQKJL_CARDNO == null ? that.FYT_JZQKJL_CARDNO == null : this.FYT_JZQKJL_CARDNO.equals(that.FYT_JZQKJL_CARDNO));
    equal = equal && (this.LASTTIME == null ? that.LASTTIME == null : this.LASTTIME.equals(that.LASTTIME));
    equal = equal && (this.KYHL == null ? that.KYHL == null : this.KYHL.equals(that.KYHL));
    equal = equal && (this.INOCULATION_OPINION == null ? that.INOCULATION_OPINION == null : this.INOCULATION_OPINION.equals(that.INOCULATION_OPINION));
    equal = equal && (this.MANAGEDEPART == null ? that.MANAGEDEPART == null : this.MANAGEDEPART.equals(that.MANAGEDEPART));
    equal = equal && (this.VACCINETYPE == null ? that.VACCINETYPE == null : this.VACCINETYPE.equals(that.VACCINETYPE));
    equal = equal && (this.HOUSEHOLDTYPE == null ? that.HOUSEHOLDTYPE == null : this.HOUSEHOLDTYPE.equals(that.HOUSEHOLDTYPE));
    equal = equal && (this.DOSE == null ? that.DOSE == null : this.DOSE.equals(that.DOSE));
    equal = equal && (this.REGULATORYCODE == null ? that.REGULATORYCODE == null : this.REGULATORYCODE.equals(that.REGULATORYCODE));
    equal = equal && (this.VALIDDATE == null ? that.VALIDDATE == null : this.VALIDDATE.equals(that.VALIDDATE));
    equal = equal && (this.INOCCOUNTYGB == null ? that.INOCCOUNTYGB == null : this.INOCCOUNTYGB.equals(that.INOCCOUNTYGB));
    equal = equal && (this.INOCSITEGB == null ? that.INOCSITEGB == null : this.INOCSITEGB.equals(that.INOCSITEGB));
    equal = equal && (this.INOCPARTID == null ? that.INOCPARTID == null : this.INOCPARTID.equals(that.INOCPARTID));
    equal = equal && (this.INOCMODEID == null ? that.INOCMODEID == null : this.INOCMODEID.equals(that.INOCMODEID));
    equal = equal && (this.EQUIINJECTION == null ? that.EQUIINJECTION == null : this.EQUIINJECTION.equals(that.EQUIINJECTION));
    equal = equal && (this.CREATEDATE == null ? that.CREATEDATE == null : this.CREATEDATE.equals(that.CREATEDATE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FYT_JZQKJL)) {
      return false;
    }
    FYT_JZQKJL that = (FYT_JZQKJL) o;
    boolean equal = true;
    equal = equal && (this.CARDNO == null ? that.CARDNO == null : this.CARDNO.equals(that.CARDNO));
    equal = equal && (this.JZCS00 == null ? that.JZCS00 == null : this.JZCS00.equals(that.JZCS00));
    equal = equal && (this.JZYMBH == null ? that.JZYMBH == null : this.JZYMBH.equals(that.JZYMBH));
    equal = equal && (this.NEDSORT == null ? that.NEDSORT == null : this.NEDSORT.equals(that.NEDSORT));
    equal = equal && (this.BEGINDATE == null ? that.BEGINDATE == null : this.BEGINDATE.equals(that.BEGINDATE));
    equal = equal && (this.BH0000 == null ? that.BH0000 == null : this.BH0000.equals(that.BH0000));
    equal = equal && (this.BZ000 == null ? that.BZ000 == null : this.BZ000.equals(that.BZ000));
    equal = equal && (this.DJRQI0 == null ? that.DJRQI0 == null : this.DJRQI0.equals(that.DJRQI0));
    equal = equal && (this.DJYSXM == null ? that.DJYSXM == null : this.DJYSXM.equals(that.DJYSXM));
    equal = equal && (this.FWDZHI == null ? that.FWDZHI == null : this.FWDZHI.equals(that.FWDZHI));
    equal = equal && (this.JZFS00 == null ? that.JZFS00 == null : this.JZFS00.equals(that.JZFS00));
    equal = equal && (this.JZSJ00 == null ? that.JZSJ00 == null : this.JZSJ00.equals(that.JZSJ00));
    equal = equal && (this.PRINT1 == null ? that.PRINT1 == null : this.PRINT1.equals(that.PRINT1));
    equal = equal && (this.SFLAG == null ? that.SFLAG == null : this.SFLAG.equals(that.SFLAG));
    equal = equal && (this.SFLAG1 == null ? that.SFLAG1 == null : this.SFLAG1.equals(that.SFLAG1));
    equal = equal && (this.SFLAG2 == null ? that.SFLAG2 == null : this.SFLAG2.equals(that.SFLAG2));
    equal = equal && (this.SFLG2 == null ? that.SFLG2 == null : this.SFLG2.equals(that.SFLG2));
    equal = equal && (this.YMGG00 == null ? that.YMGG00 == null : this.YMGG00.equals(that.YMGG00));
    equal = equal && (this.YMGYDW == null ? that.YMGYDW == null : this.YMGYDW.equals(that.YMGYDW));
    equal = equal && (this.YMPH00 == null ? that.YMPH00 == null : this.YMPH00.equals(that.YMPH00));
    equal = equal && (this.YMSCDW == null ? that.YMSCDW == null : this.YMSCDW.equals(that.YMSCDW));
    equal = equal && (this.YSXM00 == null ? that.YSXM00 == null : this.YSXM00.equals(that.YSXM00));
    equal = equal && (this.FYT_JZQKJL_CARDNO == null ? that.FYT_JZQKJL_CARDNO == null : this.FYT_JZQKJL_CARDNO.equals(that.FYT_JZQKJL_CARDNO));
    equal = equal && (this.LASTTIME == null ? that.LASTTIME == null : this.LASTTIME.equals(that.LASTTIME));
    equal = equal && (this.KYHL == null ? that.KYHL == null : this.KYHL.equals(that.KYHL));
    equal = equal && (this.INOCULATION_OPINION == null ? that.INOCULATION_OPINION == null : this.INOCULATION_OPINION.equals(that.INOCULATION_OPINION));
    equal = equal && (this.MANAGEDEPART == null ? that.MANAGEDEPART == null : this.MANAGEDEPART.equals(that.MANAGEDEPART));
    equal = equal && (this.VACCINETYPE == null ? that.VACCINETYPE == null : this.VACCINETYPE.equals(that.VACCINETYPE));
    equal = equal && (this.HOUSEHOLDTYPE == null ? that.HOUSEHOLDTYPE == null : this.HOUSEHOLDTYPE.equals(that.HOUSEHOLDTYPE));
    equal = equal && (this.DOSE == null ? that.DOSE == null : this.DOSE.equals(that.DOSE));
    equal = equal && (this.REGULATORYCODE == null ? that.REGULATORYCODE == null : this.REGULATORYCODE.equals(that.REGULATORYCODE));
    equal = equal && (this.VALIDDATE == null ? that.VALIDDATE == null : this.VALIDDATE.equals(that.VALIDDATE));
    equal = equal && (this.INOCCOUNTYGB == null ? that.INOCCOUNTYGB == null : this.INOCCOUNTYGB.equals(that.INOCCOUNTYGB));
    equal = equal && (this.INOCSITEGB == null ? that.INOCSITEGB == null : this.INOCSITEGB.equals(that.INOCSITEGB));
    equal = equal && (this.INOCPARTID == null ? that.INOCPARTID == null : this.INOCPARTID.equals(that.INOCPARTID));
    equal = equal && (this.INOCMODEID == null ? that.INOCMODEID == null : this.INOCMODEID.equals(that.INOCMODEID));
    equal = equal && (this.EQUIINJECTION == null ? that.EQUIINJECTION == null : this.EQUIINJECTION.equals(that.EQUIINJECTION));
    equal = equal && (this.CREATEDATE == null ? that.CREATEDATE == null : this.CREATEDATE.equals(that.CREATEDATE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.CARDNO = JdbcWritableBridge.readString(1, __dbResults);
    this.JZCS00 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.JZYMBH = JdbcWritableBridge.readString(3, __dbResults);
    this.NEDSORT = JdbcWritableBridge.readString(4, __dbResults);
    this.BEGINDATE = JdbcWritableBridge.readString(5, __dbResults);
    this.BH0000 = JdbcWritableBridge.readString(6, __dbResults);
    this.BZ000 = JdbcWritableBridge.readString(7, __dbResults);
    this.DJRQI0 = JdbcWritableBridge.readString(8, __dbResults);
    this.DJYSXM = JdbcWritableBridge.readString(9, __dbResults);
    this.FWDZHI = JdbcWritableBridge.readString(10, __dbResults);
    this.JZFS00 = JdbcWritableBridge.readString(11, __dbResults);
    this.JZSJ00 = JdbcWritableBridge.readString(12, __dbResults);
    this.PRINT1 = JdbcWritableBridge.readString(13, __dbResults);
    this.SFLAG = JdbcWritableBridge.readString(14, __dbResults);
    this.SFLAG1 = JdbcWritableBridge.readString(15, __dbResults);
    this.SFLAG2 = JdbcWritableBridge.readString(16, __dbResults);
    this.SFLG2 = JdbcWritableBridge.readString(17, __dbResults);
    this.YMGG00 = JdbcWritableBridge.readString(18, __dbResults);
    this.YMGYDW = JdbcWritableBridge.readString(19, __dbResults);
    this.YMPH00 = JdbcWritableBridge.readString(20, __dbResults);
    this.YMSCDW = JdbcWritableBridge.readString(21, __dbResults);
    this.YSXM00 = JdbcWritableBridge.readString(22, __dbResults);
    this.FYT_JZQKJL_CARDNO = JdbcWritableBridge.readString(23, __dbResults);
    this.LASTTIME = JdbcWritableBridge.readString(24, __dbResults);
    this.KYHL = JdbcWritableBridge.readString(25, __dbResults);
    this.INOCULATION_OPINION = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.MANAGEDEPART = JdbcWritableBridge.readString(27, __dbResults);
    this.VACCINETYPE = JdbcWritableBridge.readString(28, __dbResults);
    this.HOUSEHOLDTYPE = JdbcWritableBridge.readString(29, __dbResults);
    this.DOSE = JdbcWritableBridge.readString(30, __dbResults);
    this.REGULATORYCODE = JdbcWritableBridge.readString(31, __dbResults);
    this.VALIDDATE = JdbcWritableBridge.readString(32, __dbResults);
    this.INOCCOUNTYGB = JdbcWritableBridge.readString(33, __dbResults);
    this.INOCSITEGB = JdbcWritableBridge.readString(34, __dbResults);
    this.INOCPARTID = JdbcWritableBridge.readString(35, __dbResults);
    this.INOCMODEID = JdbcWritableBridge.readString(36, __dbResults);
    this.EQUIINJECTION = JdbcWritableBridge.readString(37, __dbResults);
    this.CREATEDATE = JdbcWritableBridge.readString(38, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.CARDNO = JdbcWritableBridge.readString(1, __dbResults);
    this.JZCS00 = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.JZYMBH = JdbcWritableBridge.readString(3, __dbResults);
    this.NEDSORT = JdbcWritableBridge.readString(4, __dbResults);
    this.BEGINDATE = JdbcWritableBridge.readString(5, __dbResults);
    this.BH0000 = JdbcWritableBridge.readString(6, __dbResults);
    this.BZ000 = JdbcWritableBridge.readString(7, __dbResults);
    this.DJRQI0 = JdbcWritableBridge.readString(8, __dbResults);
    this.DJYSXM = JdbcWritableBridge.readString(9, __dbResults);
    this.FWDZHI = JdbcWritableBridge.readString(10, __dbResults);
    this.JZFS00 = JdbcWritableBridge.readString(11, __dbResults);
    this.JZSJ00 = JdbcWritableBridge.readString(12, __dbResults);
    this.PRINT1 = JdbcWritableBridge.readString(13, __dbResults);
    this.SFLAG = JdbcWritableBridge.readString(14, __dbResults);
    this.SFLAG1 = JdbcWritableBridge.readString(15, __dbResults);
    this.SFLAG2 = JdbcWritableBridge.readString(16, __dbResults);
    this.SFLG2 = JdbcWritableBridge.readString(17, __dbResults);
    this.YMGG00 = JdbcWritableBridge.readString(18, __dbResults);
    this.YMGYDW = JdbcWritableBridge.readString(19, __dbResults);
    this.YMPH00 = JdbcWritableBridge.readString(20, __dbResults);
    this.YMSCDW = JdbcWritableBridge.readString(21, __dbResults);
    this.YSXM00 = JdbcWritableBridge.readString(22, __dbResults);
    this.FYT_JZQKJL_CARDNO = JdbcWritableBridge.readString(23, __dbResults);
    this.LASTTIME = JdbcWritableBridge.readString(24, __dbResults);
    this.KYHL = JdbcWritableBridge.readString(25, __dbResults);
    this.INOCULATION_OPINION = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.MANAGEDEPART = JdbcWritableBridge.readString(27, __dbResults);
    this.VACCINETYPE = JdbcWritableBridge.readString(28, __dbResults);
    this.HOUSEHOLDTYPE = JdbcWritableBridge.readString(29, __dbResults);
    this.DOSE = JdbcWritableBridge.readString(30, __dbResults);
    this.REGULATORYCODE = JdbcWritableBridge.readString(31, __dbResults);
    this.VALIDDATE = JdbcWritableBridge.readString(32, __dbResults);
    this.INOCCOUNTYGB = JdbcWritableBridge.readString(33, __dbResults);
    this.INOCSITEGB = JdbcWritableBridge.readString(34, __dbResults);
    this.INOCPARTID = JdbcWritableBridge.readString(35, __dbResults);
    this.INOCMODEID = JdbcWritableBridge.readString(36, __dbResults);
    this.EQUIINJECTION = JdbcWritableBridge.readString(37, __dbResults);
    this.CREATEDATE = JdbcWritableBridge.readString(38, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CARDNO, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(JZCS00, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(JZYMBH, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NEDSORT, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BEGINDATE, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(BH0000, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BZ000, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DJRQI0, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(DJYSXM, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FWDZHI, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(JZFS00, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(JZSJ00, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PRINT1, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLAG, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLAG1, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLAG2, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLG2, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMGG00, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMGYDW, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMPH00, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMSCDW, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YSXM00, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FYT_JZQKJL_CARDNO, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LASTTIME, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(KYHL, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INOCULATION_OPINION, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MANAGEDEPART, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VACCINETYPE, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOUSEHOLDTYPE, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOSE, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGULATORYCODE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VALIDDATE, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(INOCCOUNTYGB, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INOCSITEGB, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INOCPARTID, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INOCMODEID, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EQUIINJECTION, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CREATEDATE, 38 + __off, 93, __dbStmt);
    return 38;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(CARDNO, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(JZCS00, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(JZYMBH, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NEDSORT, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BEGINDATE, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(BH0000, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BZ000, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DJRQI0, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(DJYSXM, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FWDZHI, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(JZFS00, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(JZSJ00, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(PRINT1, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLAG, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLAG1, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLAG2, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(SFLG2, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMGG00, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMGYDW, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMPH00, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YMSCDW, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(YSXM00, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(FYT_JZQKJL_CARDNO, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LASTTIME, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(KYHL, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(INOCULATION_OPINION, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MANAGEDEPART, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VACCINETYPE, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HOUSEHOLDTYPE, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DOSE, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REGULATORYCODE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(VALIDDATE, 32 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(INOCCOUNTYGB, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INOCSITEGB, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INOCPARTID, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(INOCMODEID, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EQUIINJECTION, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CREATEDATE, 38 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.CARDNO = null;
    } else {
    this.CARDNO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JZCS00 = null;
    } else {
    this.JZCS00 = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JZYMBH = null;
    } else {
    this.JZYMBH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NEDSORT = null;
    } else {
    this.NEDSORT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BEGINDATE = null;
    } else {
    this.BEGINDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BH0000 = null;
    } else {
    this.BH0000 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BZ000 = null;
    } else {
    this.BZ000 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DJRQI0 = null;
    } else {
    this.DJRQI0 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DJYSXM = null;
    } else {
    this.DJYSXM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FWDZHI = null;
    } else {
    this.FWDZHI = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JZFS00 = null;
    } else {
    this.JZFS00 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JZSJ00 = null;
    } else {
    this.JZSJ00 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PRINT1 = null;
    } else {
    this.PRINT1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SFLAG = null;
    } else {
    this.SFLAG = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SFLAG1 = null;
    } else {
    this.SFLAG1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SFLAG2 = null;
    } else {
    this.SFLAG2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SFLG2 = null;
    } else {
    this.SFLG2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YMGG00 = null;
    } else {
    this.YMGG00 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YMGYDW = null;
    } else {
    this.YMGYDW = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YMPH00 = null;
    } else {
    this.YMPH00 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YMSCDW = null;
    } else {
    this.YMSCDW = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.YSXM00 = null;
    } else {
    this.YSXM00 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FYT_JZQKJL_CARDNO = null;
    } else {
    this.FYT_JZQKJL_CARDNO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LASTTIME = null;
    } else {
    this.LASTTIME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.KYHL = null;
    } else {
    this.KYHL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INOCULATION_OPINION = null;
    } else {
    this.INOCULATION_OPINION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MANAGEDEPART = null;
    } else {
    this.MANAGEDEPART = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VACCINETYPE = null;
    } else {
    this.VACCINETYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HOUSEHOLDTYPE = null;
    } else {
    this.HOUSEHOLDTYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DOSE = null;
    } else {
    this.DOSE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REGULATORYCODE = null;
    } else {
    this.REGULATORYCODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VALIDDATE = null;
    } else {
    this.VALIDDATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INOCCOUNTYGB = null;
    } else {
    this.INOCCOUNTYGB = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INOCSITEGB = null;
    } else {
    this.INOCSITEGB = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INOCPARTID = null;
    } else {
    this.INOCPARTID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.INOCMODEID = null;
    } else {
    this.INOCMODEID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EQUIINJECTION = null;
    } else {
    this.EQUIINJECTION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREATEDATE = null;
    } else {
    this.CREATEDATE = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.CARDNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARDNO);
    }
    if (null == this.JZCS00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.JZCS00, __dataOut);
    }
    if (null == this.JZYMBH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JZYMBH);
    }
    if (null == this.NEDSORT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NEDSORT);
    }
    if (null == this.BEGINDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BEGINDATE);
    }
    if (null == this.BH0000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BH0000);
    }
    if (null == this.BZ000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BZ000);
    }
    if (null == this.DJRQI0) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DJRQI0);
    }
    if (null == this.DJYSXM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DJYSXM);
    }
    if (null == this.FWDZHI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FWDZHI);
    }
    if (null == this.JZFS00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JZFS00);
    }
    if (null == this.JZSJ00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JZSJ00);
    }
    if (null == this.PRINT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRINT1);
    }
    if (null == this.SFLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLAG);
    }
    if (null == this.SFLAG1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLAG1);
    }
    if (null == this.SFLAG2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLAG2);
    }
    if (null == this.SFLG2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLG2);
    }
    if (null == this.YMGG00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMGG00);
    }
    if (null == this.YMGYDW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMGYDW);
    }
    if (null == this.YMPH00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMPH00);
    }
    if (null == this.YMSCDW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMSCDW);
    }
    if (null == this.YSXM00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YSXM00);
    }
    if (null == this.FYT_JZQKJL_CARDNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FYT_JZQKJL_CARDNO);
    }
    if (null == this.LASTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LASTTIME);
    }
    if (null == this.KYHL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, KYHL);
    }
    if (null == this.INOCULATION_OPINION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INOCULATION_OPINION, __dataOut);
    }
    if (null == this.MANAGEDEPART) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MANAGEDEPART);
    }
    if (null == this.VACCINETYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VACCINETYPE);
    }
    if (null == this.HOUSEHOLDTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOUSEHOLDTYPE);
    }
    if (null == this.DOSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOSE);
    }
    if (null == this.REGULATORYCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGULATORYCODE);
    }
    if (null == this.VALIDDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VALIDDATE);
    }
    if (null == this.INOCCOUNTYGB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCCOUNTYGB);
    }
    if (null == this.INOCSITEGB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCSITEGB);
    }
    if (null == this.INOCPARTID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCPARTID);
    }
    if (null == this.INOCMODEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCMODEID);
    }
    if (null == this.EQUIINJECTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EQUIINJECTION);
    }
    if (null == this.CREATEDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREATEDATE);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.CARDNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CARDNO);
    }
    if (null == this.JZCS00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.JZCS00, __dataOut);
    }
    if (null == this.JZYMBH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JZYMBH);
    }
    if (null == this.NEDSORT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NEDSORT);
    }
    if (null == this.BEGINDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BEGINDATE);
    }
    if (null == this.BH0000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BH0000);
    }
    if (null == this.BZ000) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BZ000);
    }
    if (null == this.DJRQI0) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DJRQI0);
    }
    if (null == this.DJYSXM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DJYSXM);
    }
    if (null == this.FWDZHI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FWDZHI);
    }
    if (null == this.JZFS00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JZFS00);
    }
    if (null == this.JZSJ00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JZSJ00);
    }
    if (null == this.PRINT1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PRINT1);
    }
    if (null == this.SFLAG) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLAG);
    }
    if (null == this.SFLAG1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLAG1);
    }
    if (null == this.SFLAG2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLAG2);
    }
    if (null == this.SFLG2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SFLG2);
    }
    if (null == this.YMGG00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMGG00);
    }
    if (null == this.YMGYDW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMGYDW);
    }
    if (null == this.YMPH00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMPH00);
    }
    if (null == this.YMSCDW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YMSCDW);
    }
    if (null == this.YSXM00) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, YSXM00);
    }
    if (null == this.FYT_JZQKJL_CARDNO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FYT_JZQKJL_CARDNO);
    }
    if (null == this.LASTTIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LASTTIME);
    }
    if (null == this.KYHL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, KYHL);
    }
    if (null == this.INOCULATION_OPINION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.INOCULATION_OPINION, __dataOut);
    }
    if (null == this.MANAGEDEPART) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MANAGEDEPART);
    }
    if (null == this.VACCINETYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VACCINETYPE);
    }
    if (null == this.HOUSEHOLDTYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HOUSEHOLDTYPE);
    }
    if (null == this.DOSE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DOSE);
    }
    if (null == this.REGULATORYCODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGULATORYCODE);
    }
    if (null == this.VALIDDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, VALIDDATE);
    }
    if (null == this.INOCCOUNTYGB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCCOUNTYGB);
    }
    if (null == this.INOCSITEGB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCSITEGB);
    }
    if (null == this.INOCPARTID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCPARTID);
    }
    if (null == this.INOCMODEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, INOCMODEID);
    }
    if (null == this.EQUIINJECTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EQUIINJECTION);
    }
    if (null == this.CREATEDATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREATEDATE);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 59, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(CARDNO==null?"null":CARDNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZCS00==null?"null":JZCS00.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZYMBH==null?"null":JZYMBH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEDSORT==null?"null":NEDSORT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BEGINDATE==null?"null":BEGINDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BH0000==null?"null":BH0000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BZ000==null?"null":BZ000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DJRQI0==null?"null":DJRQI0, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DJYSXM==null?"null":DJYSXM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FWDZHI==null?"null":FWDZHI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZFS00==null?"null":JZFS00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZSJ00==null?"null":JZSJ00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRINT1==null?"null":PRINT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLAG==null?"null":SFLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLAG1==null?"null":SFLAG1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLAG2==null?"null":SFLAG2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLG2==null?"null":SFLG2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMGG00==null?"null":YMGG00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMGYDW==null?"null":YMGYDW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMPH00==null?"null":YMPH00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMSCDW==null?"null":YMSCDW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YSXM00==null?"null":YSXM00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FYT_JZQKJL_CARDNO==null?"null":FYT_JZQKJL_CARDNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LASTTIME==null?"null":LASTTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KYHL==null?"null":KYHL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCULATION_OPINION==null?"null":INOCULATION_OPINION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MANAGEDEPART==null?"null":MANAGEDEPART, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VACCINETYPE==null?"null":VACCINETYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUSEHOLDTYPE==null?"null":HOUSEHOLDTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOSE==null?"null":DOSE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGULATORYCODE==null?"null":REGULATORYCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VALIDDATE==null?"null":VALIDDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCCOUNTYGB==null?"null":INOCCOUNTYGB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCSITEGB==null?"null":INOCSITEGB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCPARTID==null?"null":INOCPARTID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCMODEID==null?"null":INOCMODEID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EQUIINJECTION==null?"null":EQUIINJECTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATEDATE==null?"null":CREATEDATE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(CARDNO==null?"null":CARDNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZCS00==null?"null":JZCS00.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZYMBH==null?"null":JZYMBH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NEDSORT==null?"null":NEDSORT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BEGINDATE==null?"null":BEGINDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BH0000==null?"null":BH0000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BZ000==null?"null":BZ000, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DJRQI0==null?"null":DJRQI0, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DJYSXM==null?"null":DJYSXM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FWDZHI==null?"null":FWDZHI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZFS00==null?"null":JZFS00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JZSJ00==null?"null":JZSJ00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PRINT1==null?"null":PRINT1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLAG==null?"null":SFLAG, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLAG1==null?"null":SFLAG1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLAG2==null?"null":SFLAG2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SFLG2==null?"null":SFLG2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMGG00==null?"null":YMGG00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMGYDW==null?"null":YMGYDW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMPH00==null?"null":YMPH00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YMSCDW==null?"null":YMSCDW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(YSXM00==null?"null":YSXM00, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FYT_JZQKJL_CARDNO==null?"null":FYT_JZQKJL_CARDNO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LASTTIME==null?"null":LASTTIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(KYHL==null?"null":KYHL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCULATION_OPINION==null?"null":INOCULATION_OPINION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MANAGEDEPART==null?"null":MANAGEDEPART, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VACCINETYPE==null?"null":VACCINETYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HOUSEHOLDTYPE==null?"null":HOUSEHOLDTYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DOSE==null?"null":DOSE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REGULATORYCODE==null?"null":REGULATORYCODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VALIDDATE==null?"null":VALIDDATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCCOUNTYGB==null?"null":INOCCOUNTYGB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCSITEGB==null?"null":INOCSITEGB, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCPARTID==null?"null":INOCPARTID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(INOCMODEID==null?"null":INOCMODEID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EQUIINJECTION==null?"null":EQUIINJECTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATEDATE==null?"null":CREATEDATE, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 59, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CARDNO = null; } else {
      this.CARDNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.JZCS00 = null; } else {
      this.JZCS00 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JZYMBH = null; } else {
      this.JZYMBH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NEDSORT = null; } else {
      this.NEDSORT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BEGINDATE = null; } else {
      this.BEGINDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BH0000 = null; } else {
      this.BH0000 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BZ000 = null; } else {
      this.BZ000 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DJRQI0 = null; } else {
      this.DJRQI0 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DJYSXM = null; } else {
      this.DJYSXM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FWDZHI = null; } else {
      this.FWDZHI = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JZFS00 = null; } else {
      this.JZFS00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JZSJ00 = null; } else {
      this.JZSJ00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRINT1 = null; } else {
      this.PRINT1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLAG = null; } else {
      this.SFLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLAG1 = null; } else {
      this.SFLAG1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLAG2 = null; } else {
      this.SFLAG2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLG2 = null; } else {
      this.SFLG2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMGG00 = null; } else {
      this.YMGG00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMGYDW = null; } else {
      this.YMGYDW = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMPH00 = null; } else {
      this.YMPH00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMSCDW = null; } else {
      this.YMSCDW = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YSXM00 = null; } else {
      this.YSXM00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FYT_JZQKJL_CARDNO = null; } else {
      this.FYT_JZQKJL_CARDNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LASTTIME = null; } else {
      this.LASTTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.KYHL = null; } else {
      this.KYHL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INOCULATION_OPINION = null; } else {
      this.INOCULATION_OPINION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MANAGEDEPART = null; } else {
      this.MANAGEDEPART = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VACCINETYPE = null; } else {
      this.VACCINETYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOUSEHOLDTYPE = null; } else {
      this.HOUSEHOLDTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DOSE = null; } else {
      this.DOSE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REGULATORYCODE = null; } else {
      this.REGULATORYCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VALIDDATE = null; } else {
      this.VALIDDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCCOUNTYGB = null; } else {
      this.INOCCOUNTYGB = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCSITEGB = null; } else {
      this.INOCSITEGB = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCPARTID = null; } else {
      this.INOCPARTID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCMODEID = null; } else {
      this.INOCMODEID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EQUIINJECTION = null; } else {
      this.EQUIINJECTION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREATEDATE = null; } else {
      this.CREATEDATE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CARDNO = null; } else {
      this.CARDNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.JZCS00 = null; } else {
      this.JZCS00 = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JZYMBH = null; } else {
      this.JZYMBH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NEDSORT = null; } else {
      this.NEDSORT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BEGINDATE = null; } else {
      this.BEGINDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BH0000 = null; } else {
      this.BH0000 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BZ000 = null; } else {
      this.BZ000 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DJRQI0 = null; } else {
      this.DJRQI0 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DJYSXM = null; } else {
      this.DJYSXM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FWDZHI = null; } else {
      this.FWDZHI = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JZFS00 = null; } else {
      this.JZFS00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JZSJ00 = null; } else {
      this.JZSJ00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PRINT1 = null; } else {
      this.PRINT1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLAG = null; } else {
      this.SFLAG = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLAG1 = null; } else {
      this.SFLAG1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLAG2 = null; } else {
      this.SFLAG2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SFLG2 = null; } else {
      this.SFLG2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMGG00 = null; } else {
      this.YMGG00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMGYDW = null; } else {
      this.YMGYDW = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMPH00 = null; } else {
      this.YMPH00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YMSCDW = null; } else {
      this.YMSCDW = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.YSXM00 = null; } else {
      this.YSXM00 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FYT_JZQKJL_CARDNO = null; } else {
      this.FYT_JZQKJL_CARDNO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LASTTIME = null; } else {
      this.LASTTIME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.KYHL = null; } else {
      this.KYHL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.INOCULATION_OPINION = null; } else {
      this.INOCULATION_OPINION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MANAGEDEPART = null; } else {
      this.MANAGEDEPART = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VACCINETYPE = null; } else {
      this.VACCINETYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HOUSEHOLDTYPE = null; } else {
      this.HOUSEHOLDTYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DOSE = null; } else {
      this.DOSE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REGULATORYCODE = null; } else {
      this.REGULATORYCODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.VALIDDATE = null; } else {
      this.VALIDDATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCCOUNTYGB = null; } else {
      this.INOCCOUNTYGB = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCSITEGB = null; } else {
      this.INOCSITEGB = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCPARTID = null; } else {
      this.INOCPARTID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.INOCMODEID = null; } else {
      this.INOCMODEID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EQUIINJECTION = null; } else {
      this.EQUIINJECTION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREATEDATE = null; } else {
      this.CREATEDATE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    FYT_JZQKJL o = (FYT_JZQKJL) super.clone();
    return o;
  }

  public void clone0(FYT_JZQKJL o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("CARDNO", this.CARDNO);
    __sqoop$field_map.put("JZCS00", this.JZCS00);
    __sqoop$field_map.put("JZYMBH", this.JZYMBH);
    __sqoop$field_map.put("NEDSORT", this.NEDSORT);
    __sqoop$field_map.put("BEGINDATE", this.BEGINDATE);
    __sqoop$field_map.put("BH0000", this.BH0000);
    __sqoop$field_map.put("BZ000", this.BZ000);
    __sqoop$field_map.put("DJRQI0", this.DJRQI0);
    __sqoop$field_map.put("DJYSXM", this.DJYSXM);
    __sqoop$field_map.put("FWDZHI", this.FWDZHI);
    __sqoop$field_map.put("JZFS00", this.JZFS00);
    __sqoop$field_map.put("JZSJ00", this.JZSJ00);
    __sqoop$field_map.put("PRINT1", this.PRINT1);
    __sqoop$field_map.put("SFLAG", this.SFLAG);
    __sqoop$field_map.put("SFLAG1", this.SFLAG1);
    __sqoop$field_map.put("SFLAG2", this.SFLAG2);
    __sqoop$field_map.put("SFLG2", this.SFLG2);
    __sqoop$field_map.put("YMGG00", this.YMGG00);
    __sqoop$field_map.put("YMGYDW", this.YMGYDW);
    __sqoop$field_map.put("YMPH00", this.YMPH00);
    __sqoop$field_map.put("YMSCDW", this.YMSCDW);
    __sqoop$field_map.put("YSXM00", this.YSXM00);
    __sqoop$field_map.put("FYT_JZQKJL_CARDNO", this.FYT_JZQKJL_CARDNO);
    __sqoop$field_map.put("LASTTIME", this.LASTTIME);
    __sqoop$field_map.put("KYHL", this.KYHL);
    __sqoop$field_map.put("INOCULATION_OPINION", this.INOCULATION_OPINION);
    __sqoop$field_map.put("MANAGEDEPART", this.MANAGEDEPART);
    __sqoop$field_map.put("VACCINETYPE", this.VACCINETYPE);
    __sqoop$field_map.put("HOUSEHOLDTYPE", this.HOUSEHOLDTYPE);
    __sqoop$field_map.put("DOSE", this.DOSE);
    __sqoop$field_map.put("REGULATORYCODE", this.REGULATORYCODE);
    __sqoop$field_map.put("VALIDDATE", this.VALIDDATE);
    __sqoop$field_map.put("INOCCOUNTYGB", this.INOCCOUNTYGB);
    __sqoop$field_map.put("INOCSITEGB", this.INOCSITEGB);
    __sqoop$field_map.put("INOCPARTID", this.INOCPARTID);
    __sqoop$field_map.put("INOCMODEID", this.INOCMODEID);
    __sqoop$field_map.put("EQUIINJECTION", this.EQUIINJECTION);
    __sqoop$field_map.put("CREATEDATE", this.CREATEDATE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("CARDNO", this.CARDNO);
    __sqoop$field_map.put("JZCS00", this.JZCS00);
    __sqoop$field_map.put("JZYMBH", this.JZYMBH);
    __sqoop$field_map.put("NEDSORT", this.NEDSORT);
    __sqoop$field_map.put("BEGINDATE", this.BEGINDATE);
    __sqoop$field_map.put("BH0000", this.BH0000);
    __sqoop$field_map.put("BZ000", this.BZ000);
    __sqoop$field_map.put("DJRQI0", this.DJRQI0);
    __sqoop$field_map.put("DJYSXM", this.DJYSXM);
    __sqoop$field_map.put("FWDZHI", this.FWDZHI);
    __sqoop$field_map.put("JZFS00", this.JZFS00);
    __sqoop$field_map.put("JZSJ00", this.JZSJ00);
    __sqoop$field_map.put("PRINT1", this.PRINT1);
    __sqoop$field_map.put("SFLAG", this.SFLAG);
    __sqoop$field_map.put("SFLAG1", this.SFLAG1);
    __sqoop$field_map.put("SFLAG2", this.SFLAG2);
    __sqoop$field_map.put("SFLG2", this.SFLG2);
    __sqoop$field_map.put("YMGG00", this.YMGG00);
    __sqoop$field_map.put("YMGYDW", this.YMGYDW);
    __sqoop$field_map.put("YMPH00", this.YMPH00);
    __sqoop$field_map.put("YMSCDW", this.YMSCDW);
    __sqoop$field_map.put("YSXM00", this.YSXM00);
    __sqoop$field_map.put("FYT_JZQKJL_CARDNO", this.FYT_JZQKJL_CARDNO);
    __sqoop$field_map.put("LASTTIME", this.LASTTIME);
    __sqoop$field_map.put("KYHL", this.KYHL);
    __sqoop$field_map.put("INOCULATION_OPINION", this.INOCULATION_OPINION);
    __sqoop$field_map.put("MANAGEDEPART", this.MANAGEDEPART);
    __sqoop$field_map.put("VACCINETYPE", this.VACCINETYPE);
    __sqoop$field_map.put("HOUSEHOLDTYPE", this.HOUSEHOLDTYPE);
    __sqoop$field_map.put("DOSE", this.DOSE);
    __sqoop$field_map.put("REGULATORYCODE", this.REGULATORYCODE);
    __sqoop$field_map.put("VALIDDATE", this.VALIDDATE);
    __sqoop$field_map.put("INOCCOUNTYGB", this.INOCCOUNTYGB);
    __sqoop$field_map.put("INOCSITEGB", this.INOCSITEGB);
    __sqoop$field_map.put("INOCPARTID", this.INOCPARTID);
    __sqoop$field_map.put("INOCMODEID", this.INOCMODEID);
    __sqoop$field_map.put("EQUIINJECTION", this.EQUIINJECTION);
    __sqoop$field_map.put("CREATEDATE", this.CREATEDATE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("CARDNO".equals(__fieldName)) {
      this.CARDNO = (String) __fieldVal;
    }
    else    if ("JZCS00".equals(__fieldName)) {
      this.JZCS00 = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("JZYMBH".equals(__fieldName)) {
      this.JZYMBH = (String) __fieldVal;
    }
    else    if ("NEDSORT".equals(__fieldName)) {
      this.NEDSORT = (String) __fieldVal;
    }
    else    if ("BEGINDATE".equals(__fieldName)) {
      this.BEGINDATE = (String) __fieldVal;
    }
    else    if ("BH0000".equals(__fieldName)) {
      this.BH0000 = (String) __fieldVal;
    }
    else    if ("BZ000".equals(__fieldName)) {
      this.BZ000 = (String) __fieldVal;
    }
    else    if ("DJRQI0".equals(__fieldName)) {
      this.DJRQI0 = (String) __fieldVal;
    }
    else    if ("DJYSXM".equals(__fieldName)) {
      this.DJYSXM = (String) __fieldVal;
    }
    else    if ("FWDZHI".equals(__fieldName)) {
      this.FWDZHI = (String) __fieldVal;
    }
    else    if ("JZFS00".equals(__fieldName)) {
      this.JZFS00 = (String) __fieldVal;
    }
    else    if ("JZSJ00".equals(__fieldName)) {
      this.JZSJ00 = (String) __fieldVal;
    }
    else    if ("PRINT1".equals(__fieldName)) {
      this.PRINT1 = (String) __fieldVal;
    }
    else    if ("SFLAG".equals(__fieldName)) {
      this.SFLAG = (String) __fieldVal;
    }
    else    if ("SFLAG1".equals(__fieldName)) {
      this.SFLAG1 = (String) __fieldVal;
    }
    else    if ("SFLAG2".equals(__fieldName)) {
      this.SFLAG2 = (String) __fieldVal;
    }
    else    if ("SFLG2".equals(__fieldName)) {
      this.SFLG2 = (String) __fieldVal;
    }
    else    if ("YMGG00".equals(__fieldName)) {
      this.YMGG00 = (String) __fieldVal;
    }
    else    if ("YMGYDW".equals(__fieldName)) {
      this.YMGYDW = (String) __fieldVal;
    }
    else    if ("YMPH00".equals(__fieldName)) {
      this.YMPH00 = (String) __fieldVal;
    }
    else    if ("YMSCDW".equals(__fieldName)) {
      this.YMSCDW = (String) __fieldVal;
    }
    else    if ("YSXM00".equals(__fieldName)) {
      this.YSXM00 = (String) __fieldVal;
    }
    else    if ("FYT_JZQKJL_CARDNO".equals(__fieldName)) {
      this.FYT_JZQKJL_CARDNO = (String) __fieldVal;
    }
    else    if ("LASTTIME".equals(__fieldName)) {
      this.LASTTIME = (String) __fieldVal;
    }
    else    if ("KYHL".equals(__fieldName)) {
      this.KYHL = (String) __fieldVal;
    }
    else    if ("INOCULATION_OPINION".equals(__fieldName)) {
      this.INOCULATION_OPINION = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("MANAGEDEPART".equals(__fieldName)) {
      this.MANAGEDEPART = (String) __fieldVal;
    }
    else    if ("VACCINETYPE".equals(__fieldName)) {
      this.VACCINETYPE = (String) __fieldVal;
    }
    else    if ("HOUSEHOLDTYPE".equals(__fieldName)) {
      this.HOUSEHOLDTYPE = (String) __fieldVal;
    }
    else    if ("DOSE".equals(__fieldName)) {
      this.DOSE = (String) __fieldVal;
    }
    else    if ("REGULATORYCODE".equals(__fieldName)) {
      this.REGULATORYCODE = (String) __fieldVal;
    }
    else    if ("VALIDDATE".equals(__fieldName)) {
      this.VALIDDATE = (String) __fieldVal;
    }
    else    if ("INOCCOUNTYGB".equals(__fieldName)) {
      this.INOCCOUNTYGB = (String) __fieldVal;
    }
    else    if ("INOCSITEGB".equals(__fieldName)) {
      this.INOCSITEGB = (String) __fieldVal;
    }
    else    if ("INOCPARTID".equals(__fieldName)) {
      this.INOCPARTID = (String) __fieldVal;
    }
    else    if ("INOCMODEID".equals(__fieldName)) {
      this.INOCMODEID = (String) __fieldVal;
    }
    else    if ("EQUIINJECTION".equals(__fieldName)) {
      this.EQUIINJECTION = (String) __fieldVal;
    }
    else    if ("CREATEDATE".equals(__fieldName)) {
      this.CREATEDATE = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("CARDNO".equals(__fieldName)) {
      this.CARDNO = (String) __fieldVal;
      return true;
    }
    else    if ("JZCS00".equals(__fieldName)) {
      this.JZCS00 = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("JZYMBH".equals(__fieldName)) {
      this.JZYMBH = (String) __fieldVal;
      return true;
    }
    else    if ("NEDSORT".equals(__fieldName)) {
      this.NEDSORT = (String) __fieldVal;
      return true;
    }
    else    if ("BEGINDATE".equals(__fieldName)) {
      this.BEGINDATE = (String) __fieldVal;
      return true;
    }
    else    if ("BH0000".equals(__fieldName)) {
      this.BH0000 = (String) __fieldVal;
      return true;
    }
    else    if ("BZ000".equals(__fieldName)) {
      this.BZ000 = (String) __fieldVal;
      return true;
    }
    else    if ("DJRQI0".equals(__fieldName)) {
      this.DJRQI0 = (String) __fieldVal;
      return true;
    }
    else    if ("DJYSXM".equals(__fieldName)) {
      this.DJYSXM = (String) __fieldVal;
      return true;
    }
    else    if ("FWDZHI".equals(__fieldName)) {
      this.FWDZHI = (String) __fieldVal;
      return true;
    }
    else    if ("JZFS00".equals(__fieldName)) {
      this.JZFS00 = (String) __fieldVal;
      return true;
    }
    else    if ("JZSJ00".equals(__fieldName)) {
      this.JZSJ00 = (String) __fieldVal;
      return true;
    }
    else    if ("PRINT1".equals(__fieldName)) {
      this.PRINT1 = (String) __fieldVal;
      return true;
    }
    else    if ("SFLAG".equals(__fieldName)) {
      this.SFLAG = (String) __fieldVal;
      return true;
    }
    else    if ("SFLAG1".equals(__fieldName)) {
      this.SFLAG1 = (String) __fieldVal;
      return true;
    }
    else    if ("SFLAG2".equals(__fieldName)) {
      this.SFLAG2 = (String) __fieldVal;
      return true;
    }
    else    if ("SFLG2".equals(__fieldName)) {
      this.SFLG2 = (String) __fieldVal;
      return true;
    }
    else    if ("YMGG00".equals(__fieldName)) {
      this.YMGG00 = (String) __fieldVal;
      return true;
    }
    else    if ("YMGYDW".equals(__fieldName)) {
      this.YMGYDW = (String) __fieldVal;
      return true;
    }
    else    if ("YMPH00".equals(__fieldName)) {
      this.YMPH00 = (String) __fieldVal;
      return true;
    }
    else    if ("YMSCDW".equals(__fieldName)) {
      this.YMSCDW = (String) __fieldVal;
      return true;
    }
    else    if ("YSXM00".equals(__fieldName)) {
      this.YSXM00 = (String) __fieldVal;
      return true;
    }
    else    if ("FYT_JZQKJL_CARDNO".equals(__fieldName)) {
      this.FYT_JZQKJL_CARDNO = (String) __fieldVal;
      return true;
    }
    else    if ("LASTTIME".equals(__fieldName)) {
      this.LASTTIME = (String) __fieldVal;
      return true;
    }
    else    if ("KYHL".equals(__fieldName)) {
      this.KYHL = (String) __fieldVal;
      return true;
    }
    else    if ("INOCULATION_OPINION".equals(__fieldName)) {
      this.INOCULATION_OPINION = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("MANAGEDEPART".equals(__fieldName)) {
      this.MANAGEDEPART = (String) __fieldVal;
      return true;
    }
    else    if ("VACCINETYPE".equals(__fieldName)) {
      this.VACCINETYPE = (String) __fieldVal;
      return true;
    }
    else    if ("HOUSEHOLDTYPE".equals(__fieldName)) {
      this.HOUSEHOLDTYPE = (String) __fieldVal;
      return true;
    }
    else    if ("DOSE".equals(__fieldName)) {
      this.DOSE = (String) __fieldVal;
      return true;
    }
    else    if ("REGULATORYCODE".equals(__fieldName)) {
      this.REGULATORYCODE = (String) __fieldVal;
      return true;
    }
    else    if ("VALIDDATE".equals(__fieldName)) {
      this.VALIDDATE = (String) __fieldVal;
      return true;
    }
    else    if ("INOCCOUNTYGB".equals(__fieldName)) {
      this.INOCCOUNTYGB = (String) __fieldVal;
      return true;
    }
    else    if ("INOCSITEGB".equals(__fieldName)) {
      this.INOCSITEGB = (String) __fieldVal;
      return true;
    }
    else    if ("INOCPARTID".equals(__fieldName)) {
      this.INOCPARTID = (String) __fieldVal;
      return true;
    }
    else    if ("INOCMODEID".equals(__fieldName)) {
      this.INOCMODEID = (String) __fieldVal;
      return true;
    }
    else    if ("EQUIINJECTION".equals(__fieldName)) {
      this.EQUIINJECTION = (String) __fieldVal;
      return true;
    }
    else    if ("CREATEDATE".equals(__fieldName)) {
      this.CREATEDATE = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
