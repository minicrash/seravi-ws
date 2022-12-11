package com.seraviws.mapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class BaseMapper {

	public static String formatDate(Date date) {
		if (date != null) {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			return format.format(date);
		} else {
			return "";
		}
	}

	public static List<String> splitImages(String images) {
		if (images != null) {
			return Arrays.stream(images.split(";")).toList();
		} else {
			return Collections.emptyList();
		}
	}

}
