package resume.service.impl;

import org.apache.commons.lang.WordUtils;
import org.springframework.stereotype.Service;

import resume.service.NameService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Service
public class NameServiceImpl implements NameService{

	@Override
	public String convertName(String name) {
		if(name.contains("-")) {
			String[] parts = name.split("-");
			return WordUtils.capitalize(parts[0]) + " " + WordUtils.capitalize(parts[1]);
		}
		return WordUtils.capitalize(name);
	}

	@Override
	public String convertDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(date);
	}

}
