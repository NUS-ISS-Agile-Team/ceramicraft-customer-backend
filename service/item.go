package service

import "github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/repository/dao"

type ItemService struct {
	itemDao dao.ItemDao
}

func GetItemService(itd dao.ItemDao) *ItemService {
	return &ItemService{
		itemDao: itd,
	}
}
func (is *ItemService) GetItemList() (resp interface{}, err error) {
	itemList, err := is.itemDao.GetItemList()
	if err != nil {
		return nil, err
	}
	return itemList, nil
}
