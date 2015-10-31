package com.importNew.utils;

import java.io.StringReader;
import java.io.StringWriter;
 
import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
 
public class XmlFormat {
 
    public static String format(String str) throws Exception {
        SAXReader reader = new SAXReader();
        // System.out.println(reader);
        // ע�ͣ�����һ�������ַ�������
        StringReader in = new StringReader(str);
        Document doc = reader.read(in);
        // System.out.println(doc.getRootElement());
        // ע�ͣ����������ʽ
        OutputFormat formater = OutputFormat.createPrettyPrint();
        //formater=OutputFormat.createCompactFormat();
        // ע�ͣ�����xml���������
        formater.setEncoding("utf-8");
        // ע�ͣ��������(Ŀ��)
        StringWriter out = new StringWriter();
        // ע�ͣ����������
        XMLWriter writer = new XMLWriter(out, formater);
        // ע�ͣ������ʽ���Ĵ���Ŀ���У�ִ�к󡣸�ʽ����Ĵ�������out�С�
        writer.write(doc);
 
        writer.close();
        System.out.println(out.toString());
        // ע�ͣ��������Ǹ�ʽ����Ľ��
        return out.toString();
    }
 
    public static void main(String[] args) throws Exception {
        String head="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        String str = "<RequestData><HeadData><UserCode>sh1_admin</UserCode><UserName>sh1_admin</UserName><UserCompanyCode>3107</UserCompanyCode><UserCompanyName>�Ϻ��ֹ�˾һ��</UserCompanyName><RequestType>03</RequestType></HeadData><BodyData><ReportId>113100000033</ReportId><Insurant>a5rfg87</Insurant><NumberPlate>��E78612</NumberPlate><EngineModel></EngineModel><CarVin></CarVin><AccidentDate>2011-02-25 15:07:00</AccidentDate><ReportDate>2011-02-25 15:07:00</ReportDate><Province>310000</Province><City>310100</City><District></District><AccidentPlace>1</AccidentPlace><AccidentLongitude></AccidentLongitude><AccidentLatitude></AccidentLatitude><SurveyLongitude></SurveyLongitude><SurveyLatitude></SurveyLatitude><SceneReportFlag></SceneReportFlag><Reporter></Reporter><ReporterTel></ReporterTel><SurveyPlace></SurveyPlace><OperatorId>3525</OperatorId><OperatorName>sh_admin</OperatorName><ReportDealId>30000800</ReportDealId><ReportDealName>���շֹ�˾</ReportDealName><CompanyName></CompanyName><CustomerTypeCode></CustomerTypeCode><ForcePolicyId>a5rfg87a5rfg87a5rfg87</ForcePolicyId><BizPolicyId></BizPolicyId><Index>0</Index><FieldName>5</FieldName></BodyData></RequestData>";
        // System.out.println(str);
        format(str);
    }
 
}
