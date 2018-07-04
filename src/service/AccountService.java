package service;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.AccountDkBankInfoReqDto;
import bean.JsonResult;
import bean.ResultCode;

public class AccountService {

	/**
	 * 修改重新浅语代扣银行卡信息(修改)
	 * 
	 * @param req
	 * @return
	 * @create_time 2018年5月31日 下午1:01:29
	 */
	public static JsonResult<AccountDkBankInfoReqDto> saveBankInfoforht(boolean b) {
		try {

			if (b) {
				AccountDkBankInfoReqDto reqDto = new AccountDkBankInfoReqDto();
				reqDto.setBankAccount("66227002551360533782");
				reqDto.setBankName("光大银行");
				reqDto.setCerdNo("314181199502255324");
				reqDto.setName("阿三");
				reqDto.setPhone("18533225657");
				return JsonResult.ok(reqDto, "恭喜你怀孕了");
			} else {
				return JsonResult.error(ResultCode.SERVICE_ERROR, "开饭了,老铁，别墨迹~");
			}

		} catch (Exception e) {

			return JsonResult.error(ResultCode.SERVICE_ERROR, "注册失败");
		}
	}
}
