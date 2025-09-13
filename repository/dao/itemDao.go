package dao

import (
	"sync"

	db "github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/repository"
	"github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/repository/model"
)

type ItemDao interface {
	GetItemList() ([]*model.Item, error)
}

type ItemDaoImpl struct{}

var once sync.Once
var itemDao *ItemDaoImpl

func GetItemDao() *ItemDaoImpl {
	once.Do(func() {
		itemDao = &ItemDaoImpl{}
	})
	return itemDao
}

func (i *ItemDaoImpl) GetItemList() ([]*model.Item, error) {
	var itemList []*model.Item
	err := db.DB.Raw("SELECT * FROM items").Scan(&itemList).Error
	if err != nil {
		return nil, err
	}
	return itemList, nil
}
