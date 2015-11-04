package com.zhite.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RequestHelper {
	private static final Log log = LogFactory.getLog(RequestHelper.class);
	public static long getLong(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return 0;
		}
		return Long.parseLong(tempStr);
	}
	public static Long getLongNull(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return null;
		}
		return Long.parseLong(tempStr);
	}
	public static String getString(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return "";
		}
		return tempStr.trim();

	}

	public static int getInt(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return 0;
		}
		return Integer.parseInt(tempStr);
	}

	public static double getDouble(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return 0;
		}
		return Double.parseDouble(tempStr);
	}

	public static float getFloat(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return 0;
		}
		return Float.parseFloat(tempStr);
	}

	public static Date getDate(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return null;
		}
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(tempStr);
		} catch (Exception e) {
			return null;
		}
	}

	public static Calendar getCalendar(HttpServletRequest request, String paraName) {
		Date date = getDate(request,paraName);
		Calendar cal = Calendar.getInstance();
		if(date!=null){
			cal.setTime(date);
		}else{
			cal=null;
		}
		return cal;
	}

	public static boolean getBoolean(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (tempStr == null) {
			return false;
		}
		tempStr = tempStr.trim();
		if ("true".equalsIgnoreCase(tempStr) || "1".equals(tempStr)) {
			return true;
		}
		return false;
	}

	public static Boolean getBooleanNull(HttpServletRequest request, String paraName) {
		String tempStr = request.getParameter(paraName);
		if (StringUtils.isBlank(tempStr)) {
			return null;
		}
		tempStr = tempStr.trim();
		if ("true".equalsIgnoreCase(tempStr) || "1".equals(tempStr)) {
			return true;
		}
		return false;
	}

	public static Double[] getDoubleNullArray(HttpServletRequest request, String paraName){
		String tempStrArray[] = request.getParameterValues(paraName);
		if (tempStrArray==null || tempStrArray.length==0){
			return null;
		}
		Double []valueArray = new Double[tempStrArray.length];
		for(int i=0;i<tempStrArray.length;i++){
			if (StringUtils.isBlank(tempStrArray[i])){
				valueArray[i]=null;
			}else{
				valueArray[i] = Double.parseDouble(tempStrArray[i].trim());
			}
		}
		return valueArray;
	}

	public static Long[] getLongNullArray(HttpServletRequest request, String paraName){
		String tempStrArray[] = request.getParameterValues(paraName);
		if (tempStrArray==null || tempStrArray.length==0){
			return null;
		}
		Long []valueArray = new Long[tempStrArray.length];
		for(int i=0;i<tempStrArray.length;i++){
			if (StringUtils.isBlank(tempStrArray[i])){
				valueArray[i]=null;
			}else{
				valueArray[i] = Long.parseLong(tempStrArray[i].trim());
			}
		}
		return valueArray;
	}

	public static long[] getLongArray(HttpServletRequest request, String paraName){
		String tempStrArray[] = request.getParameterValues(paraName);
		if (tempStrArray==null || tempStrArray.length==0){
			return null;
		}
		long []valueArray = new long[tempStrArray.length];
		for(int i=0;i<tempStrArray.length;i++){
			if (StringUtils.isBlank(tempStrArray[i])){
				valueArray[i]=0;
			}else{
				valueArray[i] = Long.parseLong(tempStrArray[i].trim());
			}
		}
		return valueArray;
	}

	public static String[] getStringArray(HttpServletRequest request, String paraName){
		String tempStrArray[] = request.getParameterValues(paraName);
		if (tempStrArray==null || tempStrArray.length==0){
			return null;
		}
		for(int i=0;i<tempStrArray.length;i++){
			if (StringUtils.isBlank(tempStrArray[i])){
				tempStrArray[i]="";
			}else{
				tempStrArray[i]=tempStrArray[i].trim();
			}
		}
		return tempStrArray;
	}

	@SuppressWarnings("rawtypes")
	public static void printAllRequestParameter(HttpServletRequest request) {
		if (log.isTraceEnabled()) {
			Enumeration en = request.getParameterNames();
			String parameterName = null;
			System.out.println("<------------------print parameter begin----------------------->");
			String valueArray[] = null;
			while (en.hasMoreElements()) {
				parameterName = (String) en.nextElement();
				valueArray = request.getParameterValues(parameterName);
				for (String vlaue : valueArray){
					System.out.println(parameterName + "="
							+ vlaue);
				}
			}
			System.out.println("<------------------print parameter end------------------------->");
		}
	}

	@SuppressWarnings("rawtypes")
	public static void printAllHeaders(HttpServletRequest request) {
		if (log.isTraceEnabled()) {
			Enumeration en = request.getHeaderNames();
			String headerName = null;
			System.out.println("<------------------print header begin----------------------->");
			Enumeration valueArray = null;
			String value = null;
			while (en.hasMoreElements()) {
				headerName = (String) en.nextElement();
				valueArray = request.getHeaders(headerName);
				while(valueArray.hasMoreElements()){
					value = (String)valueArray.nextElement();
					System.out.println(headerName + "="
							+ value);
				}
			}
			System.out.println("<------------------print header end------------------------->");
		}
	}
}

