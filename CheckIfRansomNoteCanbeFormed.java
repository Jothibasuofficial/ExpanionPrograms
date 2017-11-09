public boolean CheckIfRansomNoteCanbeFormed(String mag, String note,
			Map<Character, Integer> in) {
		if(mag==null&&note==null)
		return true;
		if(mag==null )
		return false;
		if(note == null)
		return true;
	boolean flag = true;
	for(int i = 0 ; i < mag.length(); i ++){
		if( null != in.get(mag.charAt(i)))
			in.put(mag.charAt(i),in.get(mag.charAt(i)) + 1);
		else
			in.put(mag.charAt(i),1);
		
	}

	for(int i = 0 ; i < note.length(); i ++){
		if( null == in.get(note.charAt(i)) || 0 == in.get(note.charAt(i))){		
			flag = false;
			break;
		}else
			in.put(note.charAt(i),in.get(note.charAt(i)) - 1 );
				
	}

	return flag;
    }
