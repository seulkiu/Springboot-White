package site.metacoding.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // 없으면 Json으로 컨버팅이 안됨
@AllArgsConstructor
public class RespDto<T> {
	private Integer code; // -1실패, 1성공
	private String msg; // 성공이든 실패든 통신 결과 메시지로 담기
	private T body;
}
